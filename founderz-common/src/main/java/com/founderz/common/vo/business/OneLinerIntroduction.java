package com.founderz.common.vo.business;

import com.fasterxml.jackson.annotation.JsonValue;
import com.founderz.common.vo.ValueObject;

import static com.founderz.common.assertion.AssertionUtils.assertArgumentNotEmpty;
import static com.founderz.common.assertion.AssertionUtils.assertArgumentLength;

public record OneLinerIntroduction(
        @JsonValue
        String oneLinerIntroduction
) implements ValueObject.StringValueObject {
        
    public OneLinerIntroduction {
        assertArgumentNotEmpty(oneLinerIntroduction, "소개가 입력되지 않았습니다.");
        assertArgumentLength(oneLinerIntroduction, 3, 100, "소개는 3~100자로 입력되어야 합니다.");
    }

    public static OneLinerIntroduction create(final String oneLinerIntroduction) {
        return new OneLinerIntroduction(oneLinerIntroduction);
    }
}

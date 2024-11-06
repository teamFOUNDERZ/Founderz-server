package com.founderz.common.vo.business;

import com.fasterxml.jackson.annotation.JsonValue;
import com.founderz.common.vo.ValueObject;

import static com.founderz.common.assertion.AssertionUtils.*;

public record BusinessIntroduction(
        @JsonValue
        String introduction
) implements ValueObject.StringValueObject {
    public BusinessIntroduction {
        assertArgumentNotEmpty(introduction, "소개가 입력되지 않았습니다.");
        assertArgumentLength(introduction, "소개는 50~1000자로 입력되어야 합니다.");
    }

    public static BusinessIntroduction create(final String introduction) {
        return new BusinessIntroduction(introduction);
    }
}
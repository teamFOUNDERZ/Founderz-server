package com.founderz.common.vo.business;

import com.fasterxml.jackson.annotation.JsonValue;
import com.founderz.common.vo.ValueObject;

public record InvestmentAmount(
        @JsonValue
        Long investmentAmount
) implements ValueObject.LongValueObject {
    public InvestmentAmount() {
        this(0L);
    }

    public static InvestmentAmount create() {
        return new InvestmentAmount();
    }

    public static InvestmentAmount create(final Long investmentAmount) {
        return new InvestmentAmount(investmentAmount);
    }
}

package com.founderz.common.vo.business;

import com.fasterxml.jackson.annotation.JsonValue;
import com.founderz.common.crypto.CryptoUtils;
import com.founderz.common.vo.ValueObject;

public record BusinessId(
        @JsonValue
        Long businessId
) implements ValueObject.LongValueObject {
    public static BusinessId create(final Long userId) {
        return new BusinessId(userId);
    }

    public SecuredBusinessId toSecureBusinessId() {
        return new SecuredBusinessId(CryptoUtils.encrypt(businessId));
    }
}

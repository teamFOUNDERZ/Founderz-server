package com.founderz.common.vo;

import com.fasterxml.jackson.annotation.JsonValue;
import com.founderz.common.crypto.CryptoUtils;

public record UserId(
        @JsonValue
        Long id
) implements ValueObject {
    public SecuredUserId toSecureUserId() {
        return new SecuredUserId(CryptoUtils.encrypt(id));
    }
}

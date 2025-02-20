package com.founderz.internal.data.user;

import com.founderz.common.vo.user.AccountId;
import com.founderz.common.vo.user.AccountName;
import com.founderz.common.vo.user.AccountType;
import com.founderz.common.vo.user.MyMoney;
import com.founderz.common.vo.user.PhoneNumber;
import com.founderz.common.vo.user.UserId;

public record CurrentUserInfo(
        UserId userId,
        AccountId accountId,
        AccountName name,
        MyMoney myMoney,
        AccountType type,
        PhoneNumber phoneNumber
) {
}

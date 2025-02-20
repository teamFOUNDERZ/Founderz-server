package com.founderz.internal.data.business;

import com.founderz.common.vo.business.BusinessId;
import com.founderz.common.vo.business.BusinessIntroduction;
import com.founderz.common.vo.business.BusinessName;
import com.founderz.common.vo.business.InvestmentAmount;
import com.founderz.common.vo.business.OneLineIntroduction;
import com.founderz.common.vo.business.Vision;
import com.founderz.common.vo.business.WritePurpose;
import com.founderz.common.vo.user.AccountId;

public record BusinessDto(
        BusinessId businessId,
        BusinessName businessName,
        OneLineIntroduction oneLineIntroduction,
        BusinessIntroduction businessIntroduction,
        Vision vision,
        WritePurpose writePurpose,
        InvestmentAmount investmentAmount,
        AccountId writerAccountId
) {
    public BusinessDto {
        if (investmentAmount == null) {
            investmentAmount = InvestmentAmount.create();
        }
    }

    public BusinessDto setWriterAccountId(AccountId writerAccountId) {
        return new BusinessDto(
                businessId,
                businessName,
                oneLineIntroduction,
                businessIntroduction,
                vision,
                writePurpose,
                investmentAmount,
                writerAccountId
        );
    }
}
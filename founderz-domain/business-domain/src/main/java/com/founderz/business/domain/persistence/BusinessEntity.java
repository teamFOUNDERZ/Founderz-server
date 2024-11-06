package com.founderz.business.domain.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "founderz_business_v1")
class BusinessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String businessName;

    @Column(nullable = false, length = 100)
    private String oneLineIntroduction;

    @Column(nullable = false, length = 1000)
    private String businessIntroduction;

    @Column(nullable = false, length = 50)
    private String vision;

    @Column(nullable = false, length = 100)
    private String writingPurpose;

    @Column(nullable = false)
    private Long InvestmentAmount;

    @Column(nullable = false, unique = true, length = 20)
    private String writerAccountId;
}

package com.bytecode.domain.creditscore;

import lombok.Getter;

@Getter
public enum CreditProfile {

    RAA(400), // 400
    RA(1200), // 1200
    RG(3000), // 3000
    RB(10000), // 10000
    RBB(100000), // 100000
    NR(1000000); // 1000000

    private int riskLevel;
    CreditProfile(int riskLevel) {
        this.riskLevel = riskLevel;
    }
}

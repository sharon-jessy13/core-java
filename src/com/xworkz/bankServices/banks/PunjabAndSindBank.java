package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class PunjabAndSindBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("Punjab & Sind Bank verifies customer KYC documents at branch counters.");
    }

    @Override
    public void pmjdy() {
        System.out.println("Punjab & Sind Bank opens PMJDY accounts to promote rural financial literacy.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Punjab & Sind Bank assists small trades with low-interest microfinance loans.");
    }

    @Override
    public void neft() {
        System.out.println("Punjab & Sind Bank executes NEFT money transfers efficiently across India.");
    }

    @Override
    public void upi() {
        System.out.println("Punjab & Sind Bank supports mobile UPI money transfers via PSB UnIC.");
    }

    @Override
    public void gms() {
        System.out.println("Punjab & Sind Bank collects gold deposits under the Government Gold Monetisation Scheme.");
    }

    @Override
    public void deaFund() {
        System.out.println("Punjab & Sind Bank transfers inoperative balances past 10 years to RBI DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("Punjab & Sind Bank facilitates affordable PMSBY insurance for all account holders.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Punjab & Sind Bank manages monthly APY contributions for subscriber pensions.");
    }

    @Override
    public void educationLoan() {
        System.out.println("Punjab & Sind Bank awards education loans under the PSB Excellence scheme.");
    }
}

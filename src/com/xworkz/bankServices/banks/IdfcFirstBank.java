package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class IdfcFirstBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("IDFC FIRST Bank conducts rapid, paperless Video KYC for quick activation.");
    }

    @Override
    public void pmjdy() {
        System.out.println("IDFC FIRST Bank implements basic savings bank deposit accounts under PMJDY.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("IDFC FIRST Bank offers micro-loans directly through digital micro-lending platforms.");
    }

    @Override
    public void neft() {
        System.out.println("IDFC FIRST Bank offers free, 24x7 NEFT transfers for all savings accounts.");
    }

    @Override
    public void upi() {
        System.out.println("IDFC FIRST Bank integrates high-speed UPI operations into its mobile app.");
    }

    @Override
    public void gms() {
        System.out.println("IDFC FIRST Bank processes gold monetization scheme deposits efficiently.");
    }

    @Override
    public void deaFund() {
        System.out.println("IDFC FIRST Bank moves unclaimed deposits after 10 years to RBI's DEA account.");
    }

    @Override
    public void pmsby() {
        System.out.println("IDFC FIRST Bank facilitates smooth digital sign-ups for PMSBY insurance.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("IDFC FIRST Bank offers digital APY onboarding for retirement security.");
    }

    @Override
    public void educationLoan() {
        System.out.println("IDFC FIRST Bank offers collateral-free education loans for higher studies.");
    }
}

package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;


public class IciciBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("ICICI Bank performs digital KYC authentication via iMobile Pay.");
    }

    @Override
    public void pmjdy() {
        System.out.println("ICICI Bank issues financial inclusion PMJDY accounts in financial hardship zones.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("ICICI Bank supports women entrepreneurs through Self Help Group microfinance.");
    }

    @Override
    public void neft() {
        System.out.println("ICICI Bank handles NEFT wire transfers round-the-clock seamlessly.");
    }

    @Override
    public void upi() {
        System.out.println("ICICI Bank manages fast UPI transactions via ICICI UPI handles.");
    }

    @Override
    public void gms() {
        System.out.println("ICICI Bank processes Gold Monetisation Scheme applications for short-term deposits.");
    }

    @Override
    public void deaFund() {
        System.out.println("ICICI Bank credits long-term dormant account funds into the RBI DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("ICICI Bank facilitates quick online auto-renewal for PMSBY accident insurance.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("ICICI Bank enables online registration for APY pension benefits.");
    }

    @Override
    public void educationLoan() {
        System.out.println("ICICI Bank grants pre-approved digital education loans for higher studies.");
    }
}

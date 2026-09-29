package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class SbiBank implements RbiBank {

    @Override
    public void kyc() {
        System.out.println("SBI requires electronic KYC and physical door-step verification.");
    }

    @Override
    public void pmjdy() {
        System.out.println("SBI provides PMJDY accounts with zero balance and built-in RuPay card.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("SBI offers MUDRA loans for small and micro businesses.");
    }

    @Override
    public void neft() {
        System.out.println("SBI processes NEFT transactions 24x7 with zero fees on digital channels.");
    }

    @Override
    public void upi() {
        System.out.println("SBI supports UPI integrated directly with the YONO app.");
    }

    @Override
    public void gms() {
        System.out.println("SBI accepts gold deposits under Gold Monetisation Scheme at designated branches.");
    }

    @Override
    public void deaFund() {
        System.out.println("SBI transfers unclaimed deposits older than 10 years to RBI's DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("SBI enrolls savings account customers into Pradhan Mantri Suraksha Bima Yojana.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("SBI facilitates monthly auto-debit pension contributions for APY subscribers.");
    }

    @Override
    public void educationLoan() {
        System.out.println("SBI provides Scholar Education Loans with low interest rates for premier institutes.");
    }
}


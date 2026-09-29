package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;


public class PnbBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("PNB updates customer KYC periodically through branch visits and online portal.");
    }

    @Override
    public void pmjdy() {
        System.out.println("PNB actively drives PMJDY financial inclusion drives in rural sectors.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("PNB offers micro-credit to street vendors under PM SVANidhi scheme.");
    }

    @Override
    public void neft() {
        System.out.println("PNB facilitates high-value electronic funds transfer via NEFT.");
    }

    @Override
    public void upi() {
        System.out.println("PNB provides secure UPI payments via PNB ONE App.");
    }

    @Override
    public void gms() {
        System.out.println("PNB accepts gold coins/bars under government-backed Gold Monetisation Scheme.");
    }

    @Override
    public void deaFund() {
        System.out.println("PNB publishes unclaimed balances annually before sending them to RBI's DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("PNB deducts Rs. 20 annual premium for PMSBY insurance coverage.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("PNB guarantees fixed monthly pension options under Atal Pension Yojana.");
    }

    @Override
    public void educationLoan() {
        System.out.println("PNB offers PNB Udaan loans for students pursuing education in India and overseas.");
    }
}

package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class KotakBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("Kotak Bank uses Kotak 811 Video KYC for 100% paperless onboarding.");
    }

    @Override
    public void pmjdy() {
        System.out.println("Kotak Bank supports PMJDY zero-balance accounts for financially underprivileged individuals.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Kotak Bank issues micro-finance credit to low-income households.");
    }

    @Override
    public void neft() {
        System.out.println("Kotak Bank enables instant electronic funds transfer over NEFT.");
    }

    @Override
    public void upi() {
        System.out.println("Kotak Bank enables instant peer-to-peer and merchant UPI payments.");
    }

    @Override
    public void gms() {
        System.out.println("Kotak Bank accepts customer gold for government-backed Gold Monetisation Scheme.");
    }

    @Override
    public void deaFund() {
        System.out.println("Kotak Bank submits details of unclaimed balances to RBI's DEA Fund portal.");
    }

    @Override
    public void pmsby() {
        System.out.println("Kotak Bank provides automated registration for the government PMSBY scheme.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Kotak Bank enables APY pension account linking through mobile banking.");
    }

    @Override
    public void educationLoan() {
        System.out.println("Kotak Bank provides customized education loan solutions with flexible payback tenures.");
    }
}

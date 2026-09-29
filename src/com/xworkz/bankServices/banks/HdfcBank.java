package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

// 2. HDFC Bank
public class HdfcBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("HDFC Bank completes KYC online via Video KYC instantly.");
    }

    @Override
    public void pmjdy() {
        System.out.println("HDFC Bank opens PMJDY accounts with basic savings bank deposit features.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("HDFC Bank delivers micro-loans to Joint Liability Groups (JLGs) in rural areas.");
    }

    @Override
    public void neft() {
        System.out.println("HDFC Bank routes NEFT payments safely through NetBanking and Mobile Banking.");
    }

    @Override
    public void upi() {
        System.out.println("HDFC Bank powers UPI payments via PayZapp and third-party UPI apps.");
    }

    @Override
    public void gms() {
        System.out.println("HDFC Bank allows customers to deposit physical gold under Gold Monetisation Scheme.");
    }

    @Override
    public void deaFund() {
        System.out.println("HDFC Bank reports inactive accounts to RBI DEA Fund as per regulatory norms.");
    }

    @Override
    public void pmsby() {
        System.out.println("HDFC Bank offers annual accidental insurance cover under PMSBY scheme.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("HDFC Bank manages enrollment and auto-deductions for APY pension plans.");
    }

    @Override
    public void educationLoan() {
        System.out.println("HDFC Bank offers study abroad education loans with collateral options.");
    }
}

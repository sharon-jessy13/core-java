package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;


public class AxisBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("Axis Bank carries out re-KYC digitally using official valid documents.");
    }

    @Override
    public void pmjdy() {
        System.out.println("Axis Bank provides PMJDY savings accounts with RuPay debit cards.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Axis Bank empowers micro-entrepreneurs via collateral-free loans.");
    }

    @Override
    public void neft() {
        System.out.println("Axis Bank processes interbank NEFT settlements continuously.");
    }

    @Override
    public void upi() {
        System.out.println("Axis Bank operates as a primary UPI partner bank for multiple payment gateways.");
    }

    @Override
    public void gms() {
        System.out.println("Axis Bank facilitates gold refining and interest payments under GMS.");
    }

    @Override
    public void deaFund() {
        System.out.println("Axis Bank remits ten-year-old inactive deposits into the RBI DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("Axis Bank provides accidental disability cover under PMSBY.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Axis Bank sets up APY pension contributions directly through Internet Banking.");
    }

    @Override
    public void educationLoan() {
        System.out.println("Axis Bank funds up to 100% of education expenses for top institutions.");
    }
}

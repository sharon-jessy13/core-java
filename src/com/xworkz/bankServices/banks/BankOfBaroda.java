package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;


public class BankOfBaroda implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("Bank of Baroda implements Aadhaar-based OTP and biometric KYC.");
    }

    @Override
    public void pmjdy() {
        System.out.println("Bank of Baroda extends overdraft facility up to Rs. 10,000 to eligible PMJDY account holders.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Bank of Baroda funds micro-enterprises with specialized Bob Micro Credit schemes.");
    }

    @Override
    public void neft() {
        System.out.println("Bank of Baroda routes NEFT batches every half hour.");
    }

    @Override
    public void upi() {
        System.out.println("Bank of Baroda offers real-time UPI transfers via bob World.");
    }

    @Override
    public void gms() {
        System.out.println("Bank of Baroda enables short and medium-term gold deposits under GMS.");
    }

    @Override
    public void deaFund() {
        System.out.println("Bank of Baroda complies with RBI guidelines regarding DEA Fund transfers for inoperative accounts.");
    }

    @Override
    public void pmsby() {
        System.out.println("Bank of Baroda supports automated annual debits for PMSBY subscribers.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Bank of Baroda guides unorganized sector workers to enroll in APY.");
    }

    @Override
    public void educationLoan() {
        System.out.println("Bank of Baroda grants premier college education loans with zero processing fees.");
    }
}

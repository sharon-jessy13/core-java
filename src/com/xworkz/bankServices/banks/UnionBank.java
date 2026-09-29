package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class UnionBank implements RbiBank {
    @Override
    public void kyc() {
        System.out.println("Union Bank performs central CKYC registration for all new account holders.");
    }

    @Override
    public void pmjdy() {
        System.out.println("Union Bank distributes PMJDY social security benefits directly into account balances.");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Union Bank supports rural agriculture and micro-enterprises with soft loans.");
    }

    @Override
    public void neft() {
        System.out.println("Union Bank manages fast electronic credit transfers through NEFT batch processing.");
    }

    @Override
    public void upi() {
        System.out.println("Union Bank offers seamless UPI features using Vyom app.");
    }

    @Override
    public void gms() {
        System.out.println("Union Bank earns customers interest on idle gold under the GMS scheme.");
    }

    @Override
    public void deaFund() {
        System.out.println("Union Bank transfers unclaimed savings/current balances to the RBI DEA Fund.");
    }

    @Override
    public void pmsby() {
        System.out.println("Union Bank assists rural and urban customers in enrolling for PMSBY.");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Union Bank collects pension contributions under APY for citizens aged 18-40.");
    }

    @Override
    public void educationLoan() {
        System.out.println("Union Bank provides Union Education loans covering tuition fees, hostel, and books.");
    }
}

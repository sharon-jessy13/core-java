package com.xworkz.bankServices.banks;

import com.xworkz.bankServices.rbi.RbiBank;

public class CanaraBank implements RbiBank {
    @Override
    public void kyc(){
        System.out.println("canara Bank implementing the kyc in their bank");
    }
    @Override
    public void pmjdy() {
        System.out.println("Canara Bank implementing the pmjdy in their bank");
    }

    @Override
    public void microfinanceLoans() {
        System.out.println("Canara Bank implementing the microfinanceLoans in their bank");
    }

    @Override
    public void neft() {
        System.out.println("Canara Bank implementing the neft in their bank");
    }

    @Override
    public void upi() {
        System.out.println("Canara Bank implementing the upi in their bank");
    }

    @Override
    public void gms() {
        System.out.println("Canara Bank implementing the gms in their bank");
    }

    @Override
    public void deaFund() {
        System.out.println("Canara Bank implementing the deaFund in their bank");
    }

    @Override
    public void pmsby() {
        System.out.println("Canara Bank implementing the pmsby in their bank");
    }

    @Override
    public void atalPensionYojana() {
        System.out.println("Canara Bank implementing the atalPensionYojana in their bank");
    }

    @Override
    public void educationLoan() {
        System.out.println("Canara Bank implementing the educationLoan in their bank");
    }
}




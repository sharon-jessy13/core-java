package com.xworkz.bankServices;

import com.xworkz.bankServices.banks.*;
import com.xworkz.bankServices.rbi.RbiBank;

public class Runner {
    public static void main(String[] args) {

        System.out.println("========== STATE BANK OF INDIA ==========");
        RbiBank sbi = new SbiBank();
        sbi.kyc();
        sbi.pmjdy();
        sbi.microfinanceLoans();
        sbi.neft();
        sbi.upi();
        sbi.gms();
        sbi.deaFund();
        sbi.pmsby();
        sbi.atalPensionYojana();
        sbi.educationLoan();

        System.out.println("\n========== CANARA BANK ==========");
        RbiBank canara = new CanaraBank();
        canara.kyc();
        canara.pmjdy();
        canara.microfinanceLoans();
        canara.neft();
        canara.upi();
        canara.gms();
        canara.deaFund();
        canara.pmsby();
        canara.atalPensionYojana();
        canara.educationLoan();


        System.out.println("\n========== HDFC BANK ==========");
        RbiBank hdfc = new HdfcBank();
        hdfc.kyc();
        hdfc.pmjdy();
        hdfc.microfinanceLoans();
        hdfc.neft();
        hdfc.upi();
        hdfc.gms();
        hdfc.deaFund();
        hdfc.pmsby();
        hdfc.atalPensionYojana();
        hdfc.educationLoan();

        System.out.println("\n========== ICICI BANK ==========");
        RbiBank icici = new IciciBank();
        icici.kyc();
        icici.pmjdy();
        icici.microfinanceLoans();
        icici.neft();
        icici.upi();
        icici.gms();
        icici.deaFund();
        icici.pmsby();
        icici.atalPensionYojana();
        icici.educationLoan();

        System.out.println("\n========== PUNJAB NATIONAL BANK ==========");
        RbiBank pnb = new PnbBank();
        pnb.kyc();
        pnb.pmjdy();
        pnb.microfinanceLoans();
        pnb.neft();
        pnb.upi();
        pnb.gms();
        pnb.deaFund();
        pnb.pmsby();
        pnb.atalPensionYojana();
        pnb.educationLoan();

        System.out.println("\n========== BANK OF BARODA ==========");
        RbiBank bob = new BankOfBaroda();
        bob.kyc();
        bob.pmjdy();
        bob.microfinanceLoans();
        bob.neft();
        bob.upi();
        bob.gms();
        bob.deaFund();
        bob.pmsby();
        bob.atalPensionYojana();
        bob.educationLoan();

        System.out.println("\n========== AXIS BANK ==========");
        RbiBank axis = new AxisBank();
        axis.kyc();
        axis.pmjdy();
        axis.microfinanceLoans();
        axis.neft();
        axis.upi();
        axis.gms();
        axis.deaFund();
        axis.pmsby();
        axis.atalPensionYojana();
        axis.educationLoan();

        System.out.println("\n========== KOTAK MAHINDRA BANK ==========");
        RbiBank kotak = new KotakBank();
        kotak.kyc();
        kotak.pmjdy();
        kotak.microfinanceLoans();
        kotak.neft();
        kotak.upi();
        kotak.gms();
        kotak.deaFund();
        kotak.pmsby();
        kotak.atalPensionYojana();
        kotak.educationLoan();

        System.out.println("\n========== UNION BANK OF INDIA ==========");
        RbiBank union = new UnionBank();
        union.kyc();
        union.pmjdy();
        union.microfinanceLoans();
        union.neft();
        union.upi();
        union.gms();
        union.deaFund();
        union.pmsby();
        union.atalPensionYojana();
        union.educationLoan();

        System.out.println("\n========== IDFC FIRST BANK ==========");
        RbiBank idfc = new IdfcFirstBank();
        idfc.kyc();
        idfc.pmjdy();
        idfc.microfinanceLoans();
        idfc.neft();
        idfc.upi();
        idfc.gms();
        idfc.deaFund();
        idfc.pmsby();
        idfc.atalPensionYojana();
        idfc.educationLoan();

        System.out.println("\n========== PUNJAB & SIND BANK ==========");
        RbiBank psb = new PunjabAndSindBank();
        psb.kyc();
        psb.pmjdy();
        psb.microfinanceLoans();
        psb.neft();
        psb.upi();
        psb.gms();
        psb.deaFund();
        psb.pmsby();
        psb.atalPensionYojana();
        psb.educationLoan();
    }
}

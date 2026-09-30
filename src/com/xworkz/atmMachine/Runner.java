package com.xworkz.atmMachine;

import com.xworkz.atmMachine.banks.CanaraBank;
import com.xworkz.atmMachine.banks.SbiBank;
import com.xworkz.atmMachine.card.Card;

public class Runner {
    public static void main(String[] args) {

        Card sbi = new SbiBank();
        sbi.insert();

        Card canara = new CanaraBank();
        canara.insert();
    }
}

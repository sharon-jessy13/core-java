package com.xworkz.atmMachine.banks;

import com.xworkz.atmMachine.card.Card;

public class SbiBank implements Card {

    @Override
    public void insert() {
        System.out.println("SBI card is Inserted in Machine");
    }

    @Override
    public void swipe() {
        System.out.println("card is swiped");
    }
}

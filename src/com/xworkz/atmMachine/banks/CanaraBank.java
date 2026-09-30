package com.xworkz.atmMachine.banks;

import com.xworkz.atmMachine.card.Card;

public abstract class CanaraBank implements Card {
    @Override
    public void insert() {
        System.out.println("Canara Bank card is inserted");
    }



}

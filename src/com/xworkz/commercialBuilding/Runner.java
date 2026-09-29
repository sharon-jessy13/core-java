package com.xworkz.commercialBuilding;

import com.xworkz.commercialBuilding.building.*;

public class Runner {
    public static void main(String[] args) {

        //abtraction
        CommercialBuilding commercialBuilding = new HariSuperSandwich();

        commercialBuilding.doBusiness(); //happens during runtime

        CommercialBuilding commercialBuilding1 = new WatchShop();

        commercialBuilding1.doBusiness();


        CommercialShop clothShop = new ClothShop();
        clothShop.doBusiness();


    }
}

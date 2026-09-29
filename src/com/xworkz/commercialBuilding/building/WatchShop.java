package com.xworkz.commercialBuilding.building;

public class WatchShop implements CommercialBuilding{

    @Override
    public double doBusiness() {
        System.out.println("Running Watch business");
        return 25000.00;
    }
}

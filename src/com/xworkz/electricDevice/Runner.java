package com.xworkz.electricDevice;

import com.xworkz.electricDevice.Switch.Switch;
import com.xworkz.electricDevice.devices.*;

public class Runner {
    public static void main(String[] args) {

        Switch tubeLight = new TubeLight();
        tubeLight.on();
        tubeLight.off();

        System.out.println("--------------------");


        Switch ceilingFan = new CeilingFan();
        ceilingFan.on();
        ceilingFan.off();

        System.out.println("--------------------");


        Switch airConditioner = new AirConditioner();
        airConditioner.on();
        airConditioner.off();

        System.out.println("--------------------");


        Switch television = new Television();
        television.on();
        television.off();

        System.out.println("--------------------");


        Switch refrigerator = new Refrigerator();
        refrigerator.on();
        refrigerator.off();

        System.out.println("--------------------");


        Switch waterHeater = new WaterHeater();
        waterHeater.on();
        waterHeater.off();

        System.out.println("--------------------");


        Switch washingMachine = new WashingMachine();
        washingMachine.on();
        washingMachine.off();

        System.out.println("--------------------");


        Switch microwaveOven = new MicrowaveOven();
        microwaveOven.on();
        microwaveOven.off();

        System.out.println("--------------------");


        Switch laptop = new Laptop();
        laptop.on();
        laptop.off();

        System.out.println("--------------------");

    }
}

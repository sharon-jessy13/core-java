package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class WashingMachine implements Switch {
    @Override
    public void on() {
        System.out.println("Washing machine starts wash cycle.");
    }

    @Override
    public void off() {
        System.out.println("Washing machine cycle stopped.");
    }
}
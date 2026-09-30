package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class MicrowaveOven implements Switch {
    @Override
    public void on() {
        System.out.println("Microwave oven is heating food.");
    }

    @Override
    public void off() {
        System.out.println("Microwave oven stopped.");
    }
}
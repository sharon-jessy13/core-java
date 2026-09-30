package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class Laptop implements Switch {
    @Override
    public void on() {
        System.out.println("Laptop boots up.");
    }

    @Override
    public void off() {
        System.out.println("Laptop shuts down.");
    }
}
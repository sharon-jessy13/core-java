package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class Television implements Switch {
    @Override
    public void on() {
        System.out.println("Television screen lights up.");
    }

    @Override
    public void off() {
        System.out.println("Television enters standby mode.");
    }
}
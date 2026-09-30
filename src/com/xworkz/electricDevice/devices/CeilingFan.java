package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class CeilingFan implements Switch {
    @Override
    public void on() {
        System.out.println("Ceiling fan starts spinning.");
    }

    @Override
    public void off() {
        System.out.println("Ceiling fan stops spinning.");
    }
}
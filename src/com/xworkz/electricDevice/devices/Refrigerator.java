package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class Refrigerator implements Switch {
    @Override
    public void on() {
        System.out.println("Refrigerator compressor is running.");
    }

    @Override
    public void off() {
        System.out.println("Refrigerator compressor is stopped.");
    }
}
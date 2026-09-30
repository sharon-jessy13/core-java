package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class WaterHeater implements Switch {
    @Override
    public void on() {
        System.out.println("Water heater is heating water.");
    }

    @Override
    public void off() {
        System.out.println("Water heater is turned OFF.");
    }
}
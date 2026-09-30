package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class TubeLight implements Switch {
    @Override
    public void on() {
        System.out.println("Tube light is turned ON.");
    }

    @Override
    public void off() {
        System.out.println("Tube light is turned OFF.");
    }
}
package com.xworkz.electricDevice.devices;

import com.xworkz.electricDevice.Switch.Switch;

public class AirConditioner implements Switch {
    @Override
    public void on() {
        System.out.println("Air Conditioner is cooling the room.");
    }

    @Override
    public void off() {
        System.out.println("Air Conditioner is powered down.");
    }
}
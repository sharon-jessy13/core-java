package com.xworkzz.library.Product;

public class Fan {

    public int fanId;
    public String brand;
    public String color;
    public double price;
    public int speed;

    @Override
    public boolean equals(Object obj) {

        Fan fan = (Fan) obj;

        if (this.fanId == fan.fanId
                && this.brand.equals(fan.brand)
                && this.color.equals(fan.color)
                && this.price == fan.price
                && this.speed == fan.speed) {

            return true;
        }

        return false;
    }
}

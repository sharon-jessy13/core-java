package com.xworkzz.library.Product;

public class Light {

    public int lightId;
    public String brand;
    public String type;
    public String color;
    public double price;

    @Override
    public boolean equals(Object obj) {

        Light light = (Light) obj;

        if (this.lightId == light.lightId
                && this.brand.equals(light.brand)
                && this.type.equals(light.type)
                && this.color.equals(light.color)
                && this.price == light.price) {

            return true;
        }

        return false;
    }
}

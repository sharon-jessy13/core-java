package com.xworkzz.library.Product;

public class Podium {

    public int podiumId;
    public String material;
    public String color;
    public double price;
    public String type;

    @Override
    public boolean equals(Object obj) {

        Podium podium = (Podium) obj;

        if (this.podiumId == podium.podiumId
                && this.material.equals(podium.material)
                && this.color.equals(podium.color)
                && this.price == podium.price
                && this.type.equals(podium.type)) {

            return true;
        }

        return false;
    }
}

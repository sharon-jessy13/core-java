package com.xworkzz.library.Product;

public class Ornament {

    public int ornamentId;
    public String ornamentName;
    public String material;
    public double price;
    public String design;

    @Override
    public boolean equals(Object obj) {

        Ornament ornament = (Ornament) obj;

        if (this.ornamentId == ornament.ornamentId
                && this.ornamentName.equals(ornament.ornamentName)
                && this.material.equals(ornament.material)
                && this.price == ornament.price
                && this.design.equals(ornament.design)) {

            return true;
        }

        return false;
    }
}

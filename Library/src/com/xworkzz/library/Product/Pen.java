package com.xworkzz.library.Product;

public class Pen {

    public int penId;
    public String brand;
    public String color;
    public double price;
    public String inkType;

    @Override
    public boolean equals(Object obj) {

        Pen pen = (Pen) obj;

        if (this.penId == pen.penId
                && this.brand.equals(pen.brand)
                && this.color.equals(pen.color)
                && this.price == pen.price
                && this.inkType.equals(pen.inkType)) {

            return true;
        }

        return false;
    }
}

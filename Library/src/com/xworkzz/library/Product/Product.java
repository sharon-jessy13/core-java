package com.xworkzz.library.Product;

import java.util.Objects;

public class Product {

    private int productId;
    private String productName;
    private double price;
    private String brandName;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }



    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }



    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }



    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }




    @Override
    public boolean equals(Object obj){
        Product pro = (Product) obj; //down casting

        if (this.productId == pro.productId
                && this.productName.equals(pro.productName)
                && this.price == pro.price && this.brandName.equals(pro.brandName))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, brandName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}

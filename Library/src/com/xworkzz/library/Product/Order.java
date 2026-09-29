package com.xworkzz.library.Product;

public class Order {

    public int orderId;
    public String customerName;
    public String productName;
    public int quantity;
    public double totalAmount;

    @Override
    public boolean equals(Object obj) {

        Order order = (Order) obj;

        if (this.orderId == order.orderId
                && this.customerName.equals(order.customerName)
                && this.productName.equals(order.productName)
                && this.quantity == order.quantity
                && this.totalAmount == order.totalAmount) {

            return true;
        }

        return false;
    }
}

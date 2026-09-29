package com.xworkzz.library;

import com.xworkzz.library.Product.Product;

public class ProductRunner {
    public static void main(String[] args) {

        Product product = new Product();

        product.setProductId(1);
        int productId = product.getProductId();

        product.setProductName("Toaster");
        String productName = product.getProductName();

        product.setPrice(999.50);
        double price = product.getPrice();

        product.setBrandName("BELLA");
        String brandName = product.getBrandName();

        System.out.println(product);
        int hashone = product.hashCode();
        System.out.println(hashone);

        //--------------------------------------//
        Product product1 = new Product();

        product1.setProductId(1);
        int productIdOne = product1.getProductId();

        product1.setProductName("Toaster");
        String productNameOne = product1.getProductName();

        product1.setPrice(999.50);
        double priceOne = product1.getPrice();

        product1.setBrandName("BELLA");
        String brandNameOne = product1.getBrandName();

        System.out.println(product1);

        int hashTwo = product1.hashCode();
        System.out.println(hashTwo);
        boolean isEquals = product.equals(product1);
        System.out.println("Is product and product one is equal :" + isEquals);

        //------------------------------------------------------//

        Product product2 = new Product();

        product2.setProductId(3);
        int productIdTwo = product2.getProductId();

        product2.setProductName("Mixer");
        String productNameTwo = product2.getProductName();

        product2.setPrice(2999.50);
        double priceTwo = product2.getPrice();

        product2.setBrandName("Pegion");
        String brandNameTwo = product2.getBrandName();

        System.out.println(product2);

        //-------------------------------------------//

        Product product3 = new Product();

        product3.setProductId(4);
        int productIdThree = product3.getProductId();

        product3.setProductName("Laptop");
        String productThree = product3.getProductName();

        product3.setPrice(67999.50);
        double priceThree = product3.getPrice();

        product3.setBrandName("HP");
        String brandNameThree = product3.getBrandName();

        System.out.println(product3);

        //--------------------------------------------------//

        Product product4 = new Product();

        product4.setProductId(5);
        int productIdFour = product4.getProductId();

        product4.setProductName("Mobile");
        String productFour = product4.getProductName();

        product4.setPrice(17999);
        double priceFour = product4.getPrice();

        product4.setBrandName("Vivo");
        String brandNameFour = product4.getBrandName();

        System.out.println(product4);
    }
}

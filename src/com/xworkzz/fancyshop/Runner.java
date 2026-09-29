package com.xworkzz.fancyshop;

import com.xworkzz.fancyshop.items.Items;
import com.xworkzz.fancyshop.store.Store;

public class Runner {
    public static void main(String[] args) {
        Store store = new Store();

        Items item1 = new Items();
        item1.setItemId(101);
        item1.setItemName("Matte Finish Lipstick (Ruby Red)");
        item1.setPrice(499.00);
        item1.setQuantity(25);

        Items item2 = new Items();
        item2.setItemId(102);
        item2.setItemName("Waterproof Liquid Eyeliner (Black)");
        item2.setPrice(299.00);
        item2.setQuantity(40);

        Items item3 = new Items();
        item3.setItemId(103);
        item3.setItemName("Oxidised Silver Jhumka Earrings");
        item3.setPrice(350.00);
        item3.setQuantity(15);

        Items item4 = new Items();
        item4.setItemId(104);
        item4.setItemName("Crystal Hair Clip Set (Pack of 4)");
        item4.setPrice(199.00);
        item4.setQuantity(50);

        Items item5 = new Items();
        item5.setItemId(105);
        item5.setItemName("Floral Scented Body Mist (200ml)");
        item5.setPrice(599.00);
        item5.setQuantity(20);

        Items item6 = new Items();
        item6.setItemId(106);
        item6.setItemName("Gel Nail Polish Set (Pastel Colors)");
        item6.setPrice(450.00);
        item6.setQuantity(30);

        Items item7 = new Items();
        item7.setItemId(107);
        item7.setItemName("Velvet Makeup Pouch");
        item7.setPrice(280.00);
        item7.setQuantity(18);

        Items item8 = new Items();
        item8.setItemId(108);
        item8.setItemName("Designer Key Chain");
        item8.setPrice(120.00);
        item8.setQuantity(60);

        Items item9 = new Items();
        item9.setItemId(109);
        item9.setItemName("Hydrating Face Sheet Mask (Tea Tree)");
        item9.setPrice(99.00);
        item9.setQuantity(100);

        Items item10 = new Items();
        item10.setItemId(110);
        item10.setItemName("Beaded Charm Bracelet");
        item10.setPrice(220.00);
        item10.setQuantity(35);

        store.addItems(item1);
        store.addItems(item2);
        store.addItems(item3);
        store.addItems(item4);
        store.addItems(item5);
        store.addItems(item6);
        store.addItems(item7);
        store.addItems(item8);
        store.addItems(item9);
        store.addItems(item10);

        store.getItemDetails();

    }
}

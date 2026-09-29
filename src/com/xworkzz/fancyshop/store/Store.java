package com.xworkzz.fancyshop.store;

import com.xworkzz.fancyshop.items.Items;

public class Store {

    private Items[] items = new Items[10];
    int index;

    public boolean addItems(Items item){

        boolean isAdded = false;

        boolean isItemIdValid = false;
        boolean isItemNameValid = false;
        boolean isPriceValid = false;
        boolean isQuantityValid = false;


        if(item.getItemId() > 0){
            isItemIdValid = true;
        }
        else{
            System.out.println("invalid id");
        }

        if(item.getItemName() != null && !item.getItemName().isEmpty()){
            isItemNameValid = true;
        }
        else{
            System.out.println("invalid name");
        }

        if(item.getPrice() > 0){
            isPriceValid = true;
        }
        else{
            System.out.println("invalid Price");
        }

        if(item.getQuantity() > 0){
            isQuantityValid = true;
        }
        else{
            System.out.println("invalid brand name");
        }


        if( isItemIdValid&& isItemNameValid && isPriceValid && isQuantityValid){

            items[index] = item;
            index++;
        }
        return isAdded;
    }

    public void getItemDetails(){
        for(Items item : items){
            System.out.println(item);
        }
    }
}

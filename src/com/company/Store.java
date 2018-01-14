package com.company;

import java.lang.String;import java.lang.System;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class Store {
    public String storeName;
    public Invoice invoice;
    public static User user;
    public int itemCode = 0;
    public Date itemLastUpdateTime;

    public static Map<String,Item> itemMap;


    public Store(String storeName,User user){
        this.storeName = storeName;
        this.user = user;
        itemMap = new HashMap<>();



    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Map<String, Item> getItemMap() {
        return itemMap;
    }

    public void setItemMap(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }

    public Item createNewItem(String itemName,double itemBuyPrice,double itemSellPrice,double itemQuantity,ItemUnits itemUnit,ItemStatus itemStatus,String itemCatagory){
        Item item = new Item(itemName,itemBuyPrice,itemSellPrice,itemQuantity,itemUnit,itemStatus,itemCatagory);

        return addItem(item);
    }

    private Map.Entry<String, Item> getNextItemCode(){
        Map.Entry<String, Item> maxEntry = null;

        for (Map.Entry<String, Item> entry : itemMap.entrySet())
        {
            if (maxEntry == null || (entry.getValue().getItemCode() > (maxEntry.getValue().getItemCode()) ))
            {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }

    public Map<String,Item> viewItem(){
        for (Map.Entry<String, Item> entry : itemMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getItemQuantity() + " : "+entry.getValue().getItemCode()+" : "+entry.getValue().getItemAvgBuyPrice());
        }
        return null;
    }

    public boolean deleteItem(Item item){
        Item itemFound = searchItem(item.getItemName());
        if (itemFound != null){
            itemMap.remove(item.getItemName());
            System.out.println("Item , "+ item.getItemName() + " Delete Successfull..");
            return true;
        }
        else {
            System.out.println("Error, Item not found...\n");
            return false;
        }


    }

    public boolean getItemInvoice(){

        return true;
    }

    public Item searchItem(String itemName){
        return itemMap.get(itemName);
    }

    public boolean updateItemName(String oldItemName,String newName){

        Item prevItem = searchItem(oldItemName);

        if(prevItem != null){
            deleteItem(searchItem(oldItemName));

            prevItem.setItemName(newName);
            itemMap.put(prevItem.getItemName(),prevItem);
        }

        prevItem.setItemLastUpdateReason("Update Item Name.");
        prevItem.setItemLastUpdateTime(new Date());

        return true;
    }

    public boolean updateItemBuyPrice(Item item,double newBuyPrice){
        item.setItemBuyPrice(newBuyPrice);
        item.setItemAvgBuyPrice(newBuyPrice);
        item.setItemLastUpdateReason("Update Item Price.");
        item.setItemLastUpdateTime(new Date());
        return true;
    }

    public boolean amendItemBuyPriceOrQuantity(Item item,double newBuyPrice,double newQuantity){
        //If newBuyPrice is zero set default as current itemBuyPrice
        if(Double.compare(newBuyPrice,0)== 0){
            newBuyPrice = item.getItemBuyPrice();
        }

        //Calculate ItemnewTotal Qty and new avgBuyPrice
        double newTotalQuantity = item.getItemQuantity()+newQuantity;
        double avgBuyPrice = (item.getItemBuyPrice()*item.getItemQuantity() + newBuyPrice*newQuantity)/newTotalQuantity;


        item.setItemAvgBuyPrice(avgBuyPrice);

        item.setItemQuantity(newTotalQuantity);

        item.setItemBuyPrice(newBuyPrice);

        item.setItemLastUpdateReason("Update Item Price.");
        item.setItemLastUpdateTime(new Date());

        return true;

    }

    private Item addItem(Item item){

        Item itemFound = searchItem(item.getItemName());

        if (itemFound != null){
            System.out.println("Error, Item already Exist.. \n");
            item = null;
            return null;
        }
        else {
            try{
                itemCode = getNextItemCode().getValue().getItemCode()+1;
            }catch (NullPointerException e){
                itemCode = 1;
            }
            item.setItemCode(itemCode);

            itemLastUpdateTime = new Date();
            item.setItemLastUpdateTime(itemLastUpdateTime);

            item.setItemAvgBuyPrice(item.getItemBuyPrice());

            itemMap.put(item.getItemName(),item);
            System.out.printf("New Item , " + item.getItemName() + " %s %tF - %<tr", "is Created Successfully at", item.getItemLastUpdateTime());
            System.out.println("\n");
            return item;
        }
    }


}

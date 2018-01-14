package main.projects.inventrySystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class Store {
    public String storeName;
    public Invoice invoice;
    public static User user;



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
        boolean itemFound = searchItem(item);

        if ( itemFound == true){
            System.out.println("Error, Item already Exist.. \n");
            item = null;
            return null;
        }
        else {
            itemMap.put(item.getItemName(),item);
            System.out.println("New Item , "+item.getItemName()+ " is Created Successfully...");
            return item;
        }

    }

    public Map<String,Item> viewItem(){



        return null;
    }

    public boolean updateItem(Item item){

        return true;
    }

    public boolean deleteItem(Item item){
        if (searchItem(item) == true){
            itemMap.remove(item);
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

    public boolean searchItem(Item item){
        return itemMap.containsValue(item);
        //return itemMap.get(item.getItemName());


    }


}

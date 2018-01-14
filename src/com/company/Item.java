package com.company;

import java.lang.String; /**
 * Created by taniyaj on 1/14/2018.
 */
public class Item {
    private static String itemName;
    private static int itemCode;
    private static double itemBuyPrice;
    private static double itemSellPrice;
    private static double itemAvgBuyPrice;
    private static double itemQuantity;
    private static ItemUnits itemUnit;
    private static ItemStatus itemStatus;
    private static String itemCatagory;
    private static String itemDescription;

    public static String getItemName() {
        return itemName;
    }

    public static void setItemName(String itemName) {
        Item.itemName = itemName;
    }

    public static int getItemCode() {
        return itemCode;
    }

    public static void setItemCode(int itemCode) {
        Item.itemCode = itemCode;
    }

    public static double getItemBuyPrice() {
        return itemBuyPrice;
    }

    public static void setItemBuyPrice(double itemBuyPrice) {
        Item.itemBuyPrice = itemBuyPrice;
    }

    public static double getItemSellPrice() {
        return itemSellPrice;
    }

    public static void setItemSellPrice(double itemSellPrice) {
        Item.itemSellPrice = itemSellPrice;
    }

    public static double getItemAvgBuyPrice() {
        return itemAvgBuyPrice;
    }

    public static void setItemAvgBuyPrice(double itemAvgBuyPrice) {
        Item.itemAvgBuyPrice = itemAvgBuyPrice;
    }

    public static double getItemQuantity() {
        return itemQuantity;
    }

    public static void setItemQuantity(double itemQuantity) {
        Item.itemQuantity = itemQuantity;
    }

    public static ItemUnits getItemUnit() {
        return itemUnit;
    }

    public static void setItemUnit(ItemUnits itemUnit) {
        Item.itemUnit = itemUnit;
    }

    public static ItemStatus getItemStatus() {
        return itemStatus;
    }

    public static void setItemStatus(ItemStatus itemStatus) {
        Item.itemStatus = itemStatus;
    }

    public static String getItemDescription() {
        return itemDescription;
    }

    public static void setItemDescription(String itemDescription) {
        Item.itemDescription = itemDescription;
    }

    public static String getItemCatagory() {
        return itemCatagory;
    }

    public static void setItemCatagory(String itemCatagory) {
        Item.itemCatagory = itemCatagory;
    }

    public Item(String itemName,double itemBuyPrice,double itemSellPrice,double itemQuantity,ItemUnits itemUnit,ItemStatus itemStatus,String itemCatagory) {
        this.itemName = itemName;
        this.itemAvgBuyPrice = itemBuyPrice;
        this.itemSellPrice = itemSellPrice;
        this.itemBuyPrice = itemBuyPrice;
        this.itemQuantity = itemQuantity;
        this.itemUnit = itemUnit;
        this.itemStatus = itemStatus;
        this.itemCatagory = itemCatagory;
    }



}

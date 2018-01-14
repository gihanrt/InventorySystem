package com.company;

import java.lang.String;
import java.util.Date;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class Item {
    private String itemName;
    private int itemCode;
    private double itemBuyPrice;
    private double itemSellPrice;
    private double itemAvgBuyPrice;
    private double itemQuantity;
    private ItemUnits itemUnit;
    private ItemStatus itemStatus;
    private String itemCatagory;
    private String itemDescription;
    private String itemLastUpdateReason;
    private Date itemLastUpdateTime;

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public double getItemBuyPrice() {
        return this.itemBuyPrice;
    }

    public void setItemBuyPrice(double itemBuyPrice) {
        this.itemBuyPrice = itemBuyPrice;
    }

    public double getItemSellPrice() {
        return this.itemSellPrice;
    }

    public void setItemSellPrice(double itemSellPrice) {
        this.itemSellPrice = itemSellPrice;
    }

    public double getItemAvgBuyPrice() {
        return this.itemAvgBuyPrice;
    }

    public void setItemAvgBuyPrice(double itemAvgBuyPrice) {
        this.itemAvgBuyPrice = itemAvgBuyPrice;
    }

    public double getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public ItemUnits getItemUnit() {
        return this.itemUnit;
    }

    public void setItemUnit(ItemUnits itemUnit) {
        this.itemUnit = itemUnit;
    }

    public ItemStatus getItemStatus() {
        return this.itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCatagory() {
        return this.itemCatagory;
    }

    public void setItemCatagory(String itemCatagory) {
        this.itemCatagory = itemCatagory;
    }

    public Date getItemLastUpdateTime() {
        return itemLastUpdateTime;
    }

    public void setItemLastUpdateTime(Date itemLastUpdateTime) {
        this.itemLastUpdateTime = itemLastUpdateTime;
    }

    public String getItemLastUpdateReason() {
        return itemLastUpdateReason;
    }

    public void setItemLastUpdateReason(String itemLastUpdateReason) {
        this.itemLastUpdateReason = itemLastUpdateReason;
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

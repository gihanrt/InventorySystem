package test;

import com.company.*;
import org.junit.Test;

import java.util.Map;


/**
 * Created by taniyaj on 1/14/2018.
 */
public class StoreTest {
    public static Store myStore;
    public static Item newItem01;
    //@Before
    private void setupStore(){
        User user = new User("Taniya");
        myStore = new Store("Toon Store",user);


    }


    @Test
    public void storeTest(){
        setupStore();
        newItem01= myStore.createNewItem("Book", 70, 85, 100, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        myStore.deleteItem(newItem01);
        myStore.createNewItem("Pencil", 56, 34, 200, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        myStore.createNewItem("Pen", 33, 78, 4500, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        myStore.createNewItem("Bottle", 67, 55, 2400, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        myStore.createNewItem("Bottle", 67, 55, 2400, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        newItem01= myStore.createNewItem("Bag", 67, 55, 3000, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");

        myStore.viewItem();

        myStore.amendItemBuyPriceOrQuantity(newItem01,656,1000);

        myStore.viewItem();

        myStore.updateItemBuyPrice(newItem01,200);

        myStore.viewItem();

        System.out.println("Update Item Name... ");
        myStore.updateItemName("Bag","Mini Bags");

        myStore.viewItem();




    }
}

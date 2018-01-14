package test.projects.inventrySystem;

import main.projects.inventrySystem.*;
import org.junit.Before;
import org.junit.Test;
import practiceSessions.MyStore;

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
        myStore.createNewItem("Book", 70, 85, 100, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        //myStore.deleteItem(newItem01);
        myStore.createNewItem("Pencil", 56, 34, 200, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");
        myStore.createNewItem("Pen", 56, 34, 200, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");

        Map<String,Item> itMap = myStore.getItemMap();
//        System.out.println(itMap.get("Book").getItemName());


        System.out.println("\nView Store...\n");
        for (Item val : itMap.values()){
            System.out.println(val.getItemName());
            System.out.println(val.getItemQuantity());
        }
//
//        System.out.println(myStore.getItemMap().get("Book").getItemName());
//
//        Item item = new Item("AAAA",23,34,55,ItemUnits.IU_LENGTH,ItemStatus.IS_NEW,"aaa");
//        myStore.getItemMap().put(item.getItemName(), item);
//        System.out.println(myStore.getItemMap().get("AAAA").getItemName());
//        Item t = myStore.getItemMap().get("SS");
//        System.out.println(t.getItemName());



    }
}

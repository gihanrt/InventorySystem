package main.projects.inventrySystem;

/**
 * Created by taniyaj on 1/14/2018.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Taniya");
        Store myStore = new Store("Toon Store",user);
        Item newIte01 = myStore.createNewItem("Book", 70, 85, 100, ItemUnits.IU_PICES, ItemStatus.IS_NEW, "Stationary");

        myStore.deleteItem(newIte01);






    }

}

import java.util.ArrayList;
import java.util.*;

// CartSingleton class for Singleton pattern to track cart
class Cart {
    private static Cart instance; // variable instance under data type cart
    private int itemCount;
    private List<String> cartItems;
    private static double prob = 0.2;
    private static String itemName;

    private Cart() {

        itemCount = 0;
        cartItems = new ArrayList<>();
    }
    //a constructor is a special method
    // used to initialize objects. It has the same name as the class and does not have a return type.

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public int getItemCart() {

        return itemCount;
    }

    public void updateItemCart() {
        itemCount++;
        cartItems.add(itemName);
        System.out.println("Item added to cart." + "\n" + "Total updated items: " + itemCount);
    }

    public void displayCartItems() {
        System.out.println("Items in the cart:");

    }


    public void completePurchase() {
        for (int i = 0; i < 100; i++) {
            if (Math.random() <= prob) {
                System.out.println("Items purchased" + itemCount + " items bought.");
            } else {
                System.out.println("User has abandoned the cart. No purchase made.");
            }
        }
    }
}
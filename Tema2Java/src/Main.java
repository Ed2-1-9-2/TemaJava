import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
         //Am preferat sa lucrez in engleza din mai multe motive
         FoodItem Apple = new FoodItem("Apple",(FoodType.Fruit),45,110);
         FoodItem Banana = new FoodItem("Banana",(FoodType.Fruit),60,80);
         FoodItem Bread = new FoodItem("Bread",(FoodType.Bakery),105,150);
         Store store = new Store("Carrefour Market","Bulevardul Calea Dorobanti",5,4.5f);

        store.addItem(Apple);
        store.addItem(Banana);
        store.addItem(Bread);

        System.out.println("Information of this store:");

        System.out.println(store);

        System.out.println("Now , it's time to demonstrate about equals() and ToCompare() methods. Let's prove those.");

        List<FoodItem> foodItems2 = new ArrayList<>();
        foodItems2.add(Apple);
        foodItems2.add(Banana);
        foodItems2.add(Bread);
        Collections.sort(foodItems2);

        System.out.println("The food items are sorted:");
        for (FoodItem item : foodItems2) {
            System.out.println(item);
        }
        Map<FoodItem,String[]> CustomerMap = new HashMap<>();
        String[] customersApple = {"Anna", "Boris", "Tara"};
        String[] customersBanana = {"Jean", "Milford","Claudia"};
        String[] customersBread = {"Mary","Anatoly","Irene"};

        CustomerMap.put(Apple, customersApple);
        CustomerMap.put(Banana, customersBanana);
        CustomerMap.put(Bread, customersBread);
        System.out.println("Now let's print the results from map");
        for (Map.Entry<FoodItem,String[]> entry : CustomerMap.entrySet() ){
            FoodItem foodItem = entry.getKey();
            String[] customers = entry.getValue();
            System.out.println("Food Item: " + foodItem.getName());
            System.out.println("The Customers are:");
            for (String customer : customers) {
                System.out.println(customer);
            }
            System.out.println();
        }
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperationsExample {

    public static void main(String[] args) {
        // Creating a Map to store items with keys and values
        Map<String, Double> itemMap = new HashMap<>();

        // Adding items to the map
        itemMap.put("Item1", 20.0);
        itemMap.put("Item2", 15.5);
        itemMap.put("Item3", 30.75);

        // Displaying the initial contents of the map
        System.out.println("Initial Map Contents:");
        displayMap(itemMap);

        // Performing operations
        Scanner scanner = new Scanner(System.in);

        // a. Adding items to the map
        System.out.print("\nEnter key for new item: ");
        String newItemKey = scanner.next();
        System.out.print("Enter value for new item: ");
        double newItemValue = scanner.nextDouble();
        itemMap.put(newItemKey, newItemValue);
        System.out.println("Item added successfully.");
        displayMap(itemMap);

        // b. Removing items from the map
        System.out.print("\nEnter key to remove item: ");
        String keyToRemove = scanner.next();
        if (itemMap.containsKey(keyToRemove)) {
            itemMap.remove(keyToRemove);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item with key '" + keyToRemove + "' not found.");
        }
        displayMap(itemMap);

        scanner.close();
    }

    // Helper method to display the contents of the map
    private static void displayMap(Map<String, Double> map) {
        System.out.println("Map Contents:");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

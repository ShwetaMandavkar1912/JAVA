import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        // Creating a List of items
        List<String> itemList = new ArrayList<>();
        itemList.add("Item 1");
        itemList.add("Item 2");
        itemList.add("Item 3");
        itemList.add("Item 4");
        itemList.add("Item 5");

        // Printing items in the forward direction using ListIterator
        System.out.println("Printing items in the forward direction:");
        ListIterator<String> forwardIterator = itemList.listIterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        // Printing items in the backward direction using ListIterator
        System.out.println("\nPrinting items in the backward direction:");
        ListIterator<String> backwardIterator = itemList.listIterator(itemList.size());
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous());
        }
    }
}

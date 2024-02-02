// Generic class
class MyGenericClass<T> {
    private T genericVariable;

    // Constructor
    public MyGenericClass(T genericVariable) {
        this.genericVariable = genericVariable;
    }

    // Generic method within the generic class
    public void printGenericValue() {
        System.out.println("Generic Value: " + genericVariable);
    }

    // Static generic method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Creating an instance of MyGenericClass with Integer type
        MyGenericClass<Integer> integerGenericObject = new MyGenericClass<>(42);
        integerGenericObject.printGenericValue();

        // Creating an instance of MyGenericClass with String type
        MyGenericClass<String> stringGenericObject = new MyGenericClass<>("Hello, Generics!");
        stringGenericObject.printGenericValue();

        // Using the static generic method to print an array of doubles
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        MyGenericClass.printArray(doubleArray);
    }
}

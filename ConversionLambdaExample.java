import java.util.Scanner;

interface Converter {
    double convert(double input);
}

public class ConversionLambdaExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fahrenheit to Celsius conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        Converter fToCConverter = (input) -> (input - 32) * 5 / 9;
        double celsius = fToCConverter.convert(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Kilometers to Miles conversion
        System.out.print("\nEnter distance in Kilometers: ");
        double kilometers = scanner.nextDouble();
        Converter kmToMilesConverter = (input) -> input * 0.621371;
        double miles = kmToMilesConverter.convert(kilometers);
        System.out.println(kilometers + " Kilometers is equal to " + miles + " Miles.");

        scanner.close();
    }
}

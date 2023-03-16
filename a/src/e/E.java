package e;
import java.util.Scanner;

public class E {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for Fahrenheit temperature input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius using the formula C = 5/9 (F-32)
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        
        // Display the result
        System.out.println("Temperature in Celsius: " + celsius + "C");
        
        scanner.close();
    }
}
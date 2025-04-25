package Assignment1;

import java.util.Scanner;

public class Q8 {
//Use Scanner Class to
// 1.Read an int, double, float, Boolean ….
// 2.Store the values inside variables
// 3.Print the values
// 4.Perform some arithmeticObserve what errors you may get
    public static void main(String args[])
    {
        sol();
    }

    public static void sol()
    {
        Scanner scan = new Scanner(System.in);

        // 1. Read different types of data
        System.out.print("Enter an integer: ");
        int intValue = scan.nextInt();

        System.out.print("Enter a double value: ");
        double doubleValue = scan.nextDouble();

        System.out.print("Enter a float value: ");
        float floatValue = scan.nextFloat();

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scan.nextBoolean();

        // 2. Print the values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Boolean: " + booleanValue);

        // 3. Perform some arithmetic operations
        int sum = intValue + 10; // Adding 10 to the integer
        double product = doubleValue * 2; // Multiplying the double by 2
        float division = floatValue / 2.0f; // Dividing the float by 2

        System.out.println("\nArithmetic Operations:");
        System.out.println("Integer + 10: " + sum);
        System.out.println("Double * 2: " + product);
        System.out.println("Float / 2: " + division);

        // Close the scanner
        scan.close();

    }
}

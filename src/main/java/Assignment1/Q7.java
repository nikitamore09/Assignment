package Assignment1;

import java.util.Scanner;
//accept Name, Age, Gender and Address (single line) of a person from the user and print them in separate lines
public class Q7 {

    public static void main(String args[])
    {
        sol();
    }

    public static void sol()
    {
        Scanner scanner=new Scanner(System.in);

        // Accept Name, Age, Gender, and Address in a single line
        System.out.print("Enter your Name, Age, Gender, and Address (separated by spaces): ");
        String name = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();
        //scanner.nextLine(); // Consume the remaining newline character
        String address = scanner.nextLine();

        //print the details in separate line
        System.out.println("\nPerson Details:");
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Gender:"+gender);
        System.out.println("Address:"+address);

        scanner.close();


    }
}

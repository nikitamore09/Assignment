package Hackathon;

import java.util.Scanner;

//
public class Q1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a:");
        boolean a = scanner.nextBoolean();

        System.out.print("Enter The value of b:");
        boolean b = scanner.nextBoolean();

        System.out.print("Enter The value of c:");
        boolean c = scanner.nextBoolean();


        System.out.print("At least two are true :"+sol(a, b, c));


        scanner.close();
    }

    public static boolean sol(boolean a, boolean b, boolean c) {
        return ((a && b) || (a && c) || (b && c));
    }

}

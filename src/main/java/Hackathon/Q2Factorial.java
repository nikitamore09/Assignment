package Hackathon;
//write a program to find factorial (Non Recursive)

import java.util.Scanner;

class Q2Factorial {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number to get the factorial of:");
        int num = scanner.nextInt();

        int result=sol(num);
        System.out.println("Factorial is : "+ result);

        scanner.close();

    }

    public static int sol(int a) {
        int fact=1;

        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }

        return fact;

    }

}


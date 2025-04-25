package Hackathon;

import java.util.Scanner;

public class Q4 {
    //Given an array of integers check the Palindrome of the series.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number :");
        int n = scanner.nextInt();

        System.out.print("Enter the number of elements :");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        if(checkPalindrome(arr))
        {
            System.out.println("The array is Palindrome");
        }
        else
        {
            System.out.println("The array is not a Palindrome");
        }


    }

    public static boolean checkPalindrome(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
             return false;// as soon as Mismatch is found
            }
            i++;
            j--;
        }
        return true; // If no Mismatches
    }
}

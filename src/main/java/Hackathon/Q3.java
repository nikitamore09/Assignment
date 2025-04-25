package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of integers, sort the integer values.
//BubbleSort-TODO

public class Q3 {

    public static void main (String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number of elements:");
           int n=scanner.nextInt();

           int[] arr=new int[n];

        System.out.print("Enter the numbers:");

        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        scanner.close();

        int [] SortedArr=sortWithLibrary(arr);
        System.out.println("Sorted array:" + Arrays.toString(SortedArr));
    }

    public static int[]  sortWithLibrary (int[] arr )
    {
        //solve using arrays.sort
       Arrays.sort(arr);
       return arr;
    }
}

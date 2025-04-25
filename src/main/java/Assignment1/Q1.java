package Assignment1;

import java.util.Scanner;

public class Q1 {

    //Accept three numbers from the keyboard and print the sum and average of them
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = scanner.nextInt();

        int[] numbers = {num1, num2, num3};
        solution(numbers);
        scanner.close();
    }
    public static void solution(int[] nums) {
        if (nums.length != 3) {
            System.out.println("Exactly three numbers required");
            return;
        }

        int sum = nums[0] + nums[1] + nums[2];
        double average = sum / 3.0;

        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + average);

    }


}

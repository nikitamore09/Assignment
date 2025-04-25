package Patterns;

public class P6 {

    public static void main(String args[])
    {
        sol(5);
    }

    public static void sol(int n)
    {
        int spaces = n * 2; // Initial spaces for centering

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*  "); // Print stars with extra space
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= spaces - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*  "); // Print stars with extra space
            }
            System.out.println();
        }
    }
}



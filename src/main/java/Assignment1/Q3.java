package Assignment1;

public class Q3 {

//to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    public static void main (String args[])
    {
        solution(10,20);
    }

    public static void solution(int a ,int b)

    {
        System.out.println("Sum of 2 Numbers is : " + (a+b));
        System.out.println("---------------");
        System.out.println("Multiplication of 2 Numbers is :" +(a*b));
        System.out.println("---------------");
        System.out.println("Subtraction of 2 Numbers is:" +(a-b));
        System.out.println("---------------");
        System.out.println("Division of 2 numbers is :" +(a/b));
        System.out.println("---------------");
        System.out.println("Remainder of 2 numbers is:" +(a%b));


    }
}

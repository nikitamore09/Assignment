package Assignment1;

public class Q4 {
    //to print the area (r2) and perimeter(2 r) of a circle

    public static void main(String args[])
    {
        solution(10);
    }

    public static void solution(int radius)
    {
        System.out.println("The area of a circle is :"+Math.PI*radius*radius);
        System.out.println("--------------------");
        System.out.println("The Perimeter of a circle is :"+2*Math.PI*radius);
    }
}

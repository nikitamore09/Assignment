package Assignment1;

public class Q6 {
    //Swap Two Variables

    public static void main(String args[])
    {
        sol(10,20);
    }

    public static void sol (int a,int b)
    {
        System.out.println("Before Swap");
        System.out.println("Value of a: "+ a );
        System.out.println("Value of b: "+b);
        System.out.println("----------------------------------");

        int tmp=a;
        a=b;
        b=tmp;


        System.out.println("After Swap");
        System.out.println("Value of a:" +a);
        System.out.println("Value of b:" +b);
    }

}

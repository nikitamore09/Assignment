package Patterns;

public class P3 {

    public static void main(String args[])
    {
        sol();
    }

    public static void sol()
    {
        // Upper Half
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

        // lower Half

        for(int i=3;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

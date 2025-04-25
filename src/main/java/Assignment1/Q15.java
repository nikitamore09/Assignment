package Assignment1;

public class Q15 {
    //find the average of all the elements of an array

    public static void main (String [] args)
    {
        int arr[]={33,3,3};
        System.out.println("Average of all the elemnets in array is:"+sol(arr));
    }

    public static double sol(int arr[])
    {
        int arrSum=0;
//int avg;
        for(int i=0;i< arr.length;i++)
        {
            arrSum=arrSum+arr[i];
        }

        double avg = (double) arrSum / arr.length;

        return avg;

    }
}

package Assignment1;

public class Q10 {
    //test if any array contains a specific value
    public static void main(String args[])
    {

        int arr[]={1,2,3,4,5};
        int target=4;
        //sol(arr,target);
        System.out.println( sol(arr,target));
    }

    public static int sol(int arr[],int target)
    {
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("The given array has the Target Element");
                return target;
            }
        }

        return 0;
    }

}

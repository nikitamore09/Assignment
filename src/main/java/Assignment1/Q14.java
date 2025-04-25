package Assignment1;

public class Q14 {
    //find the maximum and minimum value of an array

    public static void main(String args[])
    {

        int arr[]={1, 2, 3, 4, 3};
        int[] result=sol(arr);
        System.out.println("Max Element is:"+result[0]);
        System.out.println("Min Element is:"+result[1]);
    }

    public static int[] sol(int arr[])
    {
        int max =arr[0];
        int min = arr[0];

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max =arr[i];
            }

            if(arr[i]<min)
            {
                min=arr[i];
            }
        }


        return new int[] {max,min};
    }
}

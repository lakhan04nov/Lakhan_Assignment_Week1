// A program to Summing Numbers in a given integers list. 

package java_8;

public class A2 {
    public static void main (String []args)
    {
        int [] arr={1,2,3,4,5,6,7,8};
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}



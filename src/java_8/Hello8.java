// A program to find all the even numbers exist in the list.  

package java_8;


import java.util.ArrayList;


import javax.swing.*;

public class Hello8 {
    public static void main  (String [] args)
    {
        int[] x={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();

        for (int i=0;i<x.length;i++)
        {
            if (x[i]%2==0)
            {
                a1.add(x[i]);
            }
            else
            {
                a2.add(x[i]);
            }
        }
        System.out.println("even number");
        for (int no: a1) {
            System.out.println(no);
        }



    }
}

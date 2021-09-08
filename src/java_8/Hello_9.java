// A program to find duplicate elements in a given integers list. 

package java_8;

import java.util.*;
//by using brout force method
//set integer method
//hash table method

public class Hello_9 {
 public static void main(String[] args)
 {
     int [] arr={3,5,4,3,2,2,1,3,3,4};

     Map<Integer,Integer>  hm= new HashMap<>();
     for (int no: arr)
     {
         Integer count= hm.get(no);
         if (count==null)
         {
             hm.put(no,1);
         }
         else
         {
             count++;
             hm.put(no,count);
         }
     }
     Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
     for (Map.Entry<Integer,Integer> me:es)
     {
         if (me.getValue()>1)
         {
             System.out.println(me.getKey()+"");
         }
     }

 }
}

// A program to delete duplicate object from ArrayList.

package collection2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class ArrayListExample{
	
    public static void main(String[] args){
    	
        // ArrayList with duplicate elements
    	 ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
         
        System.out.println(numbersList);
 
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);
         
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
         
        System.out.println(listWithoutDuplicates);
    }
}

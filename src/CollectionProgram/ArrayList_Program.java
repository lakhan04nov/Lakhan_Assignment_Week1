// A combine program of following topics:


   //  program to find an element in a array list.
   //  program to remove the element by given index from a array list.
   //  program to sort the given array list.
   //  program to reverse the given array list.
   //  program to shuffle the given array list.
   //  program to compare two array lists.
    
   
package CollectionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayList_Program {

	public static void main(String[] args) {
       
       ArrayList<String> al= new ArrayList<>();
       al.add("Apple");
       al.add("Banana");
       al.add("Pineapple");
       al.add("Watermellon");
       al.add("Gwava");
       String str="Watermellon";
       
       findElement(al,str);
       removeElement(al,2);
       sortArrayList(al);
       reverseArrayList(al);
       suffulString(al,1,2);
       compareArrayList(al);
       
   }


	private static void compareArrayList(ArrayList<String> al) {
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Watermellon");
		al2.add("Pineapple");
        al2.add("Banana");  
        al2.add("Apple");
       
       
        boolean result= al.equals(al2);
        if(result) {
        System.out.println("List matched");
        }else {
        System.out.println("List not match");
        }

}

	private static void reverseArrayList(ArrayList<String> al) {
		Collections.reverse(al);
		System.out.println("List after reverse: "+al);
}

	private static void suffulString(ArrayList<String> al, int i, int j) {
		LinkedList<String> ll=new LinkedList(al);
		String temp=ll.get(i);
		ll.set(i,ll.get(j));
		ll.set(j,temp);

		System.out.println("List after suffling 2 index: "+ll);

}

	private static void sortArrayList(ArrayList<String> al) {
		Collections.sort(al);
		System.out.println("Sorted list is : "+al);

}

	private static void removeElement(ArrayList<String> al, int i) {
		al.remove(i);
		System.out.println("List after removing element of "+i+" index "+al);

}


	private static void findElement(ArrayList<String> al, String str) {
		boolean flag = true;
		for(String s:al){
            if(s==str){
                System.out.println("Element "+s+" find in "+al.indexOf(s)+" index");
                flag=false;
            }
                     
        }
		if(flag) {
        System.out.println("Element not found");
        }

}



}

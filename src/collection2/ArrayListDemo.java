//  A program to insert, retrieve & remove record.

package collection2;

import java.util.*;
class ArrayListDemo{
	
        public static void main(String[] args)
         {
                ArrayList<String> al = new ArrayList<String>();
                
                System.out.println("Size of ArrayList: "+al.size());
                
                //Adding the elements
                al.add("Java");
                al.add("JDBC");
                
                System.out.println("Elements of first ArrayList: "+al);

                ArrayList<String> al2 = new ArrayList<String>();
                  al2.add("EJB");
                  al2.add("Struts");
                  
                   //Adding the both array
                al2.addAll(al);
                System.out.println("Elements of second ArrayList: "+al2);
                
                //remove the element
                al2.remove("EJB");
                
                System.out.println("Elements of ArrayList after deletion: "+al2);
                
                System.out.println("Size of ArrayList: "+al2.size());

                  // Retriving 2nd index element
                System.out.println("The element at 2nd index is: "+al2.get(2));
        }
}

// A program to check if a map contains the specified key/value.

package hashmap_program;


import java.util.*;

public class Hash_Map_Demo {
  public static void main(String[] args) {

    
     HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

   
     hash_map.put(10, "sita");
     hash_map.put(15, "geeta");
     hash_map.put(20, "ram");
     hash_map.put(25, "mintu");
     hash_map.put(30, "divya");

    
     System.out.println("Initial Mappings are: " + hash_map);

   
     System.out.println("Is the key '20' present? " + 
     hash_map.containsKey(20));

    
     System.out.println("Is the key '5' present? " + 
     hash_map.containsKey(5));
 }
}


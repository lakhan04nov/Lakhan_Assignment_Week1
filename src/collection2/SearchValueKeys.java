//  A program to search key & value from HashTable.

package collection2;

import java.util.Enumeration;
import java.util.Hashtable;
class SearchValueKeys{
	
        public static void main(String[] args){
                Hashtable<String, String> ht = new Hashtable<String, String>();
                ht.put("1","First");
                ht.put("2","Second");
                ht.put("3","Third");
                ht.put("4","Forth");
                ht.put("5","Fifth");
                System.out.println("Hashtable elements with key: ");
                System.out.println(ht);
                System.out.println("===============================================");
                if (ht.containsKey("1") && ht.containsValue("First")){
                        System.out.println("key 1 and value first are available.");
                }
                else
                        System.out.println("Hashtable doesn't contain first key and value");
                if (ht.containsKey("second") && ht.containsValue("2"))
                {
                        System.out.println("key second and value 1 are available.");
                }
                        System.out.println("Hashtable doesn't contain key second and value 2");
                        System.out.println("===============================================");
        }
}
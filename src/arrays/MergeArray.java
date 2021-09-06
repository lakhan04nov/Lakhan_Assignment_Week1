// A program to merge two arrays into one.

package arrays;

import java.util.*;  
public class MergeArray {  
	public static void main(String args[])   {  
		String str1[] = { "A", "E", "I" };          //source array  
		String str2[] = { "O", "U" };               //destination array  
		 int size=str1.length+str2.length;
		 
		String[] mergearray=new String[size];
		 System.arraycopy(str1,0,mergearray,0,str1.length);
		 System.arraycopy(str2,0,mergearray,str1.length,str2.length );
		 System.out.println(" array after merge "+ Arrays.toString(mergearray));
}  
}  

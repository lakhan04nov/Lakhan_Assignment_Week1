// A program for binary search.

package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
	
	public static void main(String[] args){
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);

		// 10 is present at index 3.
		int index = Collections.binarySearch(al, 10);
		System.out.println(index);

		
		index = Collections.binarySearch(al, 20);
		System.out.println(index);
	}
}



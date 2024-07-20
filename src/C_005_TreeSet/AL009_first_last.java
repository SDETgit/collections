package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class AL009_first_last {

	public static void main(String[] args) {
		 TreeSet<String> set = new TreeSet<>();
	        set.add("Banana");
	        set.add("Apple");
	        set.add("Cherry");

	        // Print the original set
	        System.out.println("Original set: " + set);

	        // Get the first (lowest) element
	        String firstElement = set.first();
	        System.out.println("First element: " + firstElement);
	      
	        		//Original set: [Apple, Banana, Cherry]
	        		//First element: Apple
//even though "Banana" was added before "Apple" and "Cherry", the TreeSet stores the elements in their natural order. 
//The first() method returns "Apple" as it is the lowest element in the set.
	        String lastElement = set.last();
	        System.out.println("Last element: " + lastElement);
	        //Last element: Cherry
	        
	        String higherElement = set.higher("Apple");
	        System.out.println(higherElement);

	}

}

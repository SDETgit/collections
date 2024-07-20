package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class AL010_higher_lower {

	public static void main(String[] args) {
		
//		higher(E e)
//		The higher(E e) method returns the least element in the set that is strictly greater than the given element, or null if there is no such element.
//
//		lower(E e)
//		The lower(E e) method returns the greatest element in the set that is strictly less than the given element, or null if there is no such element.
		
		 TreeSet<Integer> set = new TreeSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(40);

	        // Print the original set
	        System.out.println("Original set: " + set);

	        // Get the higher element
	        Integer higherElement = set.higher(20);
	        System.out.println("Element higher than 20: " + higherElement);

	        // Get the lower element
	        Integer lowerElement = set.lower(20);
	        System.out.println("Element lower than 20: " + lowerElement);	
//	        		Original set: [10, 20, 30, 40]
//	        		Element higher than 20: 30
//	        		Element lower than 20: 10 
	        
	        TreeSet<String> set1 = new TreeSet<>();
	        set1.add("Banana");
	        set1.add("Apple");
	        set1.add("Cherry");
	        String higherElement1 = set1.higher("Apple");
	        System.out.println(higherElement1);
	        //Banana
	}

}

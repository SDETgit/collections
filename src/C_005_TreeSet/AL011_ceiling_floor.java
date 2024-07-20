package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class AL011_ceiling_floor {
//	ceiling(E e)
//	The ceiling(E e) method returns the least element in the set that is greater than or equal to the given element, or null if there is no such element.
//
//	floor(E e)
//	The floor(E e) method returns the greatest element in the set that is less than or equal to the given element, or null if there is no such element.
	public static void main(String[] args) {
		
		 // Create and initialize a TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Print the original set
        System.out.println("Original set: " + set);

        // Get the ceiling element
        Integer ceilingElement = set.ceiling(25);
        System.out.println("Element ceiling of 25: " + ceilingElement);

        // Get the floor element
        Integer floorElement = set.floor(25);
        System.out.println("Element floor of 25: " + floorElement);

//        		Original set: [10, 20, 30, 40]
//        		Element ceiling of 25: 30
//        		Element floor of 25: 20

 
	}

}

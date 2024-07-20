package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class AL012_pollFirst_pollLast {
//	pollFirst()
//	The pollFirst() method retrieves and removes the first (lowest) element from the set, or returns null if the set is empty.
//
//	pollLast()
//	The pollLast() method retrieves and removes the last (highest) element from the set, or returns null if the set is empty.
	public static void main(String[] args) {
		
	      // Create and initialize a TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Print the original set
        System.out.println("Original set: " + set);

        // Poll the first (lowest) element
        Integer firstElement = set.pollFirst();
        System.out.println("First element polled: " + firstElement);
        System.out.println("Set after polling first element: " + set);

        // Poll the last (highest) element
        Integer lastElement = set.pollLast();
        System.out.println("Last element polled: " + lastElement);
        System.out.println("Set after polling last element: " + set);
        
//        		Original set: [10, 20, 30, 40]
//        		First element polled: 10
//        		Set after polling first element: [20, 30, 40]
//        		Last element polled: 40
//        		Set after polling last element: [20, 30]


	}

}

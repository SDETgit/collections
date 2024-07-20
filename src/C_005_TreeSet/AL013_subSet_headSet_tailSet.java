package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;

public class AL013_subSet_headSet_tailSet {
//	subSet(E fromElement, E toElement)
//	The subSet(E fromElement, E toElement) method returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.
public static void main(String[] args) {
		
		// Create and initialize a TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Get a subset from 20 (inclusive) to 40 (exclusive)
        TreeSet<Integer> subset = new TreeSet<>(set.subSet(20, 40));
        System.out.println("Subset from 20 (inclusive) to 40 (exclusive): " + subset);
 
      //Subset from 20 (inclusive) to 40 (exclusive): [20, 30]
      //headSet(E toElement)
      //The headSet(E toElement) method returns a view of the portion of this set whose elements are strictly less than toElement.
      
      // Get a headset up to 30 (exclusive)
        TreeSet<Integer> headset = new TreeSet<>(set.headSet(30));
        System.out.println("Headset up to 30 (exclusive): " + headset);
      //Headset up to 30 (exclusive): [10, 20]
        
      //subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
      //Additionally, there is an overloaded version of subSet() that allows you to specify whether the endpoints are inclusive or exclusive.
        
        // Get a subset from 20 (inclusive) to 40 (inclusive)
        TreeSet<Integer> subset1 = new TreeSet<>(set.subSet(20, true, 40, true));
        System.out.println("Subset from 20 (inclusive) to 40 (inclusive): " + subset1);
        //Subset from 20 (inclusive) to 40 (inclusive): [20, 30, 40]
   
	}

}

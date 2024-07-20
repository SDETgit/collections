package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;

public class AL002_clear {

	public static void main(String[] args) {
		
		// Creating an TreeSet of strings
        TreeSet<String> list = new TreeSet<>();
        
        // Adding elements to the TreeSet
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Displaying the TreeSet before clearing
        System.out.println("TreeSet before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        // Clearing the TreeSet
        list.clear();
        
        // Displaying the TreeSet after clearing
        System.out.println("TreeSet after clear: " + list); // Output: []
        
        // Checking if the TreeSet is empty
        System.out.println("Is the TreeSet empty? " + list.isEmpty()); // Output: true
    

	}

}

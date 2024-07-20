package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LHS002_clear {

	public static void main(String[] args) {
		
		// Creating an LinkedHashSet of strings
        LinkedHashSet<String> list = new LinkedHashSet<>();
        
        // Adding elements to the LinkedHashSet
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Displaying the LinkedHashSet before clearing
        System.out.println("LinkedHashSet before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        // Clearing the LinkedHashSet
        list.clear();
        
        // Displaying the LinkedHashSet after clearing
        System.out.println("LinkedHashSet after clear: " + list); // Output: []
        
        // Checking if the LinkedHashSet is empty
        System.out.println("Is the LinkedHashSet empty? " + list.isEmpty()); // Output: true
    

	}

}

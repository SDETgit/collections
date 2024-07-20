package C_003_HashSet;

import java.util.HashSet;
import java.util.List;

public class AL002_clear {

	public static void main(String[] args) {
		
		 // Creating an HashSet of strings
        HashSet<String> list = new HashSet<>();
        
        // Adding elements to the HashSet
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Displaying the HashSet before clearing
        System.out.println("HashSet before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        // Clearing the HashSet
        list.clear();
        
        // Displaying the HashSet after clearing
        System.out.println("HashSet after clear: " + list); // Output: []
        
        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + list.isEmpty()); // Output: true
    

	}

}

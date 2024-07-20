package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL002_clear {

	public static void main(String[] args) {
		
		 // Creating an ArrayList of strings
        ArrayList<String> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Displaying the ArrayList before clearing
        System.out.println("ArrayList before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        // Clearing the ArrayList
        list.clear();
        
        // Displaying the ArrayList after clearing
        System.out.println("ArrayList after clear: " + list); // Output: []
        
        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty()); // Output: true
    

	}

}

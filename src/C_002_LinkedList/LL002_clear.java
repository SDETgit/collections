package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL002_clear {

	public static void main(String[] args) {
		
		 // Creating an LinkedList of strings
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        // Displaying the LinkedList before clearing
        System.out.println("LinkedList before clear: " + list); // Output: [Apple, Banana, Cherry]
        
        // Clearing the LinkedList
        list.clear();
        
        // Displaying the LinkedList after clearing
        System.out.println("LinkedList after clear: " + list); // Output: []
        
        // Checking if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + list.isEmpty()); // Output: true
    

	}

}

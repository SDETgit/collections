package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL003_clone {

	public static void main(String[] args) {
		
		 LinkedList<String> originalList = new LinkedList<>();
	        originalList.add("Apple");
	        originalList.add("Banana");
	        originalList.add("Cherry");

	        // Cloning the LinkedList
	        @SuppressWarnings("unchecked")
			LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();

	        // Displaying the original and cloned LinkedList
	        System.out.println("Original List: " + originalList); // Output: [Apple, Banana, Cherry]
	        System.out.println("Cloned List: " + clonedList); // Output: [Apple, Banana, Cherry]

	        // Modifying the cloned list
	        clonedList.add("Date");

	        // Displaying the lists after modification
	        System.out.println("Original List after modification: " + originalList); // Output: [Apple, Banana, Cherry]
	        System.out.println("Cloned List after modification: " + clonedList); // Output: [Apple, Banana, Cherry, Date]
	   

	}

}

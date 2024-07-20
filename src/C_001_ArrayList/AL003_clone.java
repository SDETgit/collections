package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL003_clone {

	public static void main(String[] args) {
		
		 ArrayList<String> originalList = new ArrayList<>();
	        originalList.add("Apple");
	        originalList.add("Banana");
	        originalList.add("Cherry");

	        // Cloning the ArrayList
	        @SuppressWarnings("unchecked")
			ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

	        // Displaying the original and cloned ArrayList
	        System.out.println("Original List: " + originalList); // Output: [Apple, Banana, Cherry]
	        System.out.println("Cloned List: " + clonedList); // Output: [Apple, Banana, Cherry]

	        // Modifying the cloned list
	        clonedList.add("Date");

	        // Displaying the lists after modification
	        System.out.println("Original List after modification: " + originalList); // Output: [Apple, Banana, Cherry]
	        System.out.println("Cloned List after modification: " + clonedList); // Output: [Apple, Banana, Cherry, Date]
	   

	}

}

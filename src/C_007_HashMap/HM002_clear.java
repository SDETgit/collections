package C_007_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HM002_clear {
	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<>();

	        // Adding elements to the HashMap
	        map.put("apple", 1);
	        map.put("banana", 2);
	        map.put("orange", 3);
	        
	        // Printing the HashMap before clearing
	        System.out.println("HashMap before clear: " + map);

	        // Clearing the HashMap
	        map.clear();
	        
	        // Printing the HashMap after clearing
	        System.out.println("HashMap after clear: " + map);
	        
	        // Checking if the HashMap is empty
	        boolean isEmpty = map.isEmpty();
	        System.out.println("Is HashMap empty? " + isEmpty);
	        
//	        HashMap before clear: {banana=2, orange=3, apple=1}
//	        HashMap after clear: {}
//	        Is HashMap empty? true
	}

}

package C_007_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HM0000 {
	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();

	        // Adding elements
	        map.put("apple", 1);
	        map.put("banana", 2);
	        map.put("orange", 3);

	        // Accessing elements
	        System.out.println("Value for apple: " + map.get("apple"));

	        // Checking key and value existence
	        System.out.println("Contains key 'banana'? " + map.containsKey("banana"));
	        System.out.println("Contains value 2? " + map.containsValue(2));

	        // Removing an element
	        map.remove("orange");

	        // Size of the map
	        System.out.println("Size of the map: " + map.size());

	        // Iterating over keys
	        for (String key : map.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + map.get(key));
	        }

	        // Iterating over entries
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Clearing the map
	        map.clear();
	        System.out.println("Is map empty? " + map.isEmpty());
//	        
//	        Value for apple: 1
//	        Contains key 'banana'? true
//	        Contains value 2? true
//	        Size of the map: 2
//	        Key: banana, Value: 2
//	        Key: apple, Value: 1
//	        Key: banana, Value: 2
//	        Key: apple, Value: 1
//	        Is map empty? true
	}

}

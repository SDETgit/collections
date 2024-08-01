package C_007_HashMap;
import java.util.HashMap;

public class HM008_merge {
	//public V merge(K key, V value, BiFunction function)
	//The merge() method creates an entry with a specified key and value or, 
	//if an entry with the specified key already exists, calculates a new value for the entry.
	//
	//The new value is computed using a function, which can be defined by a lambda expression 
	//that is compatible with the apply() method of Java's BiFunction interface.
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		  
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    capitalCities.merge("Canada", "Ottawa", (a, b) -> a + " -> " + b);
	    capitalCities.merge("England", "London", (a, b) -> a + " -> " + b);
	    capitalCities.merge("Germany", "Berlin", (a, b) -> a + " -> " + b);
	    
	    System.out.println(capitalCities);
	}

}

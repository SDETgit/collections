package C_007_HashMap;
import java.util.HashMap;

public class HM008_merge {
	//public V merge(K key, V value, BiFunction function)
	//
	// If the key is not present in the map, the value is simply added.
	//If the key is already present, the BiFunction is applied to the existing value and the new value to compute the new value for the key.

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
	    //{Canada=Ottawa, USA=Washington DC, Norway=Oslo, England=London -> London, Germany=Berlin -> Berlin}

	}

}

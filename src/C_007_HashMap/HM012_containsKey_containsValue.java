package C_007_HashMap;

import java.util.HashMap;

public class HM012_containsKey_containsValue {
	public static void main(String[] args) {
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    
	    //boolean containsKey(Object key)	
	    // Check if the map contains certain keys
        System.out.println("Contains key 'Germany': " + capitalCities.containsKey("Germany")); // true
        System.out.println("Contains key 'France': " + capitalCities.containsKey("France"));   // false
        
        // Check if the map contains certain values
        System.out.println("Contains value 'Berlin': " + capitalCities.containsValue("Berlin")); // true
        System.out.println("Contains value 'Paris': " + capitalCities.containsValue("Paris"));   // false
   
   
	    
	}

}

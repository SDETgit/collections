package C_007_HashMap;
import java.util.HashMap;

public class HM005_get_getOrDefault {
	
	//get method 
	//public V get(Object key)
	//returns the value for the key 
	public static void main(String[] args) {
		 HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities.get("USA"));
		    //Washington DC
		    
    //getOrDefault 
    //public V get(Object key, V def)
	//If the entry does not exist then the value of the second parameter is returned.	    
		    System.out.println(capitalCities.getOrDefault("England", "Unknown"));
		    System.out.println(capitalCities.getOrDefault("Canada", "Unknown"));    

		    //London
		    //Unknown
	}

}

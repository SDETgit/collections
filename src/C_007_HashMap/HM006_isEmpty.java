package C_007_HashMap;
import java.util.HashMap;

public class HM006_isEmpty {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    
	    System.out.println(capitalCities.isEmpty());
	    
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println(capitalCities.isEmpty());
	   // true
	   // false

	}

}

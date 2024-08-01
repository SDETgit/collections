package C_007_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HM002_clone {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    HashMap copy = (HashMap)capitalCities.clone();
	    copy.remove("England");
	    
	    System.out.println(capitalCities);
	    System.out.println(copy);
//	    {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
//	    {USA=Washington DC, Norway=Oslo, Germany=Berlin}
	}

}

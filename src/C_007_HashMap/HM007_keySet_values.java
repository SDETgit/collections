package C_007_HashMap;
import java.util.HashMap;

public class HM007_keySet_values {
	public static void main(String[] args) {
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.keySet());
	//    {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
	//    [USA, Norway, England, Germany]
	    System.out.println(capitalCities.values());
	//[Washington DC, Oslo, London, Berlin]
	}

}

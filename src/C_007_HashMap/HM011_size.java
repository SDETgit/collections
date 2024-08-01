package C_007_HashMap;

import java.util.HashMap;

public class HM011_size {
	public static void main(String[] args) {
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities.size());
	    //4
	}

}

package C_007_HashMap;

import java.util.HashMap;

public class HM013_equals {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities1 = new HashMap<>();
        capitalCities1.put("England", "London");
        capitalCities1.put("Germany", "Berlin");
        capitalCities1.put("Norway", "Oslo");
        capitalCities1.put("USA", "Washington DC");

        HashMap<String, String> capitalCities2 = new HashMap<>();
        capitalCities2.put("England", "London");
        capitalCities2.put("Germany", "Berlin");
        capitalCities2.put("Norway", "Oslo");
        capitalCities2.put("USA", "Washington DC");

        HashMap<String, String> capitalCities3 = new HashMap<>();
        capitalCities3.put("France", "Paris");
        capitalCities3.put("Italy", "Rome");
        capitalCities3.put("Spain", "Madrid");

        // Comparing two maps with the same key-value pairs
        System.out.println("capitalCities1 equals capitalCities2: " + capitalCities1.equals(capitalCities2)); // true

        // Comparing two maps with different key-value pairs
        System.out.println("capitalCities1 equals capitalCities3: " + capitalCities1.equals(capitalCities3)); // false

        // Adding an additional entry to one map
        capitalCities2.put("Canada", "Ottawa");
        System.out.println("capitalCities1 equals capitalCities2 after modification: " + capitalCities1.equals(capitalCities2)); // false
   
	}

}

package C_007_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HM003_compute_computeIfAbsent_computeIfPresent {
	
//	The compute(Key, BiFunction) method of HashMap class allows you to update a value in HashMap. The compute() method tries to compute a mapping for the 
//	specified key and its current mapped value (or null if
//			there is no current mapping is found). This method is used to automatically update a value for given key in HashMap.
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    //using lambda expression for change 
	    capitalCities.compute("England", (k, v) -> v + "(" + k + ")");

	    System.out.println(capitalCities);
	    //at compute even if the values is not it will add new 
	    capitalCities.compute("England1", (k, v) -> v + "(" + k + ")");
		   
	    
	    System.out.println(capitalCities);
	    
	    capitalCities.computeIfAbsent("Canada", (k) -> "Toronto (" + k + ")");
	    
	    System.out.println(capitalCities);
	    //The computeIfPresent method in Java's HashMap class is used to compute a new value for 
	    //a specified key only if the key is already present in the map. This method is useful for updating the value associated with an existing key based on the current value.
	    capitalCities.computeIfPresent("England", (k, v) -> v + "(" + k + ")");
	    
	    System.out.println(capitalCities);
	    
//	    {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
//	    {USA=Washington DC, Norway=Oslo, England=London(England), Germany=Berlin}
//	    {USA=Washington DC, Norway=Oslo, England=London(England), England1=null(England1), Germany=Berlin}
//	    {Canada=Toronto (Canada), USA=Washington DC, Norway=Oslo, England=London(England), England1=null(England1), Germany=Berlin}
//		{Canada=Toronto (Canada), USA=Washington DC, Norway=Oslo, England=London(England)(England), England1=null(England1), Germany=Berlin}
	}

}

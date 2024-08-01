package C_007_HashMap;
import java.util.HashMap;

public class HM009_put_putAll_putIfAbsent {
	//public V put(K key, V value)
	//public void putAll(Map map)
	//public V putIfAbsent(K key, V value)
	public static void main(String[] args) {
		   HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities); 
		    
		    HashMap<String, String> moreCities = new HashMap<String, String>();
		    moreCities.put("Canada", "Ottawa");
		    moreCities.put("Japan", "Tokyo");
		    System.out.println(moreCities);
		    capitalCities.putAll(moreCities);
		    System.out.println(capitalCities);
		    
		  //{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
		  //{Canada=Ottawa, Japan=Tokyo}
		  //{Canada=Ottawa, USA=Washington DC, Norway=Oslo, Japan=Tokyo, England=London, Germany=Berlin}
		    // Add new entries only if they don't exist
		    capitalCities.putIfAbsent("Canada1", "Ottawa");
		    capitalCities.putIfAbsent("England", "Cambridge");
		    System.out.println(capitalCities);
		    //Here key England was present so it was not inserted 
		  //{Canada1=Ottawa, Canada=Ottawa, USA=Washington DC, Norway=Oslo, Japan=Tokyo, England=London, Germany=Berlin}

	}

}

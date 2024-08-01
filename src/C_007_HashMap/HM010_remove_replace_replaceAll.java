 package C_007_HashMap;
import java.util.HashMap;

public class HM010_remove_replace_replaceAll {
	
	//public V remove(Object key)
	//public boolean remove(Object key, Object value)
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");

	    System.out.println(capitalCities);
	    capitalCities.remove("USA");
	    capitalCities.remove("Germany", "Berlin");
	    capitalCities.remove("England", "Cambridge");
	    
	    System.out.println(capitalCities);
	   // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
	   // {Norway=Oslo, England=London}
	    
	    
	 //replace 
	   // public V replace(K key, V newValue)
	   // public boolean replace(K key, V oldValue, V newValue)
	    HashMap<String, String> cp = new HashMap<String, String>();

	    cp.put("England", "Cambridge");
	    cp.put("Germany", "Berlin");
	    cp.put("Norway", "Oslo");
	    cp.put("USA", "Washington DC");
	    System.out.println(cp);
	    cp.replace("England", "London");
	    cp.replace("Canada", "Ottawa");
	    cp.replace("USA", "New York", "Washington DC");
	    System.out.println(cp);
	   // {USA=Washington DC, Norway=Oslo, England=Cambridge, Germany=Berlin}
	   // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}

	    //replceAll
	  // public void replaceAll(BiFunction operator)
	  //The replaceAll() method replaces the value of every 
//	    entry in the map with the result of an operation using 
//	    the entry's key and value. The operation can be defined 
//	    by a lambda expression that is compatible 
//	    with the apply() method of Java's BiFunction interface.
//	    
	    System.out.println(cp);
	    cp.replaceAll((k, v) -> "The capital of " + k + " is " + v);
	    System.out.println(cp);
	    //{USA=The capital of USA is Washington DC, Norway=The capital of Norway is Oslo, England=The capital of England is London, Germany=The capital of Germany is Berlin}

	}

}

package C_008_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.



//Explanation
//Subclassing LinkedHashMap: A new class LinkedHashMapWithEvictionPolicy is created by extending LinkedHashMap.
//Constructor: The constructor takes maxSize as a parameter and passes it along with initialCapacity, loadFactor, and 
//accessOrder to the superclass constructor. The accessOrder parameter is set to true to enable access-order iteration.
//Overriding removeEldestEntry: The removeEldestEntry method is overridden to return true when the size of the map exceeds
//maxSize. This ensures that the eldest entry is removed when the map exceeds the specified size.
//Usage: An instance of LinkedHashMapWithEvictionPolicy is created with a maximum size of 3. Entries are added to the map, and once 
//the fourth and fifth entries are added, the eldest entries are removed according to the eviction policy.
	
	public class LinkedHashMapWithEvictionPolicy<K, V> extends LinkedHashMap<K, V> {
	    private final int maxSize;

	    public LinkedHashMapWithEvictionPolicy(int maxSize) {
	        super(maxSize, 0.75f, true);
	        this.maxSize = maxSize;
	    }

	    @Override
	    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
	        return size() > maxSize;
	    }
public static void main(String[] args) {
	//All methods from HashMap are applicable 
	//extra are removeEldestEntry
	//we can iterate the same way as HashMap 
	 LinkedHashMapWithEvictionPolicy<String, String> cache = new LinkedHashMapWithEvictionPolicy<>(3);

     cache.put("1", "one");
     cache.put("2", "two");
     cache.put("3", "three");
     System.out.println("Cache before adding fourth entry: " + cache);

     cache.put("4", "four");
     System.out.println("Cache after adding fourth entry: " + cache);

     cache.put("5", "five");
     System.out.println("Cache after adding fifth entry: " + cache);
   //Cache before adding fourth entry: {1=one, 2=two, 3=three}
   //Cache after adding fourth entry: {2=two, 3=three, 4=four}
   //Cache after adding fifth entry: {3=three, 4=four, 5=five}
   //
}
}

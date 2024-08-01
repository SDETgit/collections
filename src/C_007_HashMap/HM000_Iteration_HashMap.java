package C_007_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HM000_Iteration_HashMap {
	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();

	        // Adding elements
	        map.put("apple", 1);
	        map.put("banana", 2);
	        map.put("orange", 3);

	        
	        //1
	        System.out.println(map);
	        System.out.println(map.entrySet());
	        
	        //2 Using Map.entrySet
	        for(Map.Entry<String, Integer> entry : map.entrySet())
	        {
	        	System.out.println(entry.getKey()+" "+entry.getValue());
	        }
	        
	        // 3 Iterating over keys or values using keySet() and values() methods
	        
	        for(String k : map.keySet())
	        {
	        	System.out.println("Keys "+k);
	        }
	        
	        for(Integer v : map.values())
	        {
	        	System.out.println("Values "+v);
	        }
	        
	        //4 Map.EntrySet
		    
		    for(Entry<String, Integer> set : map.entrySet())
		    {
		    	System.out.println(set.getKey()+" = "+set.getValue());
		    }
		    
		    // 5 Iterator
	        Iterator<Entry<String, Integer>> new_Iterator
	            = map.entrySet().iterator();
	 
	        // Iterating every set of entry in the HashMap
	        while (new_Iterator.hasNext()) {
	            Map.Entry<String, Integer> new_Map
	                = (Map.Entry<String, Integer>)
	                      new_Iterator.next();
	 
	            // Displaying HashMap
	            System.out.println(new_Map.getKey() + " = "
	                               + new_Map.getValue());
	        
	}
	      //{banana=2, orange=3, apple=1}
	      //[banana=2, orange=3, apple=1]
	      //banana 2
	      //orange 3
	      //apple 1
	      //Keys banana
	      //Keys orange
	      //Keys apple
	      //Values 2
	      //Values 3
	      //Values 1
	      //banana = 2
	      //orange = 3
	      //apple = 1
	      //banana = 2
	      //orange = 3
	      //apple = 1

	        
	        
	        
}}

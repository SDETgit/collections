package C_004_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.List;
//Order: LinkedHashSet maintains the order of elements based on their insertion order, which is different from HashSet,
//which does not guarantee any order.
//Performance: It offers slightly lower performance than HashSet due to the additional overhead of maintaining the linked list.
//Null Elements: LinkedHashSet allows null elements, similar to HashSet.
//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operations and permits null elements.
//Java LinkedHashSet class is non-synchronized.
//Java LinkedHashSet class maintains insertion order.

public class LHS000_Iterate_LinkedHashSet {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        //1
        System.out.println(list); // Output: [Apple, Banana, Cherry]
        
        
       //2 using iterator 
        Iterator it = list.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
        //3 for each loop 
        
        for(String e : list)
        {
        	System.out.println(e);
        }
      
       

	}

}

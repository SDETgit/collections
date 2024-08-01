package C_003_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
//No Duplicates: HashSet does not allow duplicate elements. If you try to add a duplicate, the add method will return false.
//Order: HashSet does not maintain any order for its elements. If you need ordered elements, consider using LinkedHashSet or TreeSet.
//Performance: HashSet provides constant-time performance for basic operations like add, remove, contains, and size, 
//assuming the hash function disperses elements properly among the buckets.
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet class is non synchronized.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet is the best approach for search operations.

public class HS000_Iterate_HashSet {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		HashSet<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
      
        //1
        System.out.println(list); // Output: [Apple, Cherry, Banana]
        
        
        //2 Using iterator 
        Iterator it = list.iterator();
        
        while (it.hasNext())
        {
        System.out.println(it.next());
        }
        
        //3 using for each loop 
        
        for(String e :list)
        {
        	System.out.println(e);
        }
      
      
       

	}

}

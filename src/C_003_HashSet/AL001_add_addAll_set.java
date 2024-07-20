package C_003_HashSet;

import java.util.HashSet;
import java.util.HashSet;
import java.util.List;
//No Duplicates: HashSet does not allow duplicate elements. If you try to add a duplicate, the add method will return false.
//Order: HashSet does not maintain any order for its elements. If you need ordered elements, consider using LinkedHashSet or TreeSet.
//Performance: HashSet provides constant-time performance for basic operations like add, remove, contains, and size, 
//assuming the hash function disperses elements properly among the buckets.

public class AL001_add_addAll_set {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		HashSet<String> list = new HashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // Output: [Apple, Cherry, Banana]
        
        
        
        
        //addAll
        
        HashSet<String> list1 = new HashSet<>();
        list1.add("Apple");
        list1.add("Banana");

        HashSet<String> list2 = new HashSet<>();
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);
        System.out.println(list1); // Output: [Apple, Cherry, Date, Banana]
        
        HashSet<String> list3 = new HashSet<>();
        list3.add("Apple");
        list3.add("Banana");

        HashSet<String> list4 = new HashSet<>();
        list4.add("Cherry");
        list4.add("Date");

        list3.addAll(list4); // Insert list2 at index 1
        System.out.println(list3); // Output: [Apple, Cherry, Date, Banana]
      
       

	}

}

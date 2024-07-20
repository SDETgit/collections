package C_004_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.List;
//Order: LinkedHashSet maintains the order of elements based on their insertion order, which is different from HashSet,
//which does not guarantee any order.
//Performance: It offers slightly lower performance than HashSet due to the additional overhead of maintaining the linked list.
//Null Elements: LinkedHashSet allows null elements, similar to HashSet.

public class AL001_add_addAll_set {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // Output: [Apple, Banana, Cherry]
        
        
        //addAll
        
        LinkedHashSet<String> list1 = new LinkedHashSet<>();
        list1.add("Apple");
        list1.add("Banana");

        LinkedHashSet<String> list2 = new LinkedHashSet<>();
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);
        System.out.println(list1); // Output: [Apple, Banana, Cherry, Date]
        
        LinkedHashSet<String> list3 = new LinkedHashSet<>();
        list3.add("Apple");
        list3.add("Banana");

        LinkedHashSet<String> list4 = new LinkedHashSet<>();
        list4.add("Cherry");
        list4.add("Date");

        list3.addAll(list4); // Insert list2 at index 1
        System.out.println(list3); // Output: [Apple, Banana, Cherry, Date]
      
       

	}

}

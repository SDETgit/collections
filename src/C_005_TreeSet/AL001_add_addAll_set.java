package C_005_TreeSet;

import java.util.TreeSet;
import java.util.TreeSet;
import java.util.List;
//Order: TreeSet does not maintains insertion order but it maintains insertion of element in natural order say in lexicographically as in dictionary 
//Performance: It provides log(n) time cost for basic operations like add, remove, and contains, which is less 
//efficient than HashSet but provides ordered elements.
//Null Elements: TreeSet does not allow null elements.
//NavigableSet: TreeSet implements NavigableSet, which provides methods for navigating the set such as lower,
//floor, ceiling, and higher.
//TreeSet is useful when you need a Set implementation that maintains elements in a sorted order and allows for
//efficient navigation of elements based on their order.
public class AL001_add_addAll_set {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		TreeSet<String> list = new TreeSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // Output: [Apple, Banana, Cherry]
        
        
        //addAll
        
        TreeSet<String> list1 = new TreeSet<>();
        list1.add("Apple");
        list1.add("Banana");

        TreeSet<String> list2 = new TreeSet<>();
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);
        System.out.println(list1); // Output: [Apple, Banana, Cherry, Date]
        
        TreeSet<String> list3 = new TreeSet<>();
        list3.add("Apple");
        list3.add("Banana");

        TreeSet<String> list4 = new TreeSet<>();
        list4.add("Cherry");
        list4.add("Date");

        list3.addAll(list4); // Insert list2 at index 1
        System.out.println(list3); // Output: [Apple, Banana, Cherry, Date]
         

	}

}

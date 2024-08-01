package C_005_TreeSet;

import java.util.TreeSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
//Order: TreeSet does not maintains insertion order but it maintains insertion of element in natural order say in lexicographically as in dictionary 
//Performance: It provides log(n) time cost for basic operations like add, remove, and contains, which is less 
//efficient than HashSet but provides ordered elements.
//Null Elements: TreeSet does not allow null elements.
//NavigableSet: TreeSet implements NavigableSet, which provides methods for navigating the set such as lower,
//floor, ceiling, and higher.
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.
public class AL000_Iterate_TreeSet {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		TreeSet<String> list = new TreeSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        //1
        System.out.println(list); // Output: [Apple, Banana, Cherry]
        
        //2 For each loop 
        for(String e : list)
        {
        	System.out.println(e);
        	
        }
        
        //3 Using iterator 
        Iterator it = list.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
         

	}

}

package C_005_TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.List;
import java.util.ListIterator;

public class AL005_iterator {

	public static void main(String[] args) {
		
		// Create an TreeSet of strings
		TreeSet<String> list = new TreeSet<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Obtain an iterator for the HashSet
        Iterator<String> iterator = list.iterator();  //String complies iterator will work with String objects 

        // Iterate through the HashSet using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
            
            // Optionally remove elements while iterating
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }

        // Display the HashSet after iteration
        System.out.println("List after removal: " + list);
       //Output 
//        Element: Apple
//        Element: Banana
//        Element: Cherry
//        Element: Date
//        List after removal: [Apple, Cherry, Date]
 

	}

}
	
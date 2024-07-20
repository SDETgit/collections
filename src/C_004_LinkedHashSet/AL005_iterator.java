package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

public class AL005_iterator {

	public static void main(String[] args) {
		
		// Create an LinkedHashSet of strings
		LinkedHashSet<String> list = new LinkedHashSet<>();
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
	
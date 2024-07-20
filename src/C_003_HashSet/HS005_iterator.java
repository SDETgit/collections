package C_003_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HS005_iterator {

	public static void main(String[] args) {
		
		// Create an HashSet of strings
        HashSet<String> list = new HashSet<>();
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
	
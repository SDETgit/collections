package C_002_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LL010_sort {

	public static void main(String[] args) {
		
		// Create and initialize an LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Date");
        
        // Print the original list
        System.out.println("Original list: " + list);
        
        // Sort the list in natural order
        Collections.sort(list);
        // Sort the list in natural order
     
        // Print the sorted list
        System.out.println("Sorted list: " + list);
        //output Original list: [Banana, Apple, Cherry, Date]
        // Sorted list: [Apple, Banana, Cherry, Date]
        
        Collections.sort(list, Collections.reverseOrder()); //Comparator.reverseOrder() another 
        
        System.out.println("Sorted list reverse order : " + list);
        
        //Sorted list reverse order : [Date, Cherry, Banana, Apple]
        
        list.sort(null);
        System.out.println("null is passed so items will be sorted naturally based on their data type" + list);
        //[Apple, Banana, Cherry, Date]

	}

}

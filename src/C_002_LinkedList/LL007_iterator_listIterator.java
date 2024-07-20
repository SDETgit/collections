package C_002_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LL007_iterator_listIterator {

	public static void main(String[] args) {
		
		// Create an LinkedList of strings
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Obtain an iterator for the LinkedList
        Iterator<String> iterator = list.iterator();  //String complies iterator will work with String objects 

        // Iterate through the LinkedList using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
            
            // Optionally remove elements while iterating
            if (element.equals("Banana")) {
                iterator.remove();
            }
        }

        // Display the LinkedList after iteration
        System.out.println("List after removal: " + list);
       //Output 
//        Element: Apple
//        Element: Banana
//        Element: Cherry
//        Element: Date
//        List after removal: [Apple, Cherry, Date]
      
        // Obtain a ListIterator for the LinkedList
       
        ListIterator<String> listIterator = list.listIterator();

        // Iterate through the LinkedList in forward direction
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println("Element: " + element);

            // Example: Replace "Banana" with "Blueberry"
            if ("Banana".equals(element)) {
                listIterator.set("Blueberry");
            }
        }

        // Iterate through the LinkedList in backward direction
        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println("Element: " + element);

            // Example: Add an element before "Cherry"
            if ("Date".equals(element)) {
                listIterator.add("Coconut");
            }
        }

        // Display the LinkedList after modifications
        System.out.println("\nList after modifications: " + list);
        
//        output 
//        Forward traversal:
//        	Element: Apple
//        	Element: Cherry
//        	Element: Date
//
//        	Backward traversal:
//        	Element: Date
//        	Element: Coconut
//        	Element: Cherry
//        	Element: Apple
//
//        	List after modifications: [Apple, Cherry, Coconut, Date]
//
// 
       

	}

}

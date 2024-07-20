package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL001_add_addAll_set {

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // Output: [Apple, Banana, Cherry]
        
        
        list.add(1, "Blueberry"); // Insert "Blueberry" at index 1
        System.out.println(list); // Output: [Apple, Blueberry, Banana, Cherry]
        
        //addAll
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Cherry");
        list2.add("Date");

        list1.addAll(list2);
        System.out.println(list1); // Output: [Apple, Banana, Cherry, Date]
        
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Apple");
        list3.add("Banana");

        List<String> list4 = new ArrayList<>();
        list4.add("Cherry");
        list4.add("Date");

        list3.addAll(1, list4); // Insert list2 at index 1
        System.out.println(list3); // Output: [Apple, Cherry, Date, Banana]
        
        //In Java, the set() method in the LinkedList class is used to replace
        //the element at a specific position (index) with a new element.
        System.out.println(list); //[Apple, Blueberry, Banana, Cherry]
        String el=  list.set(1, "Bluebe"); //replaced element will be stored in el
        System.out.println(list); // Output: [Apple, Bluebe, Banana, Cherry]
        System.out.println(el); //Blueberry

	}

}

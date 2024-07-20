package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL011_sublist {
//	The subList() method in ArrayList allows you to obtain a view of a portion of the list. This method returns a sublist that starts from the specified fromIndex (inclusive)
//	and ends at the specified toIndex (exclusive). 
//	The returned sublist is backed by the original list, meaning that changes to the sublist are reflected in the original list and vice versa.
public static void main(String[] args) {
	// Create and initialize an LinkedList
    LinkedList<String> list = new LinkedList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");
    list.add("Elderberry");

    // Print the original list
    System.out.println("Original list: " + list);

    // Get a sublist from index 1 to index 4 (exclusive)
    List<String> sublist = list.subList(1, 4);

    // Print the sublist
    System.out.println("Sublist from index 1 to 4: " + sublist);

    // Modify the sublist
    sublist.set(1, "Fig");

    // Print the modified sublist
    System.out.println("Modified sublist: " + sublist);

    // Print the original list after modification
    System.out.println("Original list after modifying sublist: " + list);
	
    //output 
//    Original list: [Apple, Banana, Cherry, Date, Elderberry]
//    		Sublist from index 1 to 4: [Banana, Cherry, Date]
//    		Modified sublist: [Banana, Fig, Date]
//    		Original list after modifying sublist: [Apple, Banana, Fig, Date, Elderberry]


	}

}

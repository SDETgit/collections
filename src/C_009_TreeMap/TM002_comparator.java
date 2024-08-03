package C_009_TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TM002_comparator {
	//The comparator used to order the keys in the map. If the map uses the natural ordering of its keys, this method returns null.
public static void main(String[] args) {
	 // TreeMap with natural ordering (Integer keys)
    TreeMap<Integer, String> naturalOrderMap = new TreeMap<>();
    naturalOrderMap.put(10, "Ten");
    naturalOrderMap.put(5, "Five");
    naturalOrderMap.put(20, "Twenty");

    // TreeMap with custom comparator (reverse order)
    Comparator<Integer> reverseComparator = (a, b) -> b.compareTo(a);
    TreeMap<Integer, String> reverseOrderMap = new TreeMap<>(reverseComparator);
    reverseOrderMap.put(10, "Ten");
    reverseOrderMap.put(5, "Five");
    reverseOrderMap.put(20, "Twenty");

    // Displaying comparators
    System.out.println("Natural Order Map Comparator: " + naturalOrderMap.comparator()); // Should print null
    System.out.println("Reverse Order Map Comparator: " + reverseOrderMap.comparator()); // Should print the reverse comparator

    // Displaying map entries
    System.out.println("Natural Order Map: " + naturalOrderMap);
    System.out.println("Reverse Order Map: " + reverseOrderMap);
  //Natural Order Map Comparator: null
  //Reverse Order Map Comparator: C_009_TreeMap.TM002_comparator$$Lambda$1/0x0000000100000a00@6073f712
  //Natural Order Map: {5=Five, 10=Ten, 20=Twenty}
  //Reverse Order Map: {20=Twenty, 10=Ten, 5=Five}

	
}
}

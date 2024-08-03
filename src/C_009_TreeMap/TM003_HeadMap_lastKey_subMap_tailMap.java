package C_009_TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TM003_HeadMap_lastKey_subMap_tailMap {
	//HeadMap is used to obtain a view of the portion of the map whose keys are less than a specified key
public static void main(String[] args) {
	 TreeMap<Integer, String> treeMap = new TreeMap<>();
     treeMap.put(1, "One");
     treeMap.put(2, "Two");
     treeMap.put(3, "Three");
     treeMap.put(4, "Four");

     // Get headMap with keys less than 3
     SortedMap<Integer, String> headMap = treeMap.headMap(3);
     System.out.println("HeadMap (keys < 3): " + headMap);
     //HeadMap (keys < 3): {1=One, 2=Two}
     
     //lastKey Returns the last (highest) key currently in this sorted map.
     System.out.println(treeMap.lastKey()); //4
     
     //subMap
     System.out.println(treeMap.subMap(0,  2)); //{1=One}
     System.out.println(treeMap.subMap(0, true, 2, true)); //{1=One, 2=Two}
     
  // Get subMap with keys from 2 (inclusive) to 4 (exclusive)
     SortedMap<Integer, String> subMap = treeMap.subMap(2, 4);
     System.out.println("SubMap (keys [2, 4)): " + subMap);  //SubMap (keys [2, 4)): {2=Two, 3=Three}
     
     //SortedMap<K, V> tailMap(K fromKey)
     //SortedMap<K, V> tailMap(K fromKey, boolean inclusive)
    // View Type: The tailMap method returns a SortedMap view, which means you can use all standard Map operations on it.
    // Dynamic Updates: Changes to the tailMap view are reflected in the original TreeMap, and vice versa.
     
    

     // Get tailMap with keys greater than or equal to 3
     SortedMap<Integer, String> tailMap = treeMap.tailMap(3);
     System.out.println("TailMap (keys >= 3): " + tailMap); //TailMap (keys >= 3): {3=Three, 4=Four}
     
     // Get tailMap with keys greater than 3 (exclusive)
     SortedMap<Integer, String> tailMapExclusive = treeMap.tailMap(3, false);
     System.out.println("TailMap (keys > 3): " + tailMapExclusive); //TailMap (keys > 3): {4=Four}


	
}
}

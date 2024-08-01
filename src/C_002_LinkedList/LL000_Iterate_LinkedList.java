package C_002_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LL000_Iterate_LinkedList {
	//Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data //structure. It inherits the AbstractList class and implements List and Deque interfaces.

	//Java LinkedList class can contain duplicate elements.
	//Java LinkedList class maintains insertion order.
	//Java LinkedList class is non synchronized.
	//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
	//Java LinkedList class can be used as a list, stack or queue.	

	public static void main(String[] args) {
		
		//void add(int index, E element)
		
				LinkedList<String> list = new LinkedList<>();
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        System.out.println(list); // Output: [Apple, Banana, Cherry]
		        
		        //1		        list.add(1, "Blueberry"); // Insert "Blueberry" at index 1
		        System.out.println(list); // Output: [Apple, Blueberry, Banana, Cherry]
		        
		        //2 for loop
		        for(int i=0;i<list.size();i++)
		        {
		        	System.out.println("LinkedList Elements :- "+list.get(i));
		        }
		        
		        //3 while loop 
		        
		        int i =0;
		        while(i<list.size())
		        {
		        	System.out.println("LinkedList while loop " +list.get(i));
		        	i++;
		        }
		        
		        //4 Enhanced for loop 
		        for(String ele : list )
		        {
		        	System.out.print(ele+" ");
		        }
		        
		        System.out.println();
		        //5 Using iterator 
		        
		        Iterator it = list.iterator();
		        
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
		        
		        
		        
		        
		    
	}

}

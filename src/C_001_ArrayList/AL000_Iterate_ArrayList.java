package C_001_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL000_Iterate_ArrayList {
	//Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size
	// limit. We can add or remove elements anytime
	// 
	//->Java ArrayList class can contain duplicate elements.
	//->Java ArrayList class maintains insertion order.
	//->Java ArrayList class is non synchronized.
	//->Java ArrayList allows random access because the array works on an index basis.
	//->In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs 
	//->to occur if any element is removed from the array list.
	//->We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use 
	//->the required wrapper class in such cases. For example:
	//1. ArrayList<int> al = ArrayList<int>(); // does not work  
	//2. ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
	public static void main(String[] args) {
		
		//void add(int index, E element)
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Cherry2");
        al.add("Cherry");
        
        //1
        System.out.println(al); 
        
        //2
        for(int i=0;i<al.size();i++) {
        	System.out.println("The elements are :- "+al.get(i));
        	     }
        //3 Using For each loop 
        for(String el : al)
        {
        	System.out.println("For each loop :- "+el);
        }
        
        //4 Using Iterator 
        Iterator it = al.iterator();
        
        while (it.hasNext())
        {
        	System.out.println("Iterator "+it.next());
        }
       
        //5 
        
        int val =0 ;
        while (al.size() > val) {

            // Printing the element which holds above
            // condition true
            System.out.println("While loop:- "+al.get(val));

            // Step 3: Terminating condition by incrementing
            // our counter in each iteration
            val++ ;
        }
	}

}

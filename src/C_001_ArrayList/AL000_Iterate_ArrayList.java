package C_001_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL000_Iterate_ArrayList {

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

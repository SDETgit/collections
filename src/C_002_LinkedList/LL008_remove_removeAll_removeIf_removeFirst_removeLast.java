package C_002_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LL008_remove_removeAll_removeIf_removeFirst_removeLast {

	public static void main(String[] args) {
		
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.remove(0); //remove by index 
	  //  cars.remove(String.valueOf("Mazda")); //remove by value 
	    cars.remove("Mazda"); //remove by value 
	    System.out.println(cars);
		
	    //output 
	    //[BMW, Ford]

	    cars.removeAll(cars);
	    System.out.println(cars);

	    //output 
	    //[]
	    
	    LinkedList<String> cars1 = new LinkedList<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.add("Toyota");
	    
	    LinkedList<String> valid = new LinkedList<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars1.removeAll(valid); //A-B 
	    
	    System.out.println(cars1); 
//	    [BMW, Toyota]

	    
	    LinkedList<Integer> numbers = new LinkedList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    numbers.removeIf( n -> n % 2 == 0 );
	    System.out.println(numbers);
	    
	    //Output
	    //[5, 9, 1]
//	    

	    
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.add("Toyota");

	    System.out.println(cars1);
	    
	    cars1.removeFirst();
	    System.out.println(cars1);
	    cars1.removeLast();
	    System.out.println(cars1);
	    
//	    		[BMW, Toyota, Ford, Mazda, Toyota]
//	    		[Toyota, Ford, Mazda, Toyota]
//	    		[Toyota, Ford, Mazda]
	    }

}

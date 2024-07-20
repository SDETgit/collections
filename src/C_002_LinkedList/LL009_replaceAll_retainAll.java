package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL009_replaceAll_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		
		  LinkedList<Integer> numbers = new LinkedList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(6);
		    numbers.add(1);
		    numbers.replaceAll( n -> n + 1 );
		    System.out.println(numbers);
		    //output 
		    //[6, 10, 9, 7, 2]
		    
		    LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Toyota");
		    
		    LinkedList<String> valid = new LinkedList<String>();
		    valid.add("Volvo");
		    valid.add("Ford");
		    valid.add("Mazda");
		    
		    cars.retainAll(valid); //Intersection common elements 
		    
		    System.out.println(cars);
		    //output : [Volvo, Ford, Mazda]
		    
	}

}

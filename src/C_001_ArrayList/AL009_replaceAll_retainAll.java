package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL009_replaceAll_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(6);
		    numbers.add(1);
		    numbers.replaceAll( n -> n + 1 );
		    System.out.println(numbers);
		    //output 
		    //[6, 10, 9, 7, 2]
		    
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Toyota");
		    
		    ArrayList<String> valid = new ArrayList<String>();
		    valid.add("Volvo");
		    valid.add("Ford");
		    valid.add("Mazda");
		    
		    cars.retainAll(valid); //Intersection common elements 
		    
		    System.out.println(cars);
		    //output : [Volvo, Ford, Mazda]
		    
	}

}

package C_001_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL009_replaceAll_retainAll {

	public static void main(String[] args) {
		//retainAll gives intersection 
		//public void replaceAll(UnaryOperator operator)
		
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
		    
		    ArrayList<Integer> gfg = new ArrayList<>();
		    
	        // adding members into the list now
	        gfg.add(1);
	        gfg.add(20);
	        gfg.add(21);
	        gfg.add(13);
	        gfg.add(21);
	        gfg.add(10);
	        gfg.add(21);
	 
	        // replacing 21 with 100 using replaceAll() method
	        Collections.replaceAll(gfg, 21, 200);
	 
	        // printing all the elements using for each loop
	        for (Integer value : gfg) {
	            System.out.print(value+" ");
		    
	}  	//1 20 200 13 200 10 200
	        }

}

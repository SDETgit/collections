package C_004_LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class AL006_remove_removeIf_removeAll {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> cars = new LinkedHashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   
	  //  cars.remove(String.valueOf("Mazda")); //remove by value 
	    cars.remove("Mazda"); //remove by value 
	    System.out.println(cars);
		
	    //output 
	    //[Volvo, Ford, BMW]

	    cars.removeAll(cars);
	    System.out.println(cars);

	    //output 
	    //[]
	    
	    LinkedHashSet<String> cars1 = new LinkedHashSet<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.add("Toyota");
	    
	    LinkedHashSet<String> valid = new LinkedHashSet<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars1.removeAll(valid);
	    
	    System.out.println(cars1);  //A-B 
//	    [BMW, Toyota]

	    
	    LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    numbers.removeIf( n -> n % 2 == 0 );
	    System.out.println(numbers);
	    
	    //Output
	    //[5, 9, 1]

	}

}

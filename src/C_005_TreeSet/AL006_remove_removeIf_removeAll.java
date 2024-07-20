package C_005_TreeSet;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;

public class AL006_remove_removeIf_removeAll {

	public static void main(String[] args) {
		
		
		TreeSet<String> cars = new TreeSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   
	  //  cars.remove(String.valueOf("Mazda")); //remove by value 
	    cars.remove("Mazda"); //remove by value 
	    System.out.println(cars);
		
	    //output 
	    //[BMW, Ford, Volvo]

	    cars.removeAll(cars);
	    System.out.println(cars);

	    //output 
	    //[]
	    
	    TreeSet<String> cars1 = new TreeSet<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.add("Toyota");
	    
	    TreeSet<String> valid = new TreeSet<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars1.removeAll(valid);
	    
	    System.out.println(cars1);  //A-B 
//	    [BMW, Toyota]

	    
	    TreeSet<Integer> numbers = new TreeSet<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    numbers.removeIf( n -> n % 2 == 0 );
	    System.out.println(numbers);
	    
	    //Output
	    //[1, 5, 9]

	}

}

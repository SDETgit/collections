package C_001_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AL008_remove_removeAll_removeIf {

	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
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
	    
	    ArrayList<String> cars1 = new ArrayList<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("Mazda");
	    cars1.add("Toyota");
	    
	    ArrayList<String> valid = new ArrayList<String>();
	    valid.add("Volvo");
	    valid.add("Ford");
	    valid.add("Mazda");
	    
	    cars1.removeAll(valid);
	    
	    System.out.println(cars1);  //A-B 
//	    [BMW, Toyota]

	    //public boolean removeIf(Predicate condition) A Predicate object or lambda expression which tests an item from the list.
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    numbers.removeIf( n -> n % 2 == 0 );
	   	    System.out.println(numbers);
	   	    
	   	valid.removeIf(n -> n.charAt(0)=='S');
	    
	    //Output
	    //[5, 9, 1]
	   	 numbers.remove(Integer.valueOf(9)); //if want to remove via value intead of in dex 
	   	 System.out.println(numbers);
	   	 //[5, 1]
	   	 					
	}

}

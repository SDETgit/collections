package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL005_indexOf_lastIndexOf {

	public static void main(String[] args) {
		
		//returns -1 if not found 
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.indexOf("Ford"));
	    System.out.println(cars.indexOf("BMW"));
	    
	    //output
	    //2
	    //1
	    
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    System.out.println(cars.indexOf("Ford"));
	    System.out.println(cars.lastIndexOf("Ford"));

	  

//	    2
//	    4

	}

}

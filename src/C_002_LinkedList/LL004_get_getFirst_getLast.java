package C_002_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LL004_get_getFirst_getLast {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.get(0));
	    System.out.println(cars.get(1));
	    
//	    output:-
//	    Volvo
//	    BMW
	    System.out.println(cars.getFirst());
	    System.out.println(cars.getLast());
	    //Volvo
	    //Mazda


	}

}

package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL004_get {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.get(0));
	    System.out.println(cars.get(1));
	    System.out.println(String.valueOf("Volvo"));
	    
//	    output:-
//	    Volvo
//	    BMW
//	    Volvo


	}

}

package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL003_contains {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars.contains("BMW"));
	    System.out.println(cars.contains("Toyota"));
		
	    //Output 
	    //true
	    //false

	}

}

package C_001_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AL005_indexOf_lastIndexOf {

	public static void main(String[] args) {
		
		//returns -1 if not found 
		ArrayList<String> cars = new ArrayList<String>();
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

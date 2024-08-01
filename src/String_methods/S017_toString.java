package String_methods;

public class S017_toString {
	public static class Car {


		 String make = "Ford";
		 String model = "Mustang";
		 String color = "red";
		 int year = 2021;
		 
		 public String toString() {
		  
		  return make +"\n"+model+"\n"+color+"\n"+year;
		  
		 } 
		}
public static void main(String[] args) {
	//Converts objects to string 
//	MyClass obj = new MyClass();
//	System.out.println(obj.toString()); // Output: "MyClass@6d06d69c"'
//	
	String myStr = "Hello, World!";
	System.out.println(myStr.toString());
	//output Hello, World!

	// toString() = special method that all objects inherit, 
	  //    that returns a string that "textually represents" an object.
	  //    can be used both implicitly and explicitly
	  
	  Car car = new Car();
	  
	  
	  System.out.println(car.toString());
	  
	  // or
	  
	  System.out.println(car);

	    
	 }

}

	
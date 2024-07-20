package Output_methods;

public class O001_print {
//	%d: Integer
//	%f: Floating-point number
//	%s: String
//	%n: Platform-specific newline character
//	%x: Hexadecimal integer
	
	public static void main(String[] args) {

		
			System.out.print("Prints without new line ");
			System.out.println("Prints with new line");
			   
			    int number = 42;
		        String text = "world";
		        double floatingPoint = 3.14159;

		        System.out.printf("Hello, %s!%n", text);
		        System.out.printf("The number is %d.%n", number);
		        System.out.printf("PI to two decimal places: %.2f%n", floatingPoint);
		        
		        //output
//		        Prints without new line Prints with new line
//		        Hello, world!
//		        The number is 42.
//		        PI to two decimal places: 3.14

	}

}

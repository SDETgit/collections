package String_methods;

public class S006_equals_hashCode {
public static void main(String[] args) {
	
	//returns equals true or false if equal or not 
	String myStr1 = "Hello";
	String myStr2 = "HELLO";
	String myStr3 = "Another String";
	System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
	System.out.println(myStr1.equals(myStr3)); // false
	
	//output 
	//	false
	//	false
	
	//equalsIgnoreCase ignores the upper and lower cases 
	System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
	System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
	
	//	output
	//	true
	//	false
	
	//hashCode() returns the int value of the string 
	
	String myStr = "Hello";
	System.out.println(myStr.hashCode());
	//output 
	//69609650
	
}
}
	
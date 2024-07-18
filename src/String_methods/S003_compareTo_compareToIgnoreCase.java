package String_methods;

public class S003_compareTo_compareToIgnoreCase {
public static void main(String[] args) {
	
	//compareTo compares 2 strings based on lexicographically (means dictionary wise )
	//it converts each character into UNICODE and compares them 
	//s.compareTo(s2) returns 0 if both strings are equal 
	//a value less than 0 if s string is less than s2
	//a positive value if s string is greater than s2 
	String s = "Hello";
	String s2 = "hello";
	
	System.out.println(s.compareTo(s2));
	
	//compateToIgnnoreCase()  if we do not want to compare based on upper or lower case
	System.out.println(s.compareToIgnoreCase(s2));
	
	//output
	//	-32
	//	0

	
	}
}
	
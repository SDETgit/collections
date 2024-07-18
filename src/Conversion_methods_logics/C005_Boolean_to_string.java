package Conversion_methods_logics;

public class C005_Boolean_to_string {

	public static void main(String[] args) {
	String s = "true";
	String s2 = "True";
	String s3 = "False";
	String s4 = "Ok";
	
	//Here when converting to boolena it is not case sensitive hence true and True will return same 
	boolean b1=Boolean.parseBoolean(s);  
	boolean b2=Boolean.parseBoolean(s2);  
	boolean b3=Boolean.parseBoolean(s3);  
	boolean b4=Boolean.parseBoolean(s4);  
	
	System.out.println(b1);  
	System.out.println(b2);  
	System.out.println(b3);  
	System.out.println(b4);  
	
//	output
//	true
//	true
//	false
//	false

	
	
	
	}

}

package Conversion_methods_logics;

import java.util.Arrays;

public class C001_String_to_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		//Single car to a variable 
		char h = s.charAt(0);
		
		
		//String to char array conversion 
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
	}

}

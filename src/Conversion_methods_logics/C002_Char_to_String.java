package Conversion_methods_logics;

public class C002_Char_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'R';
		
		//1 Using Character.toString()
		
		String s = Character.toString(c);
		
		//2 Using String.valueOf()
		
		String s1 = String.valueOf(c);
		
		//3 using concatenation 
		
		String s2 = ""+c;
		
	}

}

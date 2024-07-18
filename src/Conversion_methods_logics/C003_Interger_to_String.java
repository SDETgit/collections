package Conversion_methods_logics;

public class C003_Interger_to_String {

	public static void main(String[] args) {
		
		int a = 10;
		Integer b = 20;
		//String.valueOf
		
		String s = String.valueOf(a);

		String s1 = String.valueOf(b);
		
		System.out.println(a+" "+b+" "+" String "+s+"  "+s1);
		
		//Integer.toString()
		
		String s2 = Integer.toString(a);
		String s3 = Integer.toString(b);
		

		System.out.println(a+" "+b+" "+" String "+s+"  "+s1+" "+s2+" "+s3);
	}

}

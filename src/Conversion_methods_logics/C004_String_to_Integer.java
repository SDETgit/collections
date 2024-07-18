package Conversion_methods_logics;

public class C004_String_to_Integer {

	public static void main(String[] args) {
	String s = "100";
	String s2 = "12390";
	
	//Using Integer.parseInt()
	Integer I = Integer.parseInt(s);

	Integer I2 = Integer.parseInt(s2);
	
	
	System.out.println(I+" "+I2);
	
	//Integer.ValueOf()
	
	int I3 = Integer.valueOf(s);

	int I4 = Integer.valueOf(s2);
	
	System.out.println(I3+" "+I4);
	
	double d = Double.parseDouble(s);
	long l = Long.parseLong(s2);
	
	
	
	}

}

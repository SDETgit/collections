package String_methods;

public class S002_codePointAt {
public static void main(String[] args) {
	
	//returns unicode value of particular character
	String s = "Hello";
	int re = s.codePointAt(0);
	
	System.out.println(re);
	
	String nu = " ";
	int nu1 = nu.codePointAt(0);
	System.out.println(nu1);
	
	//output
	//72
	//32

	
}
}
	
package String_methods;

public class S015_substring_subSequence {
public static void main(String[] args) {
	
	String str = "Hello, World!";
	String substr = str.substring(7); // "World!"
	System.out.println(substr);  //Here string is returned from the 7th char starting 0 
	
	String str1 = "Hello, World!";
	String substr1 = str.substring(7, 12); 
	System.out.println(substr);// World
	
	//Note :- end index is not included 
	
	
	String myStr = "Hello, World!";
	System.out.println(myStr.subSequence(7, 12)); // World
	
	
	
}
} 
	
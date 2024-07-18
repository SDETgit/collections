package String_methods;

public class S011_replace_replaceAll_replaceFirst {
public static void main(String[] args) {
	
	//public String replace(char oldChar, char newChar)
	//public String replace(CharSequence target, CharSequence replacement)
	
	String str = "Hello World";
	String result = str.replace('l', 'p');
	System.out.println(result); //Output :- Heppo Worpd
	
	
	String str1 = "Hello World";
	String result2 = str.replace("World","Java");
	System.out.println(result2); //Hello Java
	
	//replaceAll(String regex, String replacement) 
	//it is more powerful as it usses regex for replacement 
	
	//Example 1: Replace all digits
	String str3 = "abc123xyz";
    String result3 = str3.replaceAll("\\d", "*");
    System.out.println(result3);  // Outputs: abc***xyz
    
    //Example 2: Replace word
    String str4 = "cat bat rat";
    String result4 = str4.replaceAll("\\b[a-z]{3}\\b", "dog");
    System.out.println(result4); // Outputs: dog dog dog
    
    //replaceFirst(String regex, String replacement) which replaces the first substring of this 
    //string that matches the given regular expression with the given replacement.
    String str5 = "abc123xyz456";
    String result5 = str5.replaceFirst("\\d", "*");
    System.out.println(result5); // Outputs: abc*23xyz456
}
} 
	
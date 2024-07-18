package String_methods;

public class S008_endsWith_startsWith {
public static void main(String[] args) {
	
	//Used to see start and end of string containing in a string 
	//it is case sensitive 
	//startsWith(String prefix) and startsWith(String prefix, int offset)
	//endsWith(String prefix) and endsWith(String prefix, int offset)
	String myStr = "Hello";
	System.out.println(myStr.endsWith("Hel"));   // false
	System.out.println(myStr.endsWith("llo"));   // true
	System.out.println(myStr.endsWith("o"));     // true
	
	   String str = "Hello, World!";
       System.out.println(str.endsWith("World!")); // Outputs: true
       System.out.println(str.endsWith("world!")); // Outputs: false (case-sensitive)
       
       System.out.println(str.startsWith("Hello")); // Outputs: true
       System.out.println(str.startsWith("hello")); // Outputs: false (case-sensitive)
  
       
       System.out.println(str.startsWith("World", 7)); // Outputs: true
       System.out.println(str.startsWith("world", 7)); // Outputs: false (case-sensitive)
       
       //usage in checking file extensions 
              
       String fileName = "document.pdf";
       if (fileName.endsWith(".pdf")) {
           System.out.println("This is a PDF file.");
       } else {
           System.out.println("This is not a PDF file.");
       }
       
       //in url validation 
       String url = "https://www.example.com";
       if (url.startsWith("https://")) {
           System.out.println("This is a secure URL.");
       } else {
           System.out.println("This is not a secure URL.");
       }
   
       //output 
       //This is a PDF file.
       //This is a secure URL.
	
}
}
	
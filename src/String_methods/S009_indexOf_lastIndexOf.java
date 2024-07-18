package String_methods;

public class S009_indexOf_lastIndexOf {
public static void main(String[] args) {
	
	//indexOf(int ch)
	//indexOf(int ch, int fromIndex)
	//indexOf(String str)
	//indexOf(String str, int fromIndex)
	//lastIndexOf(int ch)
	//lastIndexOf(int ch, int fromIndex)
	//lastIndexOf(String str)
	//lastIndexOf(String str, int fromIndex)
	
	//returns index of char of string starting that value 
	//it is case sensitive 
	   String str = "Hello, World!";
       int index = str.indexOf('o');
       System.out.println(index); // Outputs: 4
       
       int index2 = str.indexOf('o', 5);
       System.out.println(index2); // Outputs: 8
	
       int index3 = str.indexOf("World");
       System.out.println(index3); // Outputs: 7
       
       String str2 = "Hello, World! Hello again!";
       int index4 = str2.indexOf("Hello", 5);
       System.out.println(index4);// Outputs: 14
       
       int index5 = str.lastIndexOf('o');
       System.out.println(index5); // Outputs: 8
       
       int index6 = str.lastIndexOf('o',7);  //starting 7 position backwards it will omit o at 8 position 
       System.out.println(index6); // Outputs: 4
       
       int index7 = str2.lastIndexOf("Hello");
       System.out.println(index7); // Outputs : 14
       
       int index8 = str2.lastIndexOf("Hello", 10);
       System.out.println(index8); // Outputs: 0
}
}
	
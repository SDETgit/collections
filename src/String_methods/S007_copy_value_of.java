package String_methods;

public class S007_copy_value_of {
public static void main(String[] args) {
	
	//convert char array to String 
	
	//copyValueOf(char[] data): Copies the entire array to a new string.
	
	
	  char[] data = {'H', 'e', 'l', 'l', 'o'};
	  String str = String.copyValueOf(data);
	  System.out.println(str);
	  
	  //output
	  //Hello
	  
	  
	//copyValueOf(char[] data, int offset, int count): Copies a specific range from the array, 
	//starting at offset and copying count characters.
	  char[] data2 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
      String str2 = String.copyValueOf(data2, 6, 5); // Starting at index 6, copy 5 characters
      System.out.println(str2); 
      
      // Outputs: World
	
}
}
	
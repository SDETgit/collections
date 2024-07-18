package String_methods;

import java.util.Arrays;

public class S012_split {
public static void main(String[] args) {
	
	//split(String regex): Splits the string based on the specified regular expression and returns an array of substrings.
	//split(String regex, int limit): Splits the string based on the specified regular expression and returns an array of 
	//substrings, with the maximum number of substrings determined by the limit.
	
	 String str = "apple,banana,cherry";
	 String [] result = str.split(",");
	 
	 System.out.println(Arrays.toString(result)); //output: [apple, banana, cherry]
	 
	 String str2 = "one1two2three3four";
     String[] result2 = str2.split("\\d");
     
     System.out.println(Arrays.toString(result2)); //Output : [one, two, three, four]
     
     String str3 = "apple,banana,cherry,dates";
     String[] result3 = str3.split(",", 3);
     System.out.println(Arrays.toString(result3)); //output : [apple, banana, cherry,dates]
     
     String ip = "192.168.0.1";
     String[] result4 = ip.split("\\.");
     System.out.println(Arrays.toString(result4)); //output : [192, 168, 0, 1]
     
     String path = "/usr/local/bin";
     String[] result5 = path.split("/");
     System.out.println(Arrays.toString(result5));//output : [, usr, local, bin]

}
} 
	
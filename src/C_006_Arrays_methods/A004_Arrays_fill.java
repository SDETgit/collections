package C_006_Arrays_methods;

import java.util.Arrays;

public class A004_Arrays_fill {
	public static void main(String[] args) {
		//Arrays The Arrays.fill method in Java is used to fill an array with a specific value. 
		//This method is useful when you want to initialize or overwrite the elements of an array with a single value.
		
		int [] num = new int[5];
		System.out.println(Arrays.toString(num));
		num[0] = 9;
		System.out.println(Arrays.toString(num));
		Arrays.fill(num, 4);
		System.out.println(Arrays.toString(num));
		
	//  output 
	//	[9, 0, 0, 0, 0]
	//	[4, 4, 4, 4, 4]
		
		
		//Arrays.fill(array, start, end, value)
		   int[] numbers = {1, 2, 3, 4, 5};
	        Arrays.fill(numbers, 1, 4, 9); //here 4th position(means 5th position ) will be excluded 
	        System.out.println(Arrays.toString(numbers)); // Output: [1, 9, 9, 9, 5]
	}

}

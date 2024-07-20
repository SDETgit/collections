package C_006_Arrays_methods;

import java.util.Arrays;

public class A005_Arrays_length {
	public static void main(String[] args) {
		
		//1D array
		int[] numbers = {1, 2, 3, 4, 5};
	        System.out.println("Length of numbers array: " + numbers.length); // Output: 5
	        
	    //2D array 
	        int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6, 7},
	                {8, 9}
	            };

	            System.out.println("Length of matrix: " + matrix.length); // Output: 3
	            System.out.println("Length of first row: " + matrix[0].length); // Output: 3
	            System.out.println("Length of second row: " + matrix[1].length); // Output: 4
	}

}

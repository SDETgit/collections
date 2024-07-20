package C_006_Arrays_methods;

import java.util.Arrays;

public class A003_Arrays_sort {
	public static void main(String[] args) {
		 //Arrays.sort(numbers); sort full array 
		//  Arrays.sort(numbers1, 1, 5);  Sort elements from index 1 to 4 (inclusive)
			int[] numbers = {5, 2, 9, 1, 5, 6};
	        Arrays.sort(numbers);
	        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 5, 6, 9]  
	        
	        
	        int[] numbers1 = {5, 2, 9, 1, 5, 6};

	        // Sort elements from index 1 to 4 (inclusive)
	        Arrays.sort(numbers1, 1, 5);
	        System.out.println(Arrays.toString(numbers1)); // Output: [5, 1, 2, 5, 9, 6]

	}

}

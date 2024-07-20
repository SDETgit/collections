package C_006_Arrays_methods;

import java.util.Arrays;

public class A002_Arrays_equals {
	

	public static void main(String[] args) {
		 int[] array1 = {1, 2, 3};
	        int[] array2 = {1, 2, 3};
	        int[] array3 = {1, 2, 4};

	        System.out.println(Arrays.equals(array1, array2)); // Output: true
	        System.out.println(Arrays.equals(array1, array3)); // Output: false       

	}

}

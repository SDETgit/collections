package C_006_Arrays_methods;

import java.util.Arrays;

public class A001_Arrays_compare {
	static class Person implements Comparable<Person> {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public int compareTo(Person other) {
	        int nameComparison = this.name.compareTo(other.name);
	        if (nameComparison != 0) {
	            return nameComparison;
	        }
	        return Integer.compare(this.age, other.age);
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}



	public static void main(String[] args) {
//		
//		The compare() method compares two arrays lexicographically.
//		It can compare byte,short,int,long,char,float,double,boolean arrays 
//		Returns 0 if the arrays are equal.
//		Returns a negative integer if the array1 is less than array2 lexicographically
//		Returns a positive integer if array1 is greater than array2 lexicographically.
		
		String[] cars = {"Volvo", "BMW", "Tesla"};
		String[] cars2 = {"Volvo", "BMW", "Tesla"};

		System.out.println(Arrays.compare(cars, cars2)); 
		
			String[] array1 = {"apple", "banana", "cherry"};
	        String[] array2 = {"apple", "banana", "cherry"};
	        String[] array3 = {"apple", "banana", "date"};
	        
	        int result1 = Arrays.compare(array1, array2);

	        int result2 = Arrays.compare(array2, array3);

	        int result3 = Arrays.compare(array3, array1);
	        
	        // Compare array1 and array3
	        System.out.println("Comparing array1 and array2: " + result1); // Output: 0

	        // Compare array1 and array3
	      
	        System.out.println("Comparing array1 and array3: " + result2); // Output: -1

	        // Compare array3 and array1
	        
	        System.out.println("Comparing array3 and array1: " + result3); // Output: 1
	        
	        
//	        //output 
//	        Comparing array1 and array2: 0
//	        Comparing array1 and array3: -1
//	        Comparing array3 and array1: 1
	        
	        // Create and initialize arrays of Person objects
	        Person[] people = {
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 35)
	        };

	        Person[] people2 = {
	            new Person("Alice", 30),
	            new Person("Bob", 25),
	            new Person("Charlie", 35)
	        };

	        Person[] people3 = {
	            new Person("Alice", 30),
	            new Person("Bob", 20),
	            new Person("Charlie", 35)
	        };

	        // Compare arrays
	        int result11 = Arrays.compare(people, people2);
	        int result21 = Arrays.compare(people, people3);
	        int result31 = Arrays.compare(people3, people);

	        System.out.println("Comparing people with people2: " + result11); // Output: 0
	        System.out.println("Comparing people with people3: " + result21); // Output: 1
	        System.out.println("Comparing people3 with people: " + result31); // Output: -1	        

	}

}

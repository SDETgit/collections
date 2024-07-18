package String_methods;

public class S016_valueOf {
public static void main(String[] args) {
	
	//In Java, String.valueOf() is a static method provided by the String class 
	//that converts different types of data, including primitive types and objects, into their string representations.
	
	int num = 123;
	String str1 = String.valueOf(num); // "123"

	double pi = 3.14159;
	String str2 = String.valueOf(pi); // "3.14159"

	boolean flag = true;
	String str3 = String.valueOf(flag); // "true"
	
	System.out.println(str1+" "+str2+" "+str3);
	
	char[] charArray = {'a', 'b', 'c'};
	String str4 = String.valueOf(charArray); // "abc"
	System.out.println(str4);
	
	Object obj = new Object();
	String str5 = String.valueOf(obj); // java.lang.Object@38cccef
	System.out.println(str5);
}
} 
	
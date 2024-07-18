package String_methods;

public class S010_matches {
public static void main(String[] args) {
	
	//the matches method in the String class is used to check 
	//if the string matches a given regular expression. It is a powerful method for pattern matching and validation tasks.
	//public boolean matches(String regex)
	
	//Check if a string contains only digits.
	String str = "12345";
     boolean isMatch = str.matches("\\d+"); // \\d+ means one or more digits
     System.out.println(isMatch); // Outputs: true
     
    // Example 2: Email Validation
     String email = "example@example.com";
     String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
     boolean isMatch1 = email.matches(emailRegex);
     System.out.println(isMatch1); // Outputs: true
     	
     //Example 3: Phone Number Validation
     String phoneNumber = "123-456-7890";
     String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";
     boolean isMatch3 = phoneNumber.matches(phoneRegex);
     System.out.println(isMatch3); // Outputs: true
}
}
	
package Date_Time_mothod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D004_DateTime_formatter {

	public static void main(String[] args) {
			
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
	    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

	    DateTimeFormatter myFormatObj4 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	    String formattedDate = myDateObj.format(myFormatObj);
	    String formattedDate2 = myDateObj.format(myFormatObj2);
	    String formattedDate3 = myDateObj.format(myFormatObj3);
	    String formattedDate4 = myDateObj.format(myFormatObj4);
	    System.out.println("After formatting: " + formattedDate);
	    System.out.println("After formatting: " + formattedDate2);
	    System.out.println("After formatting: " + formattedDate3);
	    System.out.println("After formatting: " + formattedDate4);

	    //output 
//	    Before formatting: 2024-07-18T14:03:55.006217100
//	    After formatting: 18-Jul-2024 14:03:55
//	    After formatting: 18-07-2024 14:03:55
//	    After formatting: Thu, Jul 18 2024 14:03:55
//	    After formatting: 18-07-2024

			
			
			
	}

}

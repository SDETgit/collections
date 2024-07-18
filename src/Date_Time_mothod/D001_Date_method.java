package Date_Time_mothod;

import java.time.LocalDate;
import java.time.LocalTime;

public class D001_Date_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LocalDate date = LocalDate.now();
			
			System.out.println(date);
			LocalDate yesturday = date.minusDays(1);
			LocalDate Tomorrow = date.plusDays(1);
			

			System.out.println(date+" "+yesturday+" "+Tomorrow);
			//Leap year  
			LocalDate date2 = LocalDate.of(2017, 01, 13);
			System.out.println(date2.isLeapYear());
			
			
			//to display current time 
			LocalTime lt = LocalTime.now();
			System.out.println(lt);
			
//			output 
//			2024-07-18
//			2024-07-18 2024-07-17 2024-07-19
//			false
//			13:55:45.347746300

	}

}

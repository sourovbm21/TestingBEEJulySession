package Java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Date {

	public static void main(String[] args) {


//	    LocalDateTime localDateTime = LocalDateTime.parse("2/11/2022");
//
//	    localDateTime = localDateTime.minusDays(5);
//	    System.out.println(localDateTime);
	    
	    
	 // DateTimeFormatterBuilder provides custom way to create a
	    // formatter
	    // It is Case Insensitive, Nov , nov and NOV will be treated same
	    DateTimeFormatter f = new DateTimeFormatterBuilder().parseCaseInsensitive()
	            .append(DateTimeFormatter.ofPattern("yyyy-MMM-dd")).toFormatter();
	    try {
	        LocalDate datetime = LocalDate.parse("2019-DeC-22", f);
	        System.out.println(datetime); // 2019-12-22
	    } catch (DateTimeParseException e) {
	        // Exception handling message/mechanism/logging as per company standard
	    }
	    
//	    DateTimeFormatter df = new DateTimeFormatterBuilder()
//	    	    // case insensitive to parse JAN and FEB
//	    	    .parseCaseInsensitive()
//	    	    // add pattern
//	    	    .appendPattern("dd.MM.yyyy")
//	    	    // create formatter (use English Locale to parse month names)
//	    	    .toFormatter(Locale.ENGLISH);
//	    
//	    LocalDateTime localDateTime = LocalDateTime.parse("2.11.2022",df);
//	   
//   	    localDateTime = localDateTime.minusDays(5);
//	    	    System.out.println(localDateTime);
		
	    	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");  
	    	    
	    	    String str = "07.11.2022";
	    	     String newSt = str.replace(".", "-");
	    	     System.out.println("Date after replace all "+newSt);
	    	     
//	    	    LocalDateTime dateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//	    	    dateTime.plusMonths(3);      //  => output: 13/02/2021
//	    	    System.out.println(dateTime);
	    	    
	    	    LocalDate date = LocalDate.parse(newSt, DateTimeFormatter.ofPattern("dd-MM-uuuu"));
	    	    //date = date.plusMonths(3);
	    	    //date = date.plusMonths(3);
	    	    date = date.minusDays(1);
	    	   
	    	  
	    	    System.out.println("Given date is : --> "+newSt);
	    	    System.out.println("Date after minus : --> "+ date);
	    	    
	    	    
	    	    System.out.println("<---- Solution  is : --> ");  
	    	    System.out.println();
	    	    
	    	    String std = "07.11.2020";//before date 0 is must
	    	    System.out.println("Given date is : --> "+std);
	    	    // String std = str2.replace(".", "-");
	    	     //System.out.println("Date after replace all --> "+std);
	    	   DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
	    	    LocalDate dateTime = LocalDate.parse(std, dateTimeFormatter);
	    	    LocalDate newDateTime = dateTime.minusDays(1); // => output: 13/02/2021
	    	    System.out.println("New Date after changes --> "+newDateTime.format(dateTimeFormatter));
	    	    System.out.println("fdgansgsdt   "+getDate("08.09.2019",2));
	}
	
	public static String getDate(String std,int x) {
		
	   // String std = "07.11.2020";//before date 0 is must
	   // System.out.println("Given date is : --> "+std);
	    // String std = str2.replace(".", "-");
	     //System.out.println("Date after replace all --> "+std);
	   DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");
	    LocalDate dateTime = LocalDate.parse(std, dateTimeFormatter);
	    LocalDate newDateTime = dateTime.minusDays(x); // => output: 13/02/2021
	     //newDateTime.format(dateTimeFormatter);
	    return newDateTime.format(dateTimeFormatter);
	    //return newDateTime;
	}

}

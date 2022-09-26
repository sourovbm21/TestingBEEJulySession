package Java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClassOne {
	
	
	
	

	    
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=300000000;
		long ph=0000000000000000000000000000000000000000000000000l;
		String yy="Sourov";
		
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fm.format(now));
	
		
	
	}

	





   }

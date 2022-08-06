package Modifier01;

import java.util.Date;
import java.util.Random;

public class Test extends ClassOne{
	
	

	public static void main(String[] args) {
		
		
		//ClassOne  classone = new ClassOne();
		
		ClassOne.Cone();
		System.out.print(":-> ");
		Modifier02.Test02.Hi();
		
		
		Test test = new Test();
		
		test.prot();
		
		
		
		
	System.out.println("i am sourov");


	for ( int i= 1; i <=100;i++ ) {
		
		System.out.println("i am sourov :--> "+i);
		
		if (i % 2 ==0 ) {
			System.out.println("i am a even number:--> "+i);
		}
	}
	
	
	int s=5;
	while (s <= 5) {
		System.out.println("i am less then 5 ");
		break;
	}
	
	
	
//		
//		
//		ClassTwo classtwo =new ClassTwo();
//		
//		classtwo.CTwo();
		
		Date D = new Date();
		D.getDate();
		System.out.println(D.getDate());
		System.out.println(D);
		
		Random r = new Random();
		
		

	}

}

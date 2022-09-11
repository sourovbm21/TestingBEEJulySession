package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopConcept {

	public static void main(String[] args) {
		
		
		//For loop 
		
		
		
		//While Loop
		//While loop condition has to be true and only accept only one arguments.
		
		int i=1; int n=5;
		
		while (i<=n) {
			System.out.println(i);
			
			i++; //i=i+1;
			
			
		}
		
		
		
		//Do while Loop
		System.out.println("inside the do while loop ");
		
		int x=1; int y=5;
		
		
		do {
			
			System.out.println(x);
			x++;//x = x+1;
			
		}while (x<=y);
	
		
		List<String> al = new ArrayList();
		al.add("january");
		al.add("February");
		al.add("March");
		al.add("December");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		List<Integer> a = new ArrayList();
		a.add(1);
		a.add(7);
		a.add(3);
		a.add(8);
	
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		
		
	
	
	}

}

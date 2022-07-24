package Java;

public class StringConcept {

	public static void main(String[] args) {
		

		
		/*
		 * 
		 * Two ways to create string 
		 * String literal etc : String s = "i like automating software";
		 * by using new memory operator. etc : String   st = new String("like automating software");
		 * Using String buffer and String builder
		 * 
		 */
		
		
		
		
		
		     String str ="We are learning java";
		     System.out.println("Total length of \"We are learning java\" "+str.length()); 
		     System.out.println(str.charAt(2));
		     System.out.println("i am first occarance " +str.indexOf("a"));//First occurance.
		     System.out.println("i am second occarance " + str.indexOf("a",str.indexOf("a")+1));
		     System.out.println("i am 3rd  occarance " + str.indexOf("a",str.indexOf("a",str.indexOf("a")+1)));
		     System.out.println("i am last occarance " + str.lastIndexOf("a"));
		    
		     
		
		//String concatination   
		     
		     String s="tohidur";
		     String r="rahman";
		     
		     s.concat(r);// it will add tohidur + rahman
		     System.out.println( s.concat(r));
		                           
		 //Substring //"We are learning java";//+111-0000-34567
		     str.substring(0, 5);
		     
		     System.out.println(str.substring(4, 14)); // i will cut from 4th index to before 14th index on that given string.
		     
		 //String comparison
		     String s1="sourov.";
		     String s2="rahman";
		     s1.equals(s2);//==
		     System.out.println(s1.equals(s2));//t/f/f
		     System.out.println(s1.equalsIgnoreCase(s2));//t/t/f
		    
		  //trim
		     
		    String p = "      i am on train ";
		   System.out.println("before trim :"+p);
		   String   p1=p.trim();//i am  on train
		   System.out.println("after trim :"+p1);
		   
		   
		  //Split 
		   // javalearning//ava,earning
		   String x ="java learning class";
		String  sarry[] =  x.split(" ");//"java" , "learning" , "class"
		
		for (int i=0;i<sarry.length;i++ ) {
			 System.out.println("inside loop and printin an array :---> "+sarry[i]);
			
		}
		
		 //task 
		     
		String w ="java ";
		String y="learning";
		int a=2;
		int b=3;
		
		   System.out.println(w+y);//java learning
		
		   System.out.println(a+b);//5
		   System.out.println(w+y+a+b); //java learning23
		   System.out.println(a+b+w+y);//5java learning//23//
		   System.out.println(w+y+(a+b)); //
		   
	int bc=0;//-10
	
	if (bc>=0) {
		  System.out.println("yes it is positive number "+bc);//5
	}else {
		System.out.println("yes it is negative  number "+bc);//5
	}
	
	
	

	}

}

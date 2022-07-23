package Java;

public class StringConcept {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Two ways to create string 
		//String literal,by using new memory operator. 
		
		//ClassOne  classone = new ClassOne();
		
		String str ="We are learning java";
		     System.out.println(str.length()); 
		     System.out.println(str.charAt(2));
		     System.out.println(str.indexOf("a"));//First occurance.
		     System.out.println("i am second occarance " + str.indexOf("a",str.indexOf("a")+1));
		     
		
		//String concatination   
		     
		     String s="tohidur";
		     String r="rahman";
		     
		     s.concat(r);
		     System.out.println( s.concat(r));
		                            //13
		 //Substring //"We are learning java";//+111-0000-34567
		     str.substring(0, 5);
		     
		     System.out.println(str.substring(4, 14)); 
		     
		

	}

}

package Java;

public class StringConcept {

	public static void main(String[] args) {
		

		
		/*
		 * 
		 * Two ways to create string 
		 * String literal etc : String s= "i like automating software";
		 * by using new memory operator. etc : ClassOne  classone = new ClassOne(" like automating software");
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
		     
		 //Please do your own practise.  
		     
		

	}

}

package OOP1;

public class Test {

	
	
	
	
	public static void main(String[] args) {


      // WebDriver driver = new ChromeDriver();
	
//ChromeDriver driver = new ChromeDriver();
	
DBBL dbbL = new DBBL();//Static polymorphism
		
	//all the object of dbbL class will be accessible 
		dbbL.credit();
		dbbL.credit();
		dbbL.carloan();	
		dbbL.can_accept_russian_rubel();
		dbbL.can_not_cell_doller();
		dbbL.healthLoan();
		dbbL.homeloan();
		dbbL.loan();
		dbbL.mortgage();
		dbbL.studentloan();
		
//		
//child  class object can be referred by parent interface/class referred variable.
//Only overridden method will be accessible
		
          BB  bb = new DBBL();//Dynamic polymorphism//Runtime // Top casting 
         
         
          
//
    FDR fdr      = new DBBL();
   
	  
	
    
    
    
    
    
    //Abstraction
      /*
       * inter  
       * abs class 
       */

		
	

		
		
		
		
	}

}

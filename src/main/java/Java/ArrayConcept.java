package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayConcept {

	public static <E> void main(String[] args) {
	

	//static 	
	//2D & 3D array
		
	 int  a[] 	= new int [3];
	 
	 a[0] = 1;
	 a[1] =2;
	 a[2]=3; 
	
	 
	 for (int i =0;i<3;i++) {
		 
		 System.out.println(a[i]);//a[0] =1;
		 System.out.println(a[i]);//a[1] =2;
		 
		 
	 }
	 
	 int  a1[][] 	= new int [2][2];
	 
	 a1[0][0]= 2;
	 a1[0][1] =3;
	 a1[1][0]= 3;
	 a1[1][1]=0;
	 
	 
	 //Dynamic 
	 
	 /*
	  * its dynamic array 
	  * can contain duplicate value or elements
	  * Synchronized /Thread safe 
	  * preserve insertion order 
	  * 
	  * 
	  * 
	  */
	 
	 ArrayList  al = new  ArrayList();
	
	
	 
	 al.add(1);//0
	 al.add("sourovG");//1
	 al.add(2.50);//2
	 al.add(true);//3
	 al.add("sourov");//4
	
	 
	 
	 
System.out.println("arry size "+al.size());
System.out.println(al.get(4));

//How to print an array

  // for loop 
                   

    for (int i =0; i<al.size();i++) {
    	
    	System.out.println("using for loop "+al.get(i));
    	
    }
  
    
	System.out.println("**************");
  // iterator 
     //next 
    //hasNext 
    
  Iterator   its = al.iterator();
  
	 while (its.hasNext()) {
		 
		 System.out.println("using iterator "+ its.next());
	 }
	 
	 
	 //generic 
	 
	 ArrayList <Integer> al2 = new  ArrayList<Integer>();
	 ArrayList<Boolean>  al3 = new  ArrayList<Boolean>();
	 ArrayList  <E> al5 = new  ArrayList<E >();
	 
	 
	 
	 ArrayList  <Object> al4 = new  ArrayList<Object >();
	 
	 Student studentOne = new Student("sourov",27,"science");
	 Student studentTwo = new Student("Banna",47,"science");
	 Student studentThree = new Student("Saikat",37,"science");
	 Student studentFour = new Student("Huzza",57,"Art");
	 
	 
	 al4.add(studentOne);
	 al4.add(studentTwo);
	 al4.add(studentThree);
	 al4.add(studentFour);
	 
	 //Iterator 
	      
	   Iterator <Object> it = al4.iterator();
	   
	      while (it.hasNext()) {
	    	  Student  st = (Student) it.next();
	    	  System.out.println( st.name);
	    	  System.out.println( st.age);
	    	  System.out.println( st.dept);
 
	      }
	 
	 
	 ArrayList<String> as = new ArrayList <String>();//10
	 
	 System.out.println("size of as  arry : ----> "+as.size());
	 
	 as.add("java");
	 as.add("java");
	 System.out.println("size of as  arry : ----> "+as.size());
	 
	 
	 ArrayList<String> ass = new ArrayList <String>();
	 
	 LinkedList<String> ak = new LinkedList <String>();
	//vector , stack 
	
	//list 
	


	}

}

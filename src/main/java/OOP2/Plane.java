package OOP2;

public abstract class Plane {
	
	
	/*
	 * Can have abstruct and no abastract method both.
	 * Can't create an object 
	 * Can create constructor
	 * 
	 */
	
	
	Plane(){
		System.out.println("inside parent class ");
	}
	
	
	public abstract void start ();
	
	public void stop() {
		System.out.println("i am inside Plane stop  ");
	}
	
	
	public void fuel() {
		System.out.println("i am inside Plane fuel");
	}
	
	public void refuel() {
		System.out.println("@@@@@@i am inside Plane refuel");
	}
	
	
	
	


}

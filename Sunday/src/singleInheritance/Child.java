package singleInheritance;

public class Child extends Parent{
	
	public void Job () {
		
		System.out.println("Child Job");
		
	}
	
	public void Bike () {
		
		System.out.println("Child Bike");
		
	}
	
	public static void main (String arg[]) {
		
		Child A = new Child();
		A.Bike();
		A.Job();
		A.Car();
		A.Home();
		A.Land();
		A.Property();
		
		
		
	}

	
		

}

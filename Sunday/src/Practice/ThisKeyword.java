package Practice;
//this.Keyword not used in static methods
public class ThisKeyword {
	
			public static void main (String arg[]) {
				ThisKeyword A = new ThisKeyword();
				A.add();
				A.sub();
				mul();
			}
			
					int a = 10;
					int b = 40;
					
					static int c = 10;
					static int d = 20;
					
		
				public void add() {
					int a=10;					//Local Variable=particular, static & non static
					int b=20;
					System.out.println(this.a+this.b);	
				}
				
				public void sub() {				// Instance-Global = variables need to be declared outside method globally
					
					System.out.println(a+b);
					
				}
				
				public static void mul() {		// Instance-Global = variables need to be declared outside method globally
					
					System.out.println(c*d);  	// Static Var= Var need to assign as na static and it can run on static and non static method	
					
				}
				

}

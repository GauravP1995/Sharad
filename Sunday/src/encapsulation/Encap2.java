package encapsulation;

public class Encap2 {
	
					private int age;
					private String name;
				
					public void setage(int age) 
					{
						this.age = age;
					}
					public void setname(String name) 
					{
						this.name = name;
					}

					public int getage() {
					
						return age;	
					}
					public String getname() {
						
						return name;	
					}
					
					
					public static void main (String arg[]) {
						
						Encap2 A = new Encap2();
						A.setage(100);
						A.setname("Omkar");
						
						
						System.out.println(A.getage());
						System.out.println(A.getname());
						
					}
					

}

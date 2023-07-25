package interfaceMethod;

public class MasterCard implements DebitCard{


	public void Rupees() {
		
		System.out.println("CreditCard Method");
		
		
	}

	public void euro() {
		
		System.out.println("DebitCard Method");
		
	}
		public static void main (String arg[]) {
			
			MasterCard A = new MasterCard();
			A.euro();
			A.Rupees();
			
			
		}

	

}

package in.ashokit.beans;

public class DebitCardPayment implements IPayment{
	
	public DebitCardPayment() {
		System.out.println("Debit Card Payment :: Constructor");
	}

	public boolean processPayment(double Amt) {
		// TODO Auto-generated method stub
		System.out.println("Debit Card Payment done");
		return true;
	}
	
	

}

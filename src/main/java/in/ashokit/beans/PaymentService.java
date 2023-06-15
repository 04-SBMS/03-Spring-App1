package in.ashokit.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	public PaymentService(){
		System.out.println("Payment Service :: Constructor");	
	}
	
	public void doPayment() {
		boolean status = payment.processPayment(100);
		if(status) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Failure");
		}
	}
}

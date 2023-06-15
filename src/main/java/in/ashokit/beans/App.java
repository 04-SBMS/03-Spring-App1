package in.ashokit.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//		CreditCardPayment ccpayment = (CreditCardPayment) ctx.getBean("credit");
//		boolean status = ccpayment.processPayment(100);
//		if(status) {
//			System.out.println("Success");
//		}
//		else {
//			System.out.println("Failure");
//		}
		PaymentService service = ctx.getBean(PaymentService.class);
		service.doPayment();
	}

}

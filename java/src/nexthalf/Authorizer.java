package nexthalf;

public class Authorizer{
	public static void main(String[] args) {
		//creating the reference objects
		Paymentprocess preprocess= new Paymentprocess();
		
		Payment CreditCard = new Creditcard();
		
		Payment Paypal = new Paypal();
		
		//printing the output
		preprocess.processpayments(CreditCard, 58241.3325);
		
		preprocess.processpayments(Paypal, 456783.2136);
	}
}
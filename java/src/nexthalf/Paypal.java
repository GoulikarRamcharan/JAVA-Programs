package nexthalf;

public class Paypal implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Transaction Successful for amount "+" "+amount+" "+"Via Paypal");
		
	}
	
}
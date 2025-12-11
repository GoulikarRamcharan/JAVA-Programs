package nexthalf;

public class Creditcard implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Tramsaction Successful For amount:"+" "+amount+" "+"Via Credit Card");	
	}

}

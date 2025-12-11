 package exceptions;

public class Acmain {

	public static void main(String[] args) {
		Account accn = new Account ("Savings",15423,6000);
		
		Customer crr = new Customer("Ramcharan","Mamatha Nagar Colony",6523,(long)789378793,accn);
		
		System.out.println("Printing the Details==---===---==--");
		crr.getcust();
		System.out.println("Printing The Intrest:========");
		
		try {
			double ci =accn.compundintrest(6, 5);
			System.out.println("the compound intrest is :"+ci);
		} catch (NegativeBalanceException e) {
			System.err.println(e);
		}
	}

}

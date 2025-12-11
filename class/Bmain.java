class Bmain{
public static void main(String[] args) {
 		BankAccount b = new BankAccount();

 		b.setDetails(8977,"Savings",9000);
 		b.displaydetails();

 		b.withdraw(3000);
 		b.deposite(4000);
 		b.intrestrate();
 	}


}
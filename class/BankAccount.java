class BankAccount{
	private int accno;
	private String accType;
	private int balance;
	static int intrest;
	static{
		intrest = 9;
	}
 	void setDetails(int accno,String accType , int balance){
 		this.accno = accno;
 		this.accType = accType;
 		this.balance = balance;

 	}
 	void withdraw(int amount){
 		if (this.balance <  amount) {
 			System.out.println("Insufficient money");
 		}
 		else {
 			balance -= amount;
 			System.out.println("Money withdrawn"+amount);
 		}
 	}
 	void deposite(int amount){
 	 		balance += amount;
 	 		System.out.println("Amount entered"+balance);
 	}
 	int intrestrate(){
 			int intrestrated = ((balance * intrest)/100);
 			System.out.println("the intrest amount on balance is:"+intrestrated);
 			return intrestrated;
 	}
 	void displaydetails(){
 		System.out.println("Account no:"+accno);
 		System.out.println("Account type:"+accType);
 		System.out.println("Account balance:"+balance);
 		System.out.println("the intrest amount on balance is:"+intrestrate());
 	}
 	
}
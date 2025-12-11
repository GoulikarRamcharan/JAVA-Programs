package exceptions;

public class Account {
		private String acctype;
		private int accno;
		private int accbalance;
		
		
		public Account(String acctype, int accno, int accbalance) {
			this.acctype = acctype;
			this.accno = accno;
			this.accbalance = accbalance;
		}
		
		public double compundintrest(int rate, int term ) throws NegativeBalanceException {
			if(accbalance < 0 ) {
				throw new NegativeBalanceException("Insufficient balance please add balance");
			}
			
			return (accbalance * rate * term )/ 100 ;
		}
		
		public void accdisplay() {
			System.out.println("Account Type is:"+acctype);
			System.out.println("Account No is:"+accno);
			System.out.println("Account Balance is:"+accbalance);
			
		}
		
}

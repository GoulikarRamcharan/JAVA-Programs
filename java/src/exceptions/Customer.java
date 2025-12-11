package exceptions;

public class Customer {
			private String Cname;
			private String Caddr;
			private int cid;
			private long cphn;
			private Account account;
			public Customer(String cname, String caddr, int cid, long cphn, Account account) {
				Cname = cname;
				Caddr = caddr;
				this.cid = cid;
				this.cphn = cphn;
				this.account = account;
			}
			
			public void getcust() {
				System.out.println("Customer Name is:"+Cname);
				System.out.println("Customer Address is:"+Caddr);
				System.out.println("Customer Id is:"+cid);
				System.out.println("Customer Phone  is:"+cphn);
				System.out.println("Customer Account Details is=============");
				account.accdisplay();
			}
}

package com.company.accounts;

public class Account {
			//creating the variables 
			protected int accid;
			protected String accname;
			protected Long accphn;
			protected double accsalary;
			
			//using the constructor to initalize the data in it
			public Account(int accid, String accname, Long accphn, double accsalary) {
				
				this.accid = accid;
				this.accname = accname;
				this.accphn = accphn;
				this.accsalary = accsalary;
			}
			
			public void getacc() {
				System.out.println("This is from Accounts !!!!");
				System.out.println(accid+" "+accname+" "+accphn+" "+accsalary);
			}
			
			
}

package com.company;

import com.company.accounts.Account;
import com.company.hr.Employee;

public class CompanyTest {
	public static void main(String[] args) {
	
		//creating the reference objects
		Account acc = new Account(1542,"Ramcharan",(long) 924692329,55246.32);
		
		Employee emp = new Employee("Ramcharan",1542,"Junior enginer",(long) 924692932);
		
		//printing the output
		
		acc.getacc();
		
		emp.getemp();
}
}

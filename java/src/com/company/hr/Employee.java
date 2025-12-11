package com.company.hr;

public class Employee {
		//creating the variables
		protected String ename;
		protected int eid;
		protected String edesg;
		protected Long ephn;
		
		//using constructor to initalize data 
		public Employee(String ename, int eid, String edesg, Long ephn) {
			this.ename = ename;
			this.eid = eid;
			this.edesg = edesg;
			this.ephn = ephn;
		}
		
		//using the getter
		public void getemp() {
			System.out.println("This is from HR!!!!");
			System.out.println(ename+" "+eid+" "+edesg+" "+ephn);
		}
		
		
}

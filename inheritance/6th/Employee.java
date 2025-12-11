class Employee extends Member{
		private String specilization;
		
		
		public Employee(String mname,int mage,int mphn,String maddr,int msalary,String specilization){
			super(mname,mage,mphn,maddr,msalary);
			this.specilization = specilization;
				
		}

		public void getedetails(){
			System.out.println("name is:"+mname+" \n"+"age is:"+mage+" \n"+"phone number is:"+mphn+" \n"+"address is:"+maddr+" \n"+"salary is:"+msalary+" \n");
			System.out.println("spelization is:"+specilization);
		}
}
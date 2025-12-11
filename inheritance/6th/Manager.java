class Manager extends Member{
		private String dept;
		

		public Manager(String mname,int mage,int mphn,String maddr,int msalary,String dept){
			super(mname,mage,mphn,maddr,msalary);
			this.dept = dept;
				
		}

		public void getmdetails(){
			System.out.println("name is:"+mname+" \n"+"age is:"+mage+" \n"+"phone number is:"+mphn+" \n"+"address is:"+maddr+" \n"+"salary is:"+msalary+" \n");
			System.out.println("department is:"+dept);
		}


}
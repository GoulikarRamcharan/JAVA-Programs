class Emp extends Person{
	private int empid;
	private double empsal;

	public void setperson(String pername,int perage,int empid,double empsal){
		super.setperson(pername,perage);
		this.empid = empid;
		this.empsal = empsal;
	}
	public void getperson(){
		super.getperson();
		System.out.println("the emp id is:"+empid+"\n"+"the emp salary is:"+empsal);
	}
}
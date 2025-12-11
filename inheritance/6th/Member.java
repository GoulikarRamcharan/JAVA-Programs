class Member{
	protected String mname;
	protected int mage;
	protected int mphn;
	protected String maddr;
	protected int msalary;

	public Member(String mname,int mage,int mphn,String maddr,int msalary){
		this.mname = mname;
		this.mage = mage;
		this.mphn = mphn;
		this.maddr = maddr;
		this.msalary = msalary;

	}
	public void printsalary(){
		System.out.println("member salary is:"+msalary);
	}	
}
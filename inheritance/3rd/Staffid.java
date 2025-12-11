public class Staffid extends Staff{
	protected int staffid;
	protected double staffsalary;

	public void setstaffid(String name,int age,int staffid,double staffsalary){
		//calling parent class setstaff
		setstaff(name,age);
		this.staffid = staffid;
		this.staffsalary = staffsalary;
	}
	public void getstaffid(){
		getstaff();
		System.out.println("This is Child class");
		System.out.println("staff id is:"+staffid+"\n"+"staff salary is:"+staffsalary);
	}
}
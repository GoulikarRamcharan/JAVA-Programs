public class Storemanager extends Staffid{
	protected String staffpost;
	protected int bonous;

	public void setstoreman(String name,int age,int staffid,double staffsalary,String staffpost,int bonous){
		//calling parent class setstaffid
		setstaffid(name,age,staffid,staffsalary);
		this.staffpost = staffpost;
		this.bonous = bonous;
	}
	public void getstoreman(){
		getstaffid();
		System.out.println("This is Child child class");
		System.out.println("staff position is:"+staffpost+"\n"+"staff bonous is:"+bonous);
	}
}
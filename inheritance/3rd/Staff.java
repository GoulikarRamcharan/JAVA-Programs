public class Staff{
	protected String name;
	protected int age;

	public void setstaff(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void getstaff(){
		System.out.println("This is parent class");
		System.out.println("staff name is:"+name+"\n"+"staff age is:"+age);
	}
}
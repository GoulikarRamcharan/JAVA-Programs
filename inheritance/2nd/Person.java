public class Person{
	protected String pername;
	protected int perage;

	public void setperson(String pername,int perage){
			this.pername = pername;
			this.perage = perage;

	}
	public void getperson(){

		System.out.println("person name is:"+pername+"\n"+"person age is:"+perage);
	}

}
public class Studentdetails{
	private String stuname;
	private int stuage;
	private double stucgpa;

	public Studentdetails(String stuname,int stuage,double stucgpa){

		this.stuname = stuname;
		this.stuage = stuage;
		this.stucgpa = stucgpa;
	}
	@Override
	public  String toString(){
		return stuname+" "+stuage+" "+stucgpa;
	}

}
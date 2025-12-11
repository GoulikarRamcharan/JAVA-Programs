class Person{	
	 String pname;
	 int page;
	 String pcountry;
	

	void setData(String n,int a,String c){
		pname = n;
		page = a;
		pcountry = c;
	}
	void getData(){
		System.out.println(pname+" "+page+" "+pcountry);
		
	}
	public static void main(String[] args) {
		//creating an object
		Person ps = new Person();

		//inserting the data in object
		ps.setData("Ramcharan",23,"India");

		//displaying the data
		ps.getData();	
	}
}
class Personcon{	
	 String pname;
	 int page;
	 String pcountry;
	
	Personcon(String name,int age,String country){
			pname = name;
			page = age;
			pcountry = country;
	}
	void getpdetails(){
		System.out.println(pname+" "+page+" "+pcountry);
	}
}
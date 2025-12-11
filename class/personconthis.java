class Personconthis{	
	 String pname;
	 int page;
	 String pcountry;
	
	Personconthis(String name,int age,String country){
			this.pname = name;
			this.page = age;
			this.pcountry = country;
	}
	void getptdetails(){
		System.out.println(pname+" "+page+" "+pcountry);
	}
	void cmpage(Personconthis p1 , Personconthis p2){
		if (p1.page > p2.page) {
			System.out.println(p1.pname+" "+"is greater");
		}
		else{
			System.out.println(p2.pname+" "+"is greater");
		}
	}
}

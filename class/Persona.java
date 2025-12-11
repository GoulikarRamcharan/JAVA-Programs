public class Persona{	
	 private String pname;
	 private Address address;

	public Persona(String pname,Address address){
		this.pname = pname;
		this.address = address;
	}
	@Override
	public  String toString(){
		return pname+" "+address;
	} 
	
}
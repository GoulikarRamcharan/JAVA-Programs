public class Personamain{
	public static void main(String[] args) {
		//creating an object
		Address addr = new Address("Mamatha nagar","Hyderabad","TG");

		Studentdetails studet = new Studentdetails("Ram",23,9.2);
		Persona ps = new Persona("Ramcharan",addr);

		//displaying the data
		System.out.println(ps);	
		System.out.println(studet);
	}
}
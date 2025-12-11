public class permain{
	public static void main(String[] args) {
		//creating the reference
		Person ps = new Person();

		Emp ep = new Emp();

		//setting the data and displaying according to class 
		ps.setperson("Ramcharan",23);
		System.out.println("------personsclass------");
		ps.getperson();

		ep.setperson("goulikar",23,1577,300000);
		System.out.println("-------emp data--------");
		ep.getperson();

	}
}
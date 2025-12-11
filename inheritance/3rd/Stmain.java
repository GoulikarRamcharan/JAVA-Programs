public class Stmain{
	public static void main(String[] args) {
		//demonstration of the multilevel inheritance

		//creation of reference object
		Storemanager stm = new Storemanager();

		stm.setstoreman("Ramachary",25,24578,150000,"POC",15000);
		System.out.println("-----displaying of multilevel inheritance-------");

		//printing 
		stm.getstoreman();
		
	}
}
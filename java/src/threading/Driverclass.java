package threading;

public class Driverclass {

	public static void main(String[] args) throws Exception {
		//creating the thread reference objects
		primenfab pnf = new primenfab();
		fabnprime fnp = new fabnprime();
		
		//staring the thread using reference objects 
		pnf.start();
		fnp.start();
		
		//using the thread join to make thread work in sychronization
		pnf.join();
		fnp.join();
		
		//creating the reference onject for common
		primenfabcompare pnfc = new primenfabcompare(pnf.primes,fnp.fabs);
		
		pnfc.start();
		

	}

}

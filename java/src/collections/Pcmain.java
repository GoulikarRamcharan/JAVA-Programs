package collections;

public class Pcmain {
		public static void main(String[] args) throws Exception {
			Primes p1 = new Primes();
			
			Fabbinocci f1 = new Fabbinocci();
			
			p1.start();			
			
			
			//joining the thread one by one
			
			p1.join();

			f1.start();

			f1.join();
			
			//creating a common thread 
			Commonpnf cpf = new Commonpnf(p1.primes,f1.fab);
			
			cpf.start();
			
			cpf.join();
			
		}
}

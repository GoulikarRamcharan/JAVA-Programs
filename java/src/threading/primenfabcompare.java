package threading;

import java.util.*;

public class primenfabcompare extends Thread{
	protected List<Integer> primes;
	protected List<Integer> fabs;
	
	
	public primenfabcompare(List<Integer> primes, List<Integer> fabs) {
		this.primes = primes;
		this.fabs = fabs;
	}
	
	@Override
	public void run() {
		for(int f:fabs) {
			for(int p:primes) {
				if( f == p) {
					System.out.println("The Common numbers of prime and fabinocci series are"+" "+f+" ");
				}
			}
		}
	}
	

}

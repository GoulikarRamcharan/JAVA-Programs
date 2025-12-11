package collections;

import java.util.*;

public class Commonpnf extends Thread{
	protected List<Integer> primes;
	protected List<Integer> fab;
	
	
	public Commonpnf(List<Integer> primes, List<Integer> fab) {
		this.primes = primes;
		this.fab = fab;
	}


	@Override
	public void run() {
		for(int f: fab) {
			for(int p:primes) {
				if(f == p) {
					System.out.println("The Common Prime and Fabbinocci numbers are:"+" "+f);
				}
			}
		}
	}
 
}

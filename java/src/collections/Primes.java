package collections;

import java.util.*;

public class Primes extends Thread{
	List<Integer> primes = new ArrayList<>();
	
	@Override
	public void run() {
		int num = 2;
		int i =2;
		
		//creating a for loop for generating the prime numbers until 1000
		for(num = 2; num < 1000;num++) {
			boolean prime = true;
			for(i = 2; i <= Math.sqrt(num);i++) {
				if(num % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				primes.add(num);
			}
		}
		for(int p: primes) {
			System.out.println("The Prime numbers are:"+" "+p);
		}
		System.out.println("---Prime Number Generated Successfully---");
		
	}
}

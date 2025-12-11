package threading;

import java.util.*;
import java.util.List;

public class primenfab extends Thread {
		public List<Integer> primes = new ArrayList<>();
		
		@Override
		public void run() {
			for(int num= 2; num <=1000;num++) {
				boolean prime=true;
				for(int i =2;i <=Math.sqrt(num);i++) {
					if(num % i == 0) {
					prime =false;
					break;
				}
				
				}
				if(prime) {
					primes.add(num);
				}
		}
			System.out.println("prime number genereated successfully");
		
}
}
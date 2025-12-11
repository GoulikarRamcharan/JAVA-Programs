package collections;

import java.util.*;

public class Fabbinocci extends Thread{
	List<Integer> fab = new ArrayList<>();
	
	@Override
	public void run() {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0 ; i <=1000;i++) {
			c = a + b;
			if(c > 1000) break;
			fab.add(c);
			a = b;
			b = c;
		}
		for(int f: fab) {
			System.out.println("The Fabbinocci series is:"+" "+f);
		}
		System.out.println("---Fabbinoci Series Generated Successfully---");
	}
}

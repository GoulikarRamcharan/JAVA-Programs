package threading;

import java.util.*;

public class fabnprime extends Thread {
	public List<Integer> fabs = new ArrayList<>();
	
	@Override
	public void run() {
		int a = 0;
		int b = 1;
		int c = 0;
		fabs.add(a);
		fabs.add(b);
		while(true) {
			c =a+b;
			if(c>1000)break;
			fabs.add(c);
			a = b;
			b = c;
			
		}
		System.out.println("The Fabbinoci series is generated");
	}
}

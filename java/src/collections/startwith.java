package collections;

import java.io.*;

public class startwith extends Thread{
		private String filep;

		public startwith(String filep) {
			this.filep = filep;
		}
		
		@Override
		public void run() {
			try {
				FileReader fr = new FileReader(filep);
				int x;
				char c;
				String countl = "";
				
				while((x = fr.read()) !=-1) {
					c = (char)x;
					countl +=c;
				}
				fr.close();
				
				String word[] = countl.split("\\s++");
				
				System.out.println("--words starts with--");
				for(String w:word) {
					if(w.startsWith("h")) {
						System.out.println(w);
					}
				}
				
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
}

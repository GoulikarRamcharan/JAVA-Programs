package collections;

import java.io.*;

public class endswith extends Thread{
		private String path;

		public endswith(String path) {
			this.path = path;
		}
		
		@Override
		public void run() {
			try {
				FileReader fr = new FileReader(path);
				
				int x;
				char c;
				String cot="";
				
				while((x = fr.read()) !=-1) {
					c = (char)x;
					cot +=c;
					
				}
				fr.close();
				
				String word [] = cot.split("\\s++");
				
				System.out.println("--Words Which is ending with are--");
				
				for(String w:word) {
					if(w.endsWith("d")) {
						System.out.println(w);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}

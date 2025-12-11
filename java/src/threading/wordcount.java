package threading;

import java.io.*;

public class wordcount extends Thread{
		private String filepath;

		public wordcount(String filepath) {
			this.filepath = filepath;
		}
		
		@Override
		public void run() {
			int n;
			int word = 0;
			int line = 0;
			try {
				FileReader fr = new FileReader(filepath);
				while((n = fr.read()) != -1) {
					if(n == ' ') {
					word++;
					}
					if(n == '\n') {
						line++;
					}
				}
				System.out.println("The No Of Words in File is :"+(word+line));
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		
			
		}
		
		
		public static void main(String[] args) throws Exception {
			String fl1 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt";
			String fl2 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/new.txt";
			
			wordcount wc = new wordcount(fl1);
			
			wordcount wc1 = new wordcount(fl2);
			
			wc.start();
			wc1.start();
			
			//joining
			wc.join();
			wc1.join();
			
			
		}

}

package collections;

import java.io.*;

public class Wordcount extends Thread{
	
	private String filepath;

	public Wordcount(String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public void run() {
		try {
			
			FileReader fr = new FileReader(filepath);
			int x;
			int word = 0;
			int lcount = 0;
			
			while((x = fr.read()) != -1) {
				if(x == ' ') {
					word++;
				}
				if(x == '\n') {
					lcount++;
				}
			}
			System.out.println("The Word of the File is:"+" "+(word+lcount));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
}

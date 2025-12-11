import java.util.*;
import java.io.*;
public class threaddemo extends Thread {

	private String filepath;

	public threaddemo(String filepath){
		this.filepath=filepath;
	}

	@Override
	public void run() {
		int cont = 0;
		int word = 0;
		int a;
		try{		
			FileReader fr = new FileReader(filepath);
			
			while((a = fr.read()) != -1){
				if (a == ' ') {
					cont++;
				}
				if (a == '\n') {
					word++;
				}
			}

			System.out.println("The word count of file is:"+(cont+word)+" and the path is:"+filepath);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws Exception{
		
		String file1 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt";
		String file2 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/new.txt";

		//creating thread

		threaddemo ted = new threaddemo(file1);
		threaddemo ted1 =new threaddemo(file2);


		ted.start();
		ted1.start();

		System.out.println("End of Thread and Executed successfully");
	}
}
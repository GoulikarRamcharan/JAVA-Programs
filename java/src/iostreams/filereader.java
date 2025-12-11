package iostreams;

import java.io.*;

public class filereader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:/Users/Ram Charan/eclipse-workspace/java/src/iostreams/filereader.java");
		
		FileWriter fw = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/filedemo.txt");
		
		System.out.println("File Read and written Done");
		
		int i;
		int line = 1;
		fw.write(line+":");
		while((i = fr.read()) != -1) {
			char ch = (char)i;
			fw.write(ch);
			
			if(i == '\n') {
				line++;
				fw.write(line+":");
			}
		}
		System.out.println("File Number with lines correctly");
		fr.close();
		fw.close();
		
	}
}

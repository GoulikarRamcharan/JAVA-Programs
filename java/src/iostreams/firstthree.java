package iostreams;

import java.io.*;
public class firstthree {
	public static void main(String[] args) throws IOException {
		FileReader filere = new FileReader("C:/Users/Ram Charan/eclipse-workspace/java/src/iostreams/firstthree.java");
		
		FileWriter filewr = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/first3.txt");
		
		System.out.println("File Read and written Done and moving to 3 lines read");
		
		int r;
		int linecount = 0;
		while((r = filere.read()) != -1) {
			char ch = (char)r;
			filewr.write(ch);
			System.out.print(ch);
			if(r == '\n') {
				linecount++;
				if(linecount == 3) {
					break;
				}
			}
			}
		System.out.println("Successfully read 3 lines");
		filere.close();
		filewr.close();
		
	}

}

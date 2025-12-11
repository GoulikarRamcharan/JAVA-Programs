package iostreams;

import java.io.*;

public class filereadnwrite {
		public static void main(String[] args) throws IOException {
			FileReader reader = new FileReader("C:/Users/Ram Charan/eclipse-workspace/java/src/iostreams/filereadnwrite.java");
			
			FileWriter writer = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/readnwrite.txt");
			
			int charc = 0;
			int wordc = 0;
			int linec = 0;
			
			int a;
			
			while((a = reader.read()) != -1) {
					System.out.print((char)a);
					charc++;
					if(a == ' ') {
						wordc++;
					}
					
					if(a == '\n') {
						linec++;
					}
					
			}
			writer.write("the no of character is:"+charc);
			writer.write("\nthe no of words is:"+(wordc+linec));
			writer.write("\nthe no of line is:"+linec);
			
			
			writer.close();
			reader.close();
		}
}

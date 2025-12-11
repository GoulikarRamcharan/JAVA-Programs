package iostreams;

import java.io.*;

public class unique {

		public static void main(String[] args) throws Exception{
			FileReader free = new FileReader("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt");
			String cont="";
			int ch;
			while((ch = free.read()) != -1) {
				char c = (char)ch;
				cont += c;
			}
		
			free.close();
			
			String [] words = cont.split("\\s+");
			
			String printed="";
			
			System.out.println("Unique words:");
			for(String w : words) {
				if (!printed.contains(w+" ")) {
					System.out.println(w);
					printed += w+" ";
				}
			}
		}
}

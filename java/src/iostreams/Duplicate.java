package iostreams;

import java.io.*;

		public class Duplicate {
		public static void main(String[] args) throws IOException{
			FileReader free = new FileReader("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt");
			String cont="";
			int ch;
			while((ch = free.read()) != -1) {
				char c = (char)ch;
				cont += c;
			}
		
			free.close();
			
			String [] words = cont.split("\\s+");
			
			System.out.println("Duplicate words:");
			String printed="";
			for(int i = 0;i < words.length ; i++) {
				int count = 0;
				
				for(int j = 0 ; j<words.length;j++) {
					if(words[i].equals(words[j]))
					{
						count++;
					}
				}
				
				if(count > 1 && !printed.contains(words[i]+" ")){
					System.out.println("--Duplicate word--");
					System.out.println(words[i]);
					printed +=words[i] +" ";
				}
			}
			
			
		
	}
}

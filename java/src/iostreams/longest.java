package iostreams;

import java.io.*;

public class longest {

	public static void main(String[] args) throws Exception{
		FileReader free = new FileReader("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/new.txt");
		
		FileWriter writing = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/long.txt");
		
		int ch;
		String max="";
		String word ="";
		while((ch = free.read()) != -1) {
			char c = (char)ch;
			if(c != ' ' || c == '\n') {
				word+= c;
				}
			else {
				if(word.length() > max.length()) {
					max =word;
				}
				word ="";
			}
		}
		if (word.length() > max.length()) {
			max = word;
		}
		writing.write(max);
		System.out.println("longest word is:"+max);
		
		free.close();
		writing.close();
		
	}

}

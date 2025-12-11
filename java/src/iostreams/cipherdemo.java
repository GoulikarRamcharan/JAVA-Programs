package iostreams;

import java.io.*;


public class cipherdemo {
	public static void main(String[] args) throws IOException{
		
		FileReader free = new FileReader("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt");
		
		FileWriter writing = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/enc_message.txt");
		
		int c;
		
		while((c = free.read()) !=-1 ) {
				writing.write((char)c+3);
		}
		System.out.println("Encoding successful");
		
		free.close();
		writing.close();
		
		FileReader frdecode = new FileReader("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/enc_message.txt");
		
		FileWriter wrdecode = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/dec_message.txt");
		
		int x;
		
		while((x = frdecode.read()) !=-1) {
			wrdecode.write((char)x-3);
		}
		System.out.println("Decoding successful");
		
		frdecode.close();
		wrdecode.close();
	}
}

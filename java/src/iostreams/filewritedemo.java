package iostreams;

import java.io.*;
import java.io.IOException;

public class filewritedemo {
	public static void main(String[] args) throws IOException {
	
		FileWriter fr = new FileWriter("C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/test.txt",true);
		
		fr.write("This is a demo test file for Files\n");
		fr.write("This is for java practice \n");
		fr.write("This is done by Ramcharan\n");
		
		fr.close();
		System.out.println("data written in file successfully");
	}
}

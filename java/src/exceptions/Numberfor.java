package exceptions;

import java.io.*;



public class Numberfor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//using the try block 
		try {
		System.out.println("enter a number");
		int age = Integer.parseInt(br.readLine());
			
		}
		catch(NumberFormatException ne) {
			System.err.println(ne);
		}
		System.out.println("Rest of the code as continued!!!");
	}
}

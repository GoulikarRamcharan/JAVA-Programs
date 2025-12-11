package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryc {
		public static void main(String[] args) {
			int a = 0;
			int b = 0;
			
			Scanner sc  = new Scanner(System.in);
			
			//using the try block 
			try {
				System.out.println("enter a number");
				a = sc.nextInt();
				b = sc.nextInt();
			}
			catch(InputMismatchException e){
				System.err.println(e);
			}
			int sum = a + b;
			System.out.println("The addition of a and b is "+" "+sum);
			int prod = a * b;
			System.out.println("Multiplication is");
			System.out.println(prod);
			try {
				int div = a / b;
				System.out.println("the division is"+div);
			}
			catch(ArithmeticException c) {
				System.err.println(c);
			}
			finally{
				System.out.println("COntinue the rest code");
			}
			
			
			
		}
}

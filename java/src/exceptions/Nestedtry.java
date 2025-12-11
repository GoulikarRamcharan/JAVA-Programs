package exceptions;
import java.util.*;
public class Nestedtry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a");
			int a = sc.nextInt();
			System.out.println("Enter b");
			int b = sc.nextInt();
			
			int sum = 0;
			try {
				sum = a /b;
				System.out.println("the division of a n b is "+sum);
			}
			catch(ArithmeticException ae) {
				System.err.println(ae);
			}
			try {
				int [] arr = new int[5];
				arr[5] = 54632;
				System.out.println("this is an array");
			}
			catch( ArrayIndexOutOfBoundsException ab) {
				System.err.println(ab);
			}
			
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally{
			System.out.println("Exception completed");
		}
		System.out.println("This is the rest code as follows");
	}
}

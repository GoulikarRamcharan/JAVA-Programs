package exceptions;

public class Outof {

	public static void main(String[] args) {
		try {
			int [] arr = new int [5];
			
			arr[4] = 2345678;
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println(ae);
		}
		System.out.println("the rest of the code follows");
	}

}

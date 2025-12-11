import java.util.Scanner;
class readnprint{
	public static void main(String[] args) {
		//creating an array using random number
		int [] read = new int[10];

		//implementing a for loop to pool the array
		for (int i = 0;i < read.length ;i++ ) {
				Scanner sc = new Scanner(System.in);
				System.out.println("plese enter array element");
				read[i] = sc.nextInt();
				System.out.println("the entered elements is :"+read[i]);
		}
		//printing the array
		for (int i = 0;i < read.length ;i++ ) {
				System.out.println("the array elements are :"+read[i]);
		}
	}
}
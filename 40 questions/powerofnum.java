import java.util.Scanner;
class powerofnum{
	public static void main(String[] args) {
		// taking the input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();

		System.out.println("Enter power of Number:");
		int expo = sc.nextInt();
		int result = 1;
		for (int i =1 ; i <= expo;i++){
			result = result * number;
		}
		System.out.println("the power of number is : "+result);
	}
}

import java.util.Scanner;
class pallin{
	public static void main(String[] args) {
		// taking the number from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int temp = 0;
		temp = number;
		int sum = 0;
		//using the while loop
		while(number > 0){
			int digit = number % 10;
			sum = (sum * 10) + digit ;
			number = number / 10;

		}
		if (sum == temp ) {
			 	System.out.println("the given number is pallindrome:" +temp);
		}
		else {
			System.out.println("the given number is not a pallindrome");
		}
	}
}
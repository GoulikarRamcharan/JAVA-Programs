import java.util.Scanner;
class reverse{
	public static void main(String[] args) {
		// taking the input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int temp = 0;
		temp = number;	
		int sum = 0;
		while(number > 0){
			temp = number % 10;
			sum = (sum * 10) + temp;
			number = number / 10 ;
		}
		System.out.println("The reverse of a number is :"+ sum);

		}
	}

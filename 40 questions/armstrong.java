import java.util.Scanner;
class armstrong{
	public static void main(String[] args) {
		// taking the input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int temp = 0;
		temp = number;
		int sum = 0;
		// checking weather the number is armstrog or not
		while(temp > 0){
				int digit = temp % 10;
				sum += digit * digit * digit;
				temp = temp / 10;  
		}
		if(sum == number ){
		System.out.println("Given number is arnstrong");
	}
		else {
			System.out.println("Given number is not a armstrong  number");
		}
	}

}
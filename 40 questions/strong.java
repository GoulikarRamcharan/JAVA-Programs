import java.util.Scanner;
class strong{
	public static void main(String[] args) {
		  //taking a number to find weather it is strong or not
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = sc.nextInt();
			int temp = 0;
			temp = num ;
			int sum = 0;
			 //implementing a loop to find strong number and find factorial
			while(num >  0){
				int digit = num % 10;
				int fact = 1;
				//calculating the factorial
				for (int i = 1;i <= digit ;i++ ) {
					fact *= i;
				}
				sum += fact;
				num = num / 10;
			}
			if (sum == temp) {
				System.out.println(temp+" is a strong number");
			}
			else {
				System.out.println(temp+"Given number is not a strong number");
			}
	}
}
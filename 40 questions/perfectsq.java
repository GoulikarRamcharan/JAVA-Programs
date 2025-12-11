import java.util.Scanner;
class perfectsq{
	public static void main(String[] args) {
		
		  //taking a number to find weather it is perfect square  or not
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = sc.nextInt();
			int i;
			for ( i = 1 ; i * i <= num ;i++ ) {
				if (i * i == num) {
					System.out.println(num+"it is a perfect square");
					break;
				}
				
			}
			if (i * i > num) {
				System.out.println(num+"is not a perfect square");
			}

			}
	}

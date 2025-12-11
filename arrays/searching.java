import java.util.Scanner;
class searching{
	public static void main(String[] args) {
		//creating an array using random number
		int [] search = new int[10];
		
		//initalizing a booolean value
		boolean flag = false;

		//implementing a for loop to pool the array
		for (int i = 0;i < search.length ;i++ ) {
				search[i] = 1 + (int) (Math.random() * 100);
				System.out.println("the array elements are :"+search[i]);
		}
		//taking the input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search in array");
		int num = sc.nextInt();
		//for searching in an array
		for (int i = 0 ;i < search.length ;i++ ) {
			 if (num == search[i]) {
			 		System.out.println(num+"found at :"+i);
			 		flag = true;
			 		break;
			 }

		}
		if (flag == false) {
				System.out.println("number not found");
		}
	}
}

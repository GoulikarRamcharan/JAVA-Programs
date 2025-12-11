import java.util.Scanner;
class strpallin{
	public static void main(String[] args) {
		// taking the input from the user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();

		//converting all string to lower case

		str = str.toLowerCase();

		// making a new var to store reverse of string

		String rev = "";

		//making a for loop to make reverse
		for (int i = str.length() - 1;i >= 0 ; i-- ) {
				rev = rev + str.charAt(i);
			
		}
		if (str.equals(rev)) {
				System.out.println("it is a pallindrome :"+rev);
		}
		else {
			System.out.println("it is not a pallindrome");
		}
	}
}
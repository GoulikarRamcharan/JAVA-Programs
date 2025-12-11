import java.util.Scanner;
class panagram{
	public static void main(String[] args) {
		
		  //taking a number to find weather it is perfect square  or not
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			//taking input and converting it to lower case
			String str = sc.nextLine().toLowerCase();
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			int count = 0;
			for (int i =0;i <26 ;i++ ) {
					if(str.indexOf(alphabet.charAt(i)) != -1){
						count++;
					}
			}
			if (count == 26) {
				System.out.println("Given string is a panagram");
			}
			else {
				System.out.println("not a panagram");
			}
	}
}
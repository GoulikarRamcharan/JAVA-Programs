import java.util.Scanner;
class grading{
	public static void main(String[] args) {
		//taking the marks as input from the user using scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of student:");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
			//making a valadition
		if (mark1 > 100 || mark2 > 100 || mark3 > 100) {

			System.out.println("Invalid marks");
			return;
			
		}
		if (mark1 <= 0 || mark2 <= 0 || mark3 <= 0) {
			System.out.println("Failed");
			return;
		}

		//calculating the avarage of three marks
		int sum = mark1 + mark2 + mark3;
		int avg =  sum / 3;

		// assigining the grades 
		if (avg >= 90 ) {
			System.out.println("Grade is A " +avg);
			
		}
		else if (avg >=80) {
			System.out.println("Grade is B " +avg);
		}
		else if (avg >=70) {
			System.out.println("Grade is c " +avg);
		}
		else if (avg >=60) {
			System.out.println("Grade is D " +avg);
		}
		else {
			System.out.println("Grade is F"+avg);
		}
	}
}
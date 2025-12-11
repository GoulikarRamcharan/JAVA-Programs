class electricity{
	public static void main(String[] args){

		//taking the units from the user

		int units = Integer.parseInt(args[0]);

		//making a if else statement to calculate the electricity bill

		if ( units <= 100) {
			System.out.print("The electricity bill is :" + (units * 5));	
		}
		else if ( units >= 101 && units <= 200) {
			System.out.print("The electricity bill is :" + (units * 6));
			
		}
		else if ( units >= 201 && units <= 300) {
			System.out.print("The electricity bill is :" + (units * 7));
			
		}
		else  {
			System.out.print("The electricity bill is :" + (units * 8));
			
		}
	}
}
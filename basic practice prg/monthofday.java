class monthofday{
	public static void main(String[] args){
				//asking the user to enter a number to get day of week

		int days = Integer.parseInt(args[0]);

		//making a switch statement

		switch(days){
			case 1:
					System.out.print("31");
					break;
			case 2:
					System.out.print("27");
					break;
			case 3:
					System.out.print("31");
					break;
			case 4:
					System.out.print("30");
					break;
			case 5:
					System.out.print("31");
					break;
			case 6:
					System.out.print("30");
					break;
			case 7:
					System.out.print("31");
					break;
			case 8:
					System.out.print("31");
					break;
			case 9:
					System.out.print("30");
					break;
			case 10:
					System.out.print("31");
					break;
			case 11:
					System.out.print("30");
					break;
			case 12:
					System.out.print("31");
					break;										
			default:
					System.out.print("Invalid input");
					break;														
		}
	}
}
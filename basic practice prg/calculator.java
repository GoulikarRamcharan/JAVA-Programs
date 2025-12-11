class calculator{
	public static void main(String[] args){

		//taking the value of x and y from user 
		int x = Integer.parseInt(args[0]);
 		int y = Integer.parseInt(args[1]);

 		// taking the input for switch operation
 		int n = Integer.parseInt(args[2]);

 		//implementing the switch statement for arthemetic operations
 		switch(n){
 			case 1:
 					System.out.print("The addition of a and b is : "+(x + y));
 					break;
 			case 2:
 					System.out.print("The Subtraction of a and b is : "+(x - y));
 					break;
 			case 3:
 					System.out.print("The Multiplication of a and b is : "+(x * y));
 					break;	
 			case 4:
 					System.out.print("The division of a and b is : "+(x / y));
 					break;
 			case 5:
 					System.out.print("The modulas of a and b is : "+(x % y));
 					break;
 			default:
 					System.out.print("Invalid input");									

 		}

	}
}
class Numtoword{
	public static void main(String[] args){

		//taking the value of x for switch  from user 
		int x = Integer.parseInt(args[0]);

 		
 		//implementing the switch statement for printnig words
 		switch(x){
 			case 0:
 				   System.out.print("Zero");
 				   break;
 				   
 			case 1:
 					System.out.print("One");
 					break;
 			case 2:
 					System.out.print("Two ");
 					break;
 			case 3:
 					System.out.print("Three");
 					break;	
 			case 4:
 					System.out.print("Four");
 					break;
 			case 5:
 					System.out.print("Five");
 					break;
 			default:
 					System.out.print("Invalid input");									

 		}

	}
}
class Signal{
	public static void main(String[] args){

		//taking the character as input from user
		String input = args[0];
		Character rs = input.charAt(0);
       
        // implementing the switch statement so that it can take 
        //input as char and print the value 
		switch(rs){
			case 'R':
					 System.out.print("Please Stop");
					 break;
			case 'Y':
					 System.out.print("Wait");
					 break;
			case 'G':
					 System.out.print("Go");
					 break;	
			default:
					System.out.print("Invalid input");		 	 		 
		}
	}
}
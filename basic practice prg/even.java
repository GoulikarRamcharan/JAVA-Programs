class even{
	public static void main(String[] args){
		//taking the input from the user 
		
		int a = Integer.parseInt(args[0]);
		
		//using if-elseif-else statement to find whether number is
		//positive or not
		if (a > 0) {
			System.out.println("given number is positive");
			
		}
		else if (a < 0){
			System.out.println("given number is negative");
		}
		else{
			System.out.println("given number is 0");
		}

	}
}
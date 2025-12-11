class eorod{
	public static void main(String[] args){

		//taking the input from the user 

		int num = Integer.parseInt(args[0]);

		//checking weather the number is even or odd
        
        if (num % 2 == 0) {
        		System.out.print("given number is even");
        	
        }
        else{
        	System.out.print("given number is odd");
        }
	}
}
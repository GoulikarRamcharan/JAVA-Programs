class primeo{
	public static void main(String[] args){
		// taking a number from the user
		int a = Integer.parseInt(args[0]);

		if ( a % 2 == 0){
			System.out.println("It is not a prime");

		}
		else if ( a % 3 == 0) {
			System.out.println("it is not a prime");		
		}
		else {
			System.out.println("it is a prime number");
		}
	}
}
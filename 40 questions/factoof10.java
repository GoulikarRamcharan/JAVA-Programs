class factoof10{
	public static void main(String[] args) {
		//using for loop to find the factorial of first 10 
		//natural numbers
		int fact = 1 ;
		for (int i = 1;i <= 10 ; i++ ) {
				fact *= i;

		}
		System.out.println("The factorila of 1 to 10 natural :"+fact);
	}
}
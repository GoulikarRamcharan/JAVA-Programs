class avgnum{
	public static void main(String[] args) {
		// declaring the sum and avg
		int sum = 0;
		double avg = 0;

		//using for loop to calculate avg  
		for (int i = 1; i <= 20 ; i++ ) {
			sum = sum +i;
			
		}
		avg = sum / 20 ;
		System.out.println("the average of list of number is :"+avg);
	}
}
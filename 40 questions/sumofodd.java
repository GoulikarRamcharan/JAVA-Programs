class sumofodd{
	public static void main(String[] args) {
		//initalizing the sum
		int sum = 0;

		//using for loop for sum of odd number
		for(int i = 1; i<=50 ;i++){
			if (i % 2 != 0) {
				sum = sum+i;
				
			}
		}
			System.out.println("the sum of odd numbers are :"+sum);
	}
}
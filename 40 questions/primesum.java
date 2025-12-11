class primesum{
	public static void main(String[] args) {
		//initilazing the sum
		int sum = 0;
		for (int i = 2; i <= 100 ; i++ ) {
			if(i % 2 != 0 && i % 3 != 0){
				System.out.println("The prime number are :"+i);
				sum = sum + i;
			}

		}
		System.out.println("The sum of prime number is :"+sum);
	}
}
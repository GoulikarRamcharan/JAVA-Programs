class squareofsum{
	public static void main(String[] args) {
		//initalizing the sum and num and sqa for square var
		int num = 10;
		int sqa = 0;
		int sum = 0;
		//implementing the for loop for finding the sum of square
		for(int i = 1 ; i <= num  ; i++){
					sqa =  i * i ;
					sum = sum + sqa;
					System.out.println("The square of numbers from 1 to 10 are :"+sqa);

				}
				System.out.println("The sum of square from 1 to 10 numbers are :"+sum);
	}
}
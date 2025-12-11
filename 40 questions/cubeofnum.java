class cubeofnum{
	public static void main(String[] args) {
		//initalizing the sum and cube var
		int sum = 0;
		int cube = 0;
		//implementing the for loop for finding the sum of cube
		for(int i = 1 ; i <= 10  ; i++){
					cube =  i * i * i ;
					sum = sum + cube;
					System.out.println("The cube of numbers from 1 to 10 are :"+cube);

				}
				System.out.println("The sum of cube for 1 to 10 numbers are :"+sum);
	}
}
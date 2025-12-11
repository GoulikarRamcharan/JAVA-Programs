class prodofdigit{
	public static void main(String[] args) {
		//enter a number
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int sum=1;
		if ( num == 0 ) {
			System.out.println("product of digit is :"+num);
			
		}
		else{

		//using while to run the product of digits until a not equal to 0
		while(num != 0){
			temp = num % 10;
			
	
			sum = sum * temp;
			
	
			num = num / 10;
		}
		System.out.println("the product of digits is :" +sum);
			}
	}
}
	

class sumofdigit{
	public static void main(String[] args){
		//enter a number
		int a = Integer.parseInt(args[0]);
		int temp = a;
		int sum=0;
		//using while to run the sum of digits until a not equal to 0
		while(a != 0){
			temp = a % 10;
			
	
			sum = sum +temp;
			
	
			a = a / 10;
		}
		System.out.println("the sum of digits is :" +sum);
	}
}
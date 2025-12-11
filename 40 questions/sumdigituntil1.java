class sumdigituntil1{
		public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int sum=0;
		int add = 0;
		//using while to run the sum of digits until a not equal to 0
		while(num != 0){
			temp = num % 10;
			
	
			sum = sum +temp;
			
	
			num = num / 10;
		}
		for (int i = 0; i <= sum ;i++ ) {
			int ma1 = sum % 10;
			add = add + ma1;
			sum = sum / 10;

		}
		System.out.println("the sum of digits is :" +add);
	}
}

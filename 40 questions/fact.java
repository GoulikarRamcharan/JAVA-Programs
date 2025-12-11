class fact{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int facto = 1 ;
		//setting up the for loop for sum of 100 number
		for (int i =1 ;i <= num ; i++ ) { 
			facto *= i;
						
		}
		System.out.println("the factorial of  number is :" + facto);
	}

}
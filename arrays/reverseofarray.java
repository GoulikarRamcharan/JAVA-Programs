class reverseofarray{
	public static void main(String[] args) {
		int [] aray = new int[10];
		int [] reverse = new int[aray.length];
		//implementing a for loop to pool the array
		for (int i = 0;i < aray.length ;i++ ) {
				aray[i] = 1 + (int) (Math.random() * 100);
				System.out.println("the array elements are :"+aray[i]);
			}
		//for printing the reverse of array
		for (int i = 0;i < aray.length ;i++ ) {
				reverse[i] = aray[aray.length - 1 - i];
			System.out.println("the reverse of array is:"+reverse[i]);			
			}	
	
	}
}	
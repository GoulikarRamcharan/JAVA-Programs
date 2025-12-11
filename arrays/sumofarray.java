class sumofarray{
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,10};
		int [] sum = new int[arr1.length];
		int total = 0;
		//initalizing the loop for sum
		for (int i = 0;i < arr1.length ;i++ ) {
				sum[i] = arr1[i] + arr2 [i];
				total += sum[i];			
		}
		//for printing the values  of arrray
		for (int i = 0;i < sum.length ;i++ ) {
			System.out.println("the sum of two array is :"+sum[i]);
			
		}
		double average = total / sum.length;
		System.out.println("the avrage of array is:"+average);
		

	}
}
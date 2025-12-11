class firstnsecond{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int mid = arr.length / 2;
		int firstsum = 0 ;
		int secondsum = 0;
		//calculating the sum of first half of array
		for (int i = 0;i < mid ;i++ ) {
				firstsum = firstsum + arr[i];
				
			}
			System.out.println("the sum of first half is"+firstsum);
		for (int i = mid ;i < arr.length ;i++ ) {
				secondsum = secondsum + arr[i];

			}	
			System.out.println("the sum of sedcond half is "+secondsum);	
		}
	}
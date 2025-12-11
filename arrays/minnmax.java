class minnmax{
	public static void main(String[] args) {
		//creating an array using random number
		int [] arrao = new int[10];

		//implementing a for loop to pool the array
		for (int i = 0;i < arrao.length ;i++ ) {
				arrao[i] = 1 + (int) (Math.random() * 100);
				System.out.println("the array elements are :"+arrao[i]);
		}
				//initalizing a variable
		int min = arrao[0];

		int max = arrao[0];
		//findind the minimum in array
		for (int i = 0;i < arrao.length ;i++ ) {
			if (min > arrao[i]) {
				min = 	arrao[i];
							}
		}
			System.out.println("The minimum value is :"+min);

		//finding the maximum in array
		for (int i = 0;i < arrao.length ;i++ ) {
				if (max < arrao[i]) {
					max = arrao[i];
				}
			}	
			System.out.println("the maximum of array is :"+max);

	}
}
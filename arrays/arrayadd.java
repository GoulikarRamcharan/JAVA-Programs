class arrayadd{
	public static void main(String[] args) {
		//initalizing the first array
		int [][] array1 = {{1,2,3},
						   {4,5,6},
						   {7,8,9}};
		//initalizing the second array				   
		int [][] array2 = {{9,8,7},
						   {6,5,4},
						   {3,2,1}};	
		int [][] arrsum = new int[array1.length][array1[0].length];				   
		for(int i = 0;i<array1.length;i++){
			for(int j =0;j<array1[i].length;j++){
				arrsum[i][j]=array1[i][j] + array2[i][j];
			}
		}	

		System.out.println("the add of two two dimentional array is :");
		for (int i =0;i < arrsum.length ;i++ ) {
			for(int j = 0;j < arrsum[i].length;j++){
				System.out.print(arrsum[i][j]+" ");
			}
		   	System.out.println();
		   }   

	}
}
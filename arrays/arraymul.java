class arraymul{
	public static void main(String[] args) {
		//initalizing the first array
		int [][] array1 = {{1,2,3},
						   {4,5,6},
						   {7,8,9}};
		//initalizing the second array				   
		int [][] array2 = {{9,8,7},
						   {6,5,4},
						   {3,2,1}};	
		int [][] arrmul = new int[array1.length][array2[0].length];				   
		for(int i = 0;i<array1.length;i++){
			for(int j =0;j<array2[0].length;j++){
				arrmul[i][j]=0;
			
			for (int k = 0;k < array1[0].length ;k++ ) {
				arrmul[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}	

		System.out.println("the add of two two dimentional array is :");
		for (int i =0;i < arrmul.length ;i++ ) {
			for(int j = 0;j < arrmul[i].length;j++){
				System.out.print(arrmul[i][j]+" ");
			}
		   	System.out.println();
		   }   

	}
}
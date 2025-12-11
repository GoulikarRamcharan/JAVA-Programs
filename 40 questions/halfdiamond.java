class halfdiamond{
	public static void main(String[] args) {
		//initalizing a space to print halodiamond triangle
        int space = 10;
		//using for loop to print halo  triangle
		for (int i = 1;i <= 10 ;i++ ) {
			System.out.println();
			for (int s = 0; s < space ; s++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 1;j <=(2*i - 1) ;j++ ) {
					if (j == 1 ||j == (2*i - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				
			}
			space --;
			
		}
		space = 1;
		for (int i =10;i >=1 ;i-- ) {
			System.out.println();
			for (int s = 0; s < space ; s++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 1;j <=(2*i - 1) ;j++ ) {
					if (j == 1 ||j == (2*i - 1)) {
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				
			}
			space ++;
	}
}	
}
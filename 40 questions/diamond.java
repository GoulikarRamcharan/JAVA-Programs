class diamond{
	public static void main(String[] args) {
		//initalizing a space to print absolute triangle
		int space = 10;
		//using for loop to print absolute  triangle
		for (int i = 0;i <= 5 ;i++ ) {
			System.out.println();
			for (int s = 0; s < space ; s++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 0;j <=i ;j++ ) {
				System.out.print(" *  ");
			}
			space -=2;
			
		}
		//creating the lower half of piramid
		space = 2;
		//using for loop to print absolute  triangle
		for (int i = 4;i >= 0 ;i-- ) {
			System.out.println();
			for (int s = 0; s < space ; s++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 0;j <=i ;j++ ) {
				System.out.print(" *  ");
			}
			space +=2;
			
					}
	}
}

class rightdoubleinverted{
    public static void main(String[] args) {
      //implementing the top part
        //using for loop to print right angle triangle
        for (int i = 5;i >= 0 ;i-- ) {
            System.out.println();
            for ( int j = 1;j <=i ;j++ ) {
                System.out.print(" * ");
            }
        }
        // implementing the bottom half
        for (int i = 1;i <= 5 ;i++ ) {
            System.out.println();
            for ( int j = 1;j <=i ;j++ ) {
                System.out.print(" * ");
            }
        }

    }
 }   
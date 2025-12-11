class diagonalsum {
    public static void main(String[] args) {
        int [][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = array.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += array[i][i];              
            secondarySum += array[i][n - 1 - i];     
        }

        System.out.println("Primary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
        System.out.println("Total sum of both diagonals = " + (primarySum + secondarySum));
    }
}

import java.util.Arrays;
import java.util.Scanner;

class NthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Input value of k
        System.out.print("Enter value of k (for nth largest/smallest): ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid k (must be between 1 and " + n + ")");
        } else {
            int nthSmallest = arr[k - 1];        
            int nthLargest = arr[n - k];        

            System.out.println(k + "th Smallest element = " + nthSmallest);
            System.out.println(k + "th Largest element = " + nthLargest);
        }

        
    }
}

import java.util.Arrays;
class sorting{
	public static void main(String[] args) {
		
	int [] arr = {5,6,3,4,7,8,9};

	Arrays.sort(arr);
	for (int i : arr ) {
		System.out.println("sorted array "+i);
	}
}

}
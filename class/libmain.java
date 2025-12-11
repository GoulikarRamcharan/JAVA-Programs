public class libmain{
	public static void main(String[] args) {
		//creating object reference
		Author ath = new Author("JK Rowling");

		Book bk = new Book("Harry porter",ath);

		Library lib = new Library(254,bk,ath);

		//printing the output
		System.out.println(lib);
	}
}
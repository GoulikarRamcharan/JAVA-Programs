public class Library{
	private int libid;
	private Book book;
	private Author author;

	public Library(int libid,Book book,Author author){
		this.libid = libid;
		this.book = book;
		this.author = author;

	}
	@Override
	public String toString(){
		return libid+" \n" +book+" "+author;
	}
}
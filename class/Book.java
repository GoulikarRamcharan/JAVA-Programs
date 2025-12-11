public class Book{
	private String bname;
	private Author author;

	public Book(String bname,Author author){
		this.bname = bname;
		this.author = author;
	}
	@Override
	public String toString(){
		return bname+" "+author;
	}
}
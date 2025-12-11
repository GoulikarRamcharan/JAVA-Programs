package collections;

public class Book {
	private int bookid;
	private String bookname;
	private String bookauthor;
	private double bookprice;
	
	
	public Book(int bookid, String bookname, String bookauthor, double bookprice) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	
	public String toString() {
		return "Book Detalis"+" "+"Book ID:"+" "+bookid+" "+"Book Title:"+" "+bookname+" "+"Book Author:"+" "+bookauthor+" "+"Book Price:"+" "+bookprice;
	}

	public int getBookid() {
		return bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public double getBookprice() {
		return bookprice;
	}
	
	
}

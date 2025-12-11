package collections;

import java.util.*;

public class Bookmain {

	public static void main(String[] args) {
		HashSet<Book> bk= new HashSet<>();
		
		bk.add(new Book(251,"Life of PI","AB Shstry",2632.32));
		bk.add(new Book(621,"Harry Porter Part V","J.K Rowling",5000));
		bk.add(new Book(521,"Happiness","Yungsuk",529.60));
		bk.add(new Book(452,"GOT","Gorege RR Martin",6500.54));
		bk.add(new Book(250,"Core Java","Sadhu",899.21));
		bk.add(new Book(499,"One Pice","ODA",4523.10));
	
		//diaplaying the HashSet
		bk.forEach(System.out::println);
		
		//Searchin by book id
				System.out.println("--Searching the book--");
				for(Book b:bk) {
					if(b.getBookid() == 250) {
						System.out.println(b);
					}
				}
				
			
		
		//removing the book 
		System.out.println("--to demonstrate the remove--");
		Iterator<Book> itr = bk.iterator();
		
		while(itr.hasNext()) {
			Book b = itr.next();
			
			if(b.getBookid() == 521) {
				System.out.println("Removing the "+b+" "+"Now");
				itr.remove();
			}
		}
		System.out.println("--printing the remaining hashset--");
		for(Book b:bk) {
			System.out.println(b);
		}
		
	}

}

package collections;

public class wmain {

	public static void main(String[] args) throws Exception {
		String file1= "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt";
		String file2= "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/new.txt";
		
		Wordcount wc1 = new Wordcount(file1);
		
		Wordcount wc2 = new Wordcount(file2);
		
		wc1.start();
		wc2.start();
		//joining
		
		
		wc1.join();
		wc2.join();
		

	}

}

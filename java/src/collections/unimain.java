package collections;

public class unimain {

	public static void main(String[] args) throws Exception {
		String f1 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/cdemo.txt";
		String f2 = "C:/Users/Ram Charan/OneDrive/Desktop/java/40 questions/files/new.txt";
		
		uniqueword uw = new uniqueword(f1);
		
		uw.start();
		
		duplicateword dw = new duplicateword(f1);
		
		dw.start();
		
		startwith stw = new startwith(f2);
		
		stw.start();
		
		endswith enw = new endswith(f2);
		
		enw.start();
		//joining
		
		uw.join();
		dw.join();
		stw.join();
		enw.join();
		
		

	}

}

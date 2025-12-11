package exceptions;

public class Nullpo {
	public static void main(String[] args) {
		
	
	try {
		System.out.println("String");
		String s= null;
		System.out.println(s.length());
	}
	catch(NullPointerException se) {
		System.out.println(se);
	}
	System.out.println("rest continue");
}
}

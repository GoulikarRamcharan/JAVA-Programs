package javapractice;

public class Scrmain {
	public static void main(String[] args) {
		//creating a object
		Circle cr = new Circle(9);
		
		Rectangle ret = new Rectangle(8, 9);
		
		//printing the object
		
		System.out.println("The radius of circle is:"+cr.area());
		System.out.println("The radius of circle is:"+ret.area());
}
}

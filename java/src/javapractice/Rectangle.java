package javapractice;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double area() {
		return length * breadth;
	}

}

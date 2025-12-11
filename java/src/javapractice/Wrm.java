package javapractice;

public class Wrm {
	public static void main(String[] args) {
		//creating the object 
		Washingmachine wr = new Washingmachine("LG", 62);
		
		Refrigerator rgf = new Refrigerator("BPL", 25);
		
		Microwave mr = new Microwave("Samsung",30);
		
		//printing the object
		
		wr.turnOn();
		
		rgf.turnOn();
		
		mr.turnOn();
		
	}
}

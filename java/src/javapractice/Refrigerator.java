package javapractice;

public class Refrigerator extends Appliances {

	public Refrigerator(String brand, int powerconsumption) {
		super(brand, powerconsumption);
		
	}

	@Override
	public void turnOn() {
		System.out.println("Refrigerator is"+" "+brand+" "+"is power on"+" "+"Power Consumption is:"+powerconsumption);

		
	}

}

package javapractice;

public class Microwave extends Appliances{

	public Microwave(String brand, int powerconsumption) {
		super(brand, powerconsumption);
		
	}

	@Override
	public void turnOn() {
		System.out.println("Microwave is"+" "+brand+" "+"is power on"+" "+"Power Consumption is:"+powerconsumption);

		
	}

}

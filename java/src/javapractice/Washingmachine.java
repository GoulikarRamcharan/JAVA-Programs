package javapractice;

public class Washingmachine extends Appliances{

	public Washingmachine(String brand, int powerconsumption) {
		super(brand, powerconsumption);
		
	}

	@Override
	public void turnOn() {
		System.out.println("Washing machine is"+ " "+ brand+" " + "power on"+" "+"Power Consumption is:"+powerconsumption);
		
	}

}

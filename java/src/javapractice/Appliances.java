package javapractice;

public abstract class Appliances {
			protected String brand;
			protected int powerconsumption;
			
			public Appliances(String brand, int powerconsumption) {
				this.brand = brand;
				this.powerconsumption = powerconsumption;
			}
			
			public abstract void turnOn();
			
			
			
}

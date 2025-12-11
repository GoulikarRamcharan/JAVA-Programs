package nexthalf;

public class Circle implements Colourful {	
		private double radius;
		
		public Circle(double radius) {
			this.radius = radius;
		}
	
		@Override
		public void draw() {
			System.out.println("Drawing a circle");
			
		}

		@Override
		public double calculatearea() {
			return Math.PI * radius * radius;
		}

		@Override
		public void fillcolor(String color) {
				System.out.println("Filling the colour" +" "+color+" "+"completed filling");	
		}
		
	
}
		

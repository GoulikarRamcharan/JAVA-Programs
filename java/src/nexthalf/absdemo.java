package nexthalf;

public class absdemo {
		public void createShape() {
			Shapea shape= new Shapea() {
				public void draw() {
					System.out.println("Creating the circle and walla done just now from anynomus class");
				}
			};
			shape.draw();
		}
}

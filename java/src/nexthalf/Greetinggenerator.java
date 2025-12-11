package nexthalf;

public class Greetinggenerator {
	public void generategreeting() {
		//inner anynymous class
		Greeting greeting = new Greeting() {
	@Override
	public void sayhello() {
	System.out.println("Hello from Anynomus class");
	}
	};
	greeting.sayhello();
	}
}
	

package javapractice;

public interface Engine {
	default  void startengine() {
		System.out.println("Engine Started");
	}
}

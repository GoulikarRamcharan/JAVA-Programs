package threading;

public class unymain {

	public static void main(String[] args) throws Exception {

		usinganynomus uny = new usinganynomus(5);
		Thread t1 = new Thread(uny);
		
		
		Thread t2 = new Thread(){
			public void run() {
				uny.display(5);
			}
		};
		t2.start();
		t2.join();
		Thread t3 = new Thread(){
			public void run() {
				uny.display(6);
			}
		};
		t3.start();

	}

}

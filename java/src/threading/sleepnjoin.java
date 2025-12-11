package threading;

public class sleepnjoin extends Thread {
	@Override
	public void run() {
		int i = 0;
		for (i = 0 ;i < 20 ; i ++){
			System.out.println("Good Morning");
			System.out.println("welcome");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) throws Exception {
			sleepnjoin snj = new sleepnjoin();
			
			snj.start();
			snj.join();
			System.out.println("Thread finished now new thread fromm main class Started");
	}
}

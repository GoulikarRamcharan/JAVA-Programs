package threading;

public class Prioritydemo extends Thread {
	
	@Override
	public void run() {
		System.out.println("The Current Thread is:"+currentThread());
		System.out.println("The Thread Priority is :"+getPriority());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Prioritydemo pd = new Prioritydemo();
		
		pd.setPriority(MAX_PRIORITY);
		
		Prioritydemo pd1 = new Prioritydemo();
		
		pd1.setPriority(MIN_PRIORITY);
		
		Prioritydemo pd2 = new Prioritydemo();
		
		pd.start();
		pd1.start();
		pd2.start();
	}
}

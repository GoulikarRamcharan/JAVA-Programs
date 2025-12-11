package threading;

public class threaddemo extends Thread{
		@Override
		public void run() {
			while (true) {
				System.out.println("Good Morning");
				System.out.println("welcome");
			}
		}
	public static void main(String[] args) {
			threaddemo td = new threaddemo();
			
			td.start();
	}

}

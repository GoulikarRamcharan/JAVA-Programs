package threading;

public class usinganynomus implements Runnable{
	private int n;
	
	public usinganynomus(int n) {
		this.n = n;
	}
	public void display(int n) {
		for(int i = 1; i <=10;i++) {
			System.out.println(n+" * "+i+" ="+ (n * i));
	}
		
		
	}

	@Override
	public void run() {
		display(n);
	}
}

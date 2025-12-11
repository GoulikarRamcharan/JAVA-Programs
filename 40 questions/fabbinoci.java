class fabbinoci{
	public static void main(String[] args){
		int n = 0;
		int f = 1;
		int c = 0;
			System.out.println(n);
			System.out.println(f);
		for (int i = 1;i < 10 ; i++ ) {
			c = n + f ;
			System.out.println(c);
			n = f;
			f = c;
		}

	}
}
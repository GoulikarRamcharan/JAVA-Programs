class Derivedemp extends Personmember{
	
	private int employid;
	private int employexp;
	public Derivedemp(String personname,int personage,int employid,int employexp){
		super(personname,personage);
		this.employid = employid;
		this.employexp = employexp;
		System.out.print("derived constructor called ");
	}

}
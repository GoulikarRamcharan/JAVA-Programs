class Calculator{
	int value1;
	int value2;

	Calculator(int value1 , int value2){
		this.value1 = value1;
		this.value2 = value2;

	}
	void add(){
		int add = value1 + value2;
		System.out.println("the addition of two numbers are:"+add);
	}
	void sub(){
		int sub = value1 - value2;
		System.out.println("the subtraction of two numbers are:"+sub);
	}
	void mul(){
		int mul = value1 * value2;
		System.out.println("the multiplication of two numbers are:"+mul);
	}
	void div(){
		int div = value1 / value2;
		System.out.println("the division of two numbers are :"+div);
	}
	void mod(){
		int mod = value1 % value2;
		System.out.println("the modulas of two numbers are :"+mod);
	}
}
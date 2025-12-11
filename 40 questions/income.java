class income{
	public static void main(String[] args){

		//taking the salary as input from user

		double salary = Double.parseDouble(args[0]);
		double tax ;
		//using the if elseif to calculate the tax
		if (salary <= 250000) {
			System.out.print("the tax for "+salary +"is : 0");
		}
		else if (salary >= 250001 && salary <= 500000) {
				tax = (salary * 5 )/ 100;
								
				System.out.print("the tax for "+salary +"is :" +tax);
		}
		else if (salary >= 500001 && salary <= 1000000) {
				tax = (salary *20) / 100;
				System.out.print("the tax for "+salary +"is :" +tax);
		}
		else {
			 	tax = (salary * 30 )/ 100;
			 	System.out.print("the tax for "+salary +"is :" +tax);
		}

	}
}
	class leap{
	public static void main(String[] args){
		//taking the input for year from user 
		int year = Integer.parseInt(args[0]);

		//checking weather it is a leap year or not 
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			System.out.println(year+"it is a leap year");
		} 
		else{
			System.out.println(year+"is not a leap year");
		}
	}
}
class consonant{
	public static void main(String[] args){

		//taking the character as input from user
		String input = args[0];
		Character ch = input.charAt(0);

		// checking weather the given character is consonant or vowel

		if( ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ){
			System.out.print("given Character is consonant");
		}
		else{
			System.out.println("given Character is vowel");
		}
	}
}
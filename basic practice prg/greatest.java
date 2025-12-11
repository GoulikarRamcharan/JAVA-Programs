class greatest{
 	public static void main(String[] args){

 		// taking a,b,c values from user
 		int a = Integer.parseInt(args[0]);
 		int b = Integer.parseInt(args[1]);
 		int c = Integer.parseInt(args[2]);

 		// finding out greatest of three using  nested if and else if 
 		if (a > b) {
 			if (a >c) {
 				System.out.println(a+"a is greatest");
 				
 			}
 			
 		}
 		else if (b > c){
 			System.out.println(b+ "b is the greatest");
 		}
 		else {
 			System.out.println(c+ "c is the greatest");
 		}
 	}	
}
class degrees{

public static void main(String[] args){

	//taking Celsius from user in command line argument

double celsius = Double.parseDouble(args [0]);

// calculating the farenheit
double fahernheit = (celsius * 9/5 + 32) ;

System.out.println("Celsius to farehnheit is:"+fahernheit);
}
}

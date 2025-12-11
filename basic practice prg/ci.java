class ci{

public static void main(String[] args)
{
		//taking principle and term and rate of intrest  from user in command line argument
double price = Double.parseDouble(args[0]);
double term = Double.parseDouble(args[1]);
double rate = Double.parseDouble(args[2]);

//calculating the compound intrest

double compound = price * Math.pow((1 + rate/100), term);
System.out.println("compound intrest is :"+compound);
}

}

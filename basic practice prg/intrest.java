class intrest{

public static void main(String[] args)
{
	//taking principle and term and rate of intrest  from user in command line argument
double price = Double.parseDouble(args[0]);
double term = Double.parseDouble(args[1]);
double rate = Double.parseDouble(args[2]);

//calculating the simple  intrest 

double intrests = (price * term * rate ) / 100;
System.out.println("simple intrest is :"+intrests);
}

}

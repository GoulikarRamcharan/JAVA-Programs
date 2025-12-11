class sphere{

public static void main(String[] args)
{
	//taking radius from user in command line argument
double radius = Double.parseDouble(args[0]);

 //calculating the volume of sphere

double volume= (4/3) * Math.PI * Math.pow(radius,3);
System.out.println("volume of sphere :"+volume);
}

}

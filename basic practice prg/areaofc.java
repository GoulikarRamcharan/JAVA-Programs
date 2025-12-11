class areaofc{

public static void main(String[] args)
{
	////taking radius of circle from user in command line argument
double circle = Double.parseDouble(args[0]);

//calculating the area of circle

double area = Math.PI * circle * circle;

System.out.println("area of circle :"+area);
}

}

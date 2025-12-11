class tri{

public static void main(String[] args)
{

	//taking a,b,c values from user using command line argument
double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double c = Double.parseDouble(args[2]);

//calulate the area of triangle
double s = (a + b + c) /2 ;
double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

System.out.println("area of triangle is:"+area);
}

}

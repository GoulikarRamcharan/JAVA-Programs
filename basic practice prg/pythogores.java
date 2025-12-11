class pythogores{

public static void main(String[] args)
{
double base = Double.parseDouble(args[0]);
double height = Double.parseDouble(args[1]);

double pythogerous = Math.sqrt((base * base) + (height * height));
System.out.println("hypothesis of right angled triangle:"+pythogerous);
}

}

class theorem{

public static void main(String[] args){

//taking length and base from user in command line argument
double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);

//calculating the hypotenuse

double c = Math.sqrt(( a * a) + (b * b));

System.out.println("the hypothesis of triangle is :"+c);

}

}
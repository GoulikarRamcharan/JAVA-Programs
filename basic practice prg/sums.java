class sums{

public static void main(String[] args)
{
	//taking the input from the user using command line argument
int number = Integer.parseInt(args[0]);

// calculating the sum of number

int sum= (number * (number + 1) / 2);
System.out.println("sum of  number is:"+sum);
}

}

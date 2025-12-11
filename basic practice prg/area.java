class area{

public static void main(String[] args)
{
	//taking length and width from user in command line argument
int length = Integer.parseInt(args[0]);
int width = Integer.parseInt(args[1]);

    //calculating the area of rectangle
int area = length * width ;
System.out.println("area of rectangle:"+area);
}

}

class AreaofR{
	int length;
	int width;

	AreaofR(int length , int width){
		this.length = length;
		this.width = width;

	}
	void getareaandperimeter(){
		//calculating the area
		int area = length * width;

		System.out.println("the area of rectangle is:"+area);
		//calculating the perimeter
		int perimeter = 2 * (length + width);
		System.out.println("the perimeter of rectangle is:"+perimeter);
	}

}
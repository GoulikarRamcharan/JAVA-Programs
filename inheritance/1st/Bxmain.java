class Bxmain{
	public static void main(String[] args) {
		//creating the reference of the object
		Box2d bx = new Box2d(6,8,5);

		Box3d bx1 = new Box3d(6,8,5);

		//printing the values to calculate the inheritance


		System.out.println("the area of cuboid is:"+bx.area());
		System.out.println("the volume of cuboid is:"+bx1.volume());
	}
}
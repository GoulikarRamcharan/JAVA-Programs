public class Box2d extends Box{
	 
	 public Box2d(int length,int breadth,int height){
	 	super(length,breadth,height);
	 }

	 public int area(){
	 	return 2*((length * breadth) + (breadth * height) + (height * length));
	 }
}
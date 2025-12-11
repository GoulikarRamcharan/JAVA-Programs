public  class Box3d extends Box{ 
	
	
	public Box3d (int length,int breadth,int height){
		super(length,breadth,height);
		
	}

	public int volume(){
		return length *	breadth * height;
	}
}
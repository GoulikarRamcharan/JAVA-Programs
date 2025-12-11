class Ptmain{
	public static void main(String[] args) {
		//creating an object

		Personconthis pst = new Personconthis("Tejas",23,"India");

		Personconthis pst1 = new Personconthis("Rajgupta",24,"India");
		//displaying the object
		pst.getptdetails();
		pst1.getptdetails();
		
		//comparing the ages
		pst.cmpage(pst , pst1);
	}
}
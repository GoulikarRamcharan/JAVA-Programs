class pamain{
	public static void main(String[] args) {
		//creating reference object

		Parent par = new Parent();
		
		Child chl = new Child();

		//displaying parent the output

		par.getparent();

		//displaying the child output

		chl.getchild();

		//using the child object to display parent

		chl.getparent();
	}
}
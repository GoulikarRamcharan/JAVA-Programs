package nexthalf;

public class anyprint {
			public void createprinter() {
				Printer printer= new Printer() {
					@Override
					public void printMessage() {
						System.out.println("Hi i am anynomus class i have concured the printer class");
					}
				};
				printer.printMessage();
			}
}

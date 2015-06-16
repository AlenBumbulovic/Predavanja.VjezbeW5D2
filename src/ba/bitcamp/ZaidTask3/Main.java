package ba.bitcamp.ZaidTask3;

public class Main {

	public static void main(String[] args) {
		
		Printer p = new Printer("DefaultPrinter");
		
		/**
		 * Testing methods
		 */
		System.out.println("Is there ink in the printer? " + p.isThereInk());
		System.out.println("Is there paper in the printer? " +p.isTherePaper());
		System.out.println("How many pages were printed? " + p.getPrintedPages());
		System.out.println(p);
		System.out.println("Adding ink to the printer...");
		p.addInk(60);
		System.out.println("Is there ink in the printer? " + p.isThereInk());
		System.out.println("Adding paper to the printer..");
		p.addPaper(70);
		System.out.println("Is there paper in the printer? " +p.isTherePaper());
		System.out.println(p);
		System.out.println("Printing some pages...");
		p.printPaper(10);
		System.out.println("The printer printed: " + Printer.getPrintedPages() + " pages");
		System.out.println("Is there ink in the printer? " + p.isThereInk());
		System.out.println("Is there paper in the printer? " +p.isTherePaper());
		

	}

}

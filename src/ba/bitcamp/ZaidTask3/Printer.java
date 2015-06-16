package ba.bitcamp.ZaidTask3;

public class Printer {

	private String name;
	private int paperQuantity;
	private int inkQuantity;
	private static int pagesPrinted = 0;

	public Printer() {
		super();
		this.name = "DefaultPrinter";
		this.paperQuantity = 0;
		this.inkQuantity = 0;
		
	}

	public Printer(String name) {
		super();
	
		this.name = name;
		this.paperQuantity = 0;
		this.inkQuantity = 0;
	}

	/**
	 * This method tells us if there is any ink in the printer
	 * 
	 * @return returns true if there is any ink in the printer, returns false if
	 *         there is not any ink in the printer
	 */

	public boolean isThereInk() {
		if (inkQuantity > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method tells us if there is any paper in the printer or not
	 * 
	 * @return returns true if there is any paper in the printer, returns false
	 *         if there is not any paper
	 */

	public boolean isTherePaper() {
		if (paperQuantity > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * a method that tells us how many pages were printed by the printer
	 * 
	 * @return the number of printed pages
	 */
	public static int getPrintedPages() {
		return pagesPrinted;
	}

	/**
	 * A method that adds paper to the printer, the maximum quantity of the
	 * paper in the printer is 100
	 * 
	 * @param otherPaper
	 *            - the paper that we add to the printer
	 */
	public void addPaper(int otherPaper) {
		paperQuantity += otherPaper;

		if ((paperQuantity + otherPaper) > 100) {
			paperQuantity = 100;
		}
	}

	/**
	 * A method that adds ink to the printer, the maximum quantity of the ink in
	 * the printer is 100
	 * 
	 * @param otherInk
	 *            the ik we add to the printer
	 */
	public void addInk(int otherInk) {
		inkQuantity += otherInk;

		if ((inkQuantity + otherInk) > 100) {
			inkQuantity = 100;
		}
	}

	/**
	 * A method that prints pages form the printer, if there is no ink or paper
	 * in the printer the printer wont print any pages
	 * 
	 * @param printedPaper
	 *            pages that are printed
	 */
	public void printPaper(int printedPaper) {
		paperQuantity -= printedPaper;
		inkQuantity -= (printedPaper * 3);
		pagesPrinted += printedPaper;
		if (paperQuantity <= 0 || inkQuantity <= 0) {
			System.out.println("The printer can't print right now");
		}
	}

	/**
	 * A method that tells us if the printer is ready to print or not
	 */

	@Override
	public String toString() {

		if (paperQuantity > 0 && inkQuantity > 0) {
			return "The DefaultPrinter is Ready to print";
		
		} else if (paperQuantity == 0 && inkQuantity == 0) {
			return "The DefaultPrinter can't print because there is no paper nor ink in the printer";
		
		} else if (paperQuantity == 0) {
			return "The DefaultPrinter can't print because there is no paper in the printer";
		
		} else if (inkQuantity == 0) {
			return "The DefaultPrinter can't print because there is no ink in the printer";
		}
		return name;
	}
	

}

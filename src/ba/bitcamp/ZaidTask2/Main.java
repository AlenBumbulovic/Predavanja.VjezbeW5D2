package ba.bitcamp.ZaidTask2;

public class Main {

	public static void main(String[] args) {
		
		Glass g = new Glass(10);
		
		/**
		 * Testing methods
		 */
		System.out.println("The type of liquid in the glass; " + g.getTypeOfLiquid());
		System.out.println("The maximum capacity of the glass is; " + g.getMaxCapacity());
		System.out.println("The current quantity of the liquid in the glas is; " + g.getCurrentCapacity());
		g.addLiquid("Voda", 12);
		System.out.println("The current quantity of liquid in the glass after adding liquid; " + g.getCurrentCapacity());
		System.out.println("The glass is empty; " + g.getEmptyGlass());
	}

}

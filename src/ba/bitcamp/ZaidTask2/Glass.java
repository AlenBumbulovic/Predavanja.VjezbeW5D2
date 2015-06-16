package ba.bitcamp.ZaidTask2;

public class Glass {

	private String liquid;
	private int liquidQuantity;
	private int maxLiquidQuantity;

	public Glass(int maxLiquidQuantity) {
		super();
		this.liquid = null;
		this.liquidQuantity = 0;
		this.maxLiquidQuantity = maxLiquidQuantity;
	}

	/**
	 * this method gets the type of liquid in the glass
	 * 
	 * @return type of liquid in the glass
	 */
	public String getTypeOfLiquid() {
		return liquid;
	}

	/**
	 * This method gets the max capacity of the glass
	 * 
	 * @return the max capacity of the glass
	 */
	public int getMaxCapacity() {
		return maxLiquidQuantity;
	}

	/**
	 * This method gets the current capacity of the glass
	 * 
	 * @return the current capacity of the glass
	 */
	public int getCurrentCapacity() {
		return liquidQuantity;
	}

	/**
	 * A method that adds liquid in to the glass if the liquid is the same type
	 * of the liquid in the glass if the liquids are not the same type the
	 * method doesn't add the liquid to the glass
	 * 
	 * @param otherLiquid
	 *            The liquid that we want to add to the glass
	 * @param quantity
	 *            The quantity of liquid we want to add to the glass
	 */
	public void addLiquid(String otherLiquid, int quantity) {
		if (liquidQuantity == 0) {
			liquidQuantity += quantity;

		} else if (otherLiquid.equals(liquid)) {
			liquidQuantity += quantity;

		} else {
			System.out.println("You cant add that type of liquid in the glass");
		}
		if (liquidQuantity > maxLiquidQuantity) {
			liquidQuantity = maxLiquidQuantity;
		}
	}

	/**
	 * The method that removes all the liquid from the glass
	 * 
	 * @return liquidQuantity = 0;
	 */
	public int getEmptyGlass() {
		while (liquidQuantity != 0) {
			liquidQuantity--;
		}
		return liquidQuantity;

	}

}

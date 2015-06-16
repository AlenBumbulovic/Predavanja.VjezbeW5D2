package ba.bitcamp.zaidTask1;

public class Temperature {

	private int celsius;

	public Temperature(int celsius) {
		super();
		this.celsius = celsius;
	}

	/**
	 * This method returns temperature in celsius
	 * 
	 * @return temperature in celsius
	 */

	public double getTemperatureInC() {

		return celsius;

	}

	/**
	 * This method converts temperature from celsius to Kelvin
	 * 
	 * @return temperature in kelvin
	 */

	public double getTemperatureInK() {

		return celsius + 273.15;

	}

	/**
	 * This method converts temperature from celsius to Farenehait
	 * 
	 * @return temperature in Farenhait
	 */

	public double getTemperatureInF() {
		return celsius * 9 / 5 + 32;
	}

	/**
	 * This method sets temperature in celsius
	 * 
	 * @param celsius
	 */

	public void setTemperature(int celsius) {
		this.celsius = celsius;
	}

}

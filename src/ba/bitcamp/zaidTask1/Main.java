package ba.bitcamp.zaidTask1;

public class Main {

	public static void main(String[] args) {
		
		
		Temperature t = new Temperature(30);
	
		/**
		 * Testing methods
		 */
		System.out.println(t.getTemperatureInC());
		System.out.println(t.getTemperatureInF());
		System.out.println(t.getTemperatureInK());

	}

}

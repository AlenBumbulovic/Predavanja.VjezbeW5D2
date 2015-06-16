package ba.bitcamp.benjoTask;

public class Main {

	public static void main(String[] args) {
		Spot s = new Spot(5, 10);
		Spot s1 = new Spot(4, 8);

		Circle c = new Circle(s, 10);
		Circle c1 = new Circle(s1, 12);

		System.out.println(s);
		System.out.println(s1);

		System.out.printf("Distance: %.2f", s.calculateDistance(s));
		System.out.println();
		System.out.printf("Distance: %.2f", s.calculateDistance(s1));
		System.out.println();
		c.intersect(c1);
	}

}

package ba.bitcamp.benjoTask;

public class Circle {

	private Spot center;
	private double radius;

	public Circle(Spot center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	/**
	 * This method calculates if the circles intersect
	 * @param c the circle
	 */

	public void intersect(Circle c) {
		if (c.radius + this.radius > c.center.calculateDistance(this.center)) {
			System.out.println("Circles intersect");

		} else {
			System.out.println("Circles do not intersect");
		}
	}

}

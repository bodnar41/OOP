package sikidom;

public class Henger extends Hasab {
	private double radius;

	public Henger(int radius, int height) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double baseArea() {
		return this.radius * this.radius * Math.PI;
	}

	public String toString() {
		return "A henger adatai: [sugár: " + this.radius + "magaság: " + super.getHeight() + "]";
	}

}

package homework.work08.shape;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return String.format("도형의 종류 : 원, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());
	}

	@Override
	public int compareTo(Shape o) {
		if (this.area() > o.area())
			return 1;
		else if (this.area() < o.area())
			return -1;
		return 0;
	}

}

package homework.work08.shape;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	public double area() {
		return Math.sqrt(3) / 4 * Math.pow(side, 2);
	}

	public double perimeter() {
		return side * 3;
	}

	public String toString() {
		return String.format("도형의 종류 : 삼각형, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());
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

package homework.work08.shape;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width * 2) + (height * 2);
	}

	@Override
	public String toString() {
		return String.format("도형의 종류 : 사각형, 둘레: %.2fcm, 넓이: %.2fcm²", perimeter(), area());
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

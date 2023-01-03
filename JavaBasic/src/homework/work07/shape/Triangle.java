package homework.work07.shape;

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
		return "도형의 종류 : 삼각형, 둘레:" + perimeter() + "cm, 넓이: " + area() + "cm²";
	}
}

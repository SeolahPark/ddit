package homework.work06.Circle;

public class Circle {

	double radius = 0;
	double x = 0;
	double y = 0;

	public void setRadius(double radius) {
//		if (radius <= 0)
//			this.radius = 0;
//		else
//			this.radius = radius;

//		or
		this.radius = radius;
		if (this.radius < 0)
			this.radius = 0;

	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getArea() {
//		double area = Math.PI * (this.radius * this.radius);
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}

}

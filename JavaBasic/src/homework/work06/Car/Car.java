package homework.work06.Car;

public class Car {

	private double speed;
	private String color;
	private final static double MAX_SPPED = 200;

	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean sppedUp(double speed) {
		double target = this.speed + speed;
		
		if (target < 0 || target > MAX_SPPED)
			return false;
		else {
			this.speed = target;
			return true;
		}
	}

	public static double getMaxSpeed() {
		return MAX_SPPED;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
}

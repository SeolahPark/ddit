package homework.work06.NewCar;

public class NewCar {

	private double speed;
	private String color;
	private final static double MAX_SPPED = 200;

	NewCar() {
		this(null);
	}

	NewCar(String color) {
		speed = 0;
		this.color = color;
	}

	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpped(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return this.color;
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
		return killoToMile(MAX_SPPED);
	}

	private static double killoToMile(double distance) {
		return (distance / 1.6);
	}

	private static double MileTokillo(double distance) {
		return (distance * 1.6);
	}

	@Override
	public String toString() {
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}

}

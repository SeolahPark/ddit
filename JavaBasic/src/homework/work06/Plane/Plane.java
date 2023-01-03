package homework.work06.Plane;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	public Plane() {
		this(null,null,0);
//		numberOfPlanes++;
	}

	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}

	public String getManufacture() {
		return this.manufacture;
	}
	
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getmaxNumberOfPassengers() {
		return this.maxNumberOfPassengers;
	}
	
	public void setmaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		if(maxNumberOfPassengers < 0)
			this.maxNumberOfPassengers = 0;
			
	}
	
	public static int getnumberOfPlanes() {
		return numberOfPlanes;
	}

	@Override
	public String toString() {
		return "Plane [manufacture=" + this.manufacture + ", model=" + this.model + ", maxNumberOfPassengers="
				+ this.maxNumberOfPassengers + "]";
	}

}

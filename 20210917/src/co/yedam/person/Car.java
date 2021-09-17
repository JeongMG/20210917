package co.yedam.person;

public class Car {
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	private Tire tire;
	
	// 持失切
	public Car(String carName, String carModel, int carPrice, int maxSpeed, Tire tire) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}

	// 五社球
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	
	
}

package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		// sonata
		Car sonata = new Car("Sonata", "Sonata Hybrid", 2000, 200, new Tire());
		sonata.getCarName();
		sonata.getCarModel();
	}
}

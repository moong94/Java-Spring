package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("Drive yourself");
	}

	@Override
	public void stop() {
		System.out.println("Break yourself");
	}

	@Override
	public void wiper() {
		System.out.println("Wipe yourself");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("Wash yourself");
	}

}

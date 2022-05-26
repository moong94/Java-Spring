package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void turnOn() {
		System.out.println("Turn On the Car");
	}
	
	public void turnOff() {
		System.out.println("Turn Off the Car");
	}
	
	public void washCar() {
		
	}
	
	final public void run() {
		turnOn();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
		System.out.println();
	}
}

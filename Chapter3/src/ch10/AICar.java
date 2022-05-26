package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("Drive Auto");
	}

	@Override
	public void stop() {
		System.out.println("Break Auto");
	}

	@Override
	public void wiper() {
		System.out.println("Wipe Auto");
	}
	
}

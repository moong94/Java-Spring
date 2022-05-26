package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		Car mCar = new ManualCar();
		
		aiCar.run();
		mCar.run();
	}

}


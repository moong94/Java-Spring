package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
		
		Taxi taxiJal = new Taxi("�߳����� ���");
		
		studentE.takeTaxi(taxiJal, 10000);
		
		studentE.showStudentInfo();
		taxiJal.showTaxiInfo();
	}

}

package ch15;

public class Taxi {

	String taxiCompanyName;
	int taxiCompanyMoney;
	
	public Taxi(String taxiCompanyName) {
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void take(int taxiCompanyMoney) {
		this.taxiCompanyMoney += taxiCompanyMoney;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiCompanyName + " ������ " + taxiCompanyMoney + "�� �Դϴ�.");
	}
}

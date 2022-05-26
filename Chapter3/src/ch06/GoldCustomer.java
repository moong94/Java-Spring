package ch06;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "Gold";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
		
	}
	
}

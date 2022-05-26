package ch03;

public class Customer {

	private int customerId;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() call");
//	}
	
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;

		System.out.println("Customer() call");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "의 등급은 " + customerGrade + "\t 보너스 포인트 : " + bonusPoint;
	}
	
}

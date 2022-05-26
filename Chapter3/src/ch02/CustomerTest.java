package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("LEE");
		customerLee.setCustomerId(1001);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
	}

}

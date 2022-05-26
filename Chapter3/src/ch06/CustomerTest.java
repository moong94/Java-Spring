package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(1001, "T");
		Customer customerA = new Customer(1002, "A");
		Customer customerB = new GoldCustomer(1003, "B");
		Customer customerC = new GoldCustomer(1004, "C");
		Customer customerD = new VIPCustomer(1005, "D");
		
		customerList.add(customerT);
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(cost);
			System.out.println(customer.showCustomerInfo());
			
		}
		
	}

}

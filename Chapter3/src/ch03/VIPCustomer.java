package ch03;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		
		super(0, "noname");
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
		
		System.out.println("VIPCustomer() call");
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;

		System.out.println("VIPCustomer() call");
	}
	
	public String getAgentId() {
		return agentId;
	}
}

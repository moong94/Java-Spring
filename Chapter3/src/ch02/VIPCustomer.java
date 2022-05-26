package ch02;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentId;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
		
	}
	
	public String getAgentId() {
		return agentId;
	}
}

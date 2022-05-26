package ch15;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer Buy");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		Buy.super.order();
	}
	
	public void hello() {
		System.out.println("hello");
	}

}

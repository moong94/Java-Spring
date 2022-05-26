package ch08;

public class Order {

	public int orderNumber;
	public int orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String orderMenuNum;
	
	
	
	public int getOrderNumber() {
		return orderNumber;
	}



	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}



	public int getOrderPhoneNumber() {
		return orderPhoneNumber;
	}



	public void setOrderPhoneNumber(int orderPhoneNumber) {
		this.orderPhoneNumber = orderPhoneNumber;
	}



	public String getOrderAddress() {
		return orderAddress;
	}



	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}



	public String getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}



	public String getOrderTime() {
		return orderTime;
	}



	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}



	public int getOrderPrice() {
		return orderPrice;
	}



	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}



	public String getOrderMenuNum() {
		return orderMenuNum;
	}



	public void setOrderMenuNum(String orderMenuNum) {
		this.orderMenuNum = orderMenuNum;
	}



	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + orderNumber);
		System.out.println("주문 핸드폰 번호 : " + orderPhoneNumber);
		System.out.println("주문 집 주소 : " + orderAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderPrice);
		System.out.println("메뉴 번호 : " + orderMenuNum);
	}
	
}

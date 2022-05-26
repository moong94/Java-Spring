package ch08;

import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Order orderTest = new Order();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("접수 번호 : ");
		int number = scan.nextInt();
		orderTest.setOrderNumber(number);
		
		System.out.print("핸드폰 번호 : ");
		int phonNumber = scan.nextInt();
		orderTest.setOrderPhoneNumber(phonNumber);
		
		System.out.print("주소 : ");
		String temp = scan.nextLine();
		String address = scan.nextLine();
		orderTest.setOrderAddress(address);
		
		System.out.print("닐짜 : ");
		String date = scan.next();
		orderTest.setOrderDate(date);
		
		System.out.print("시간 : ");
		String time = scan.next();
		orderTest.setOrderTime(time);
		
		System.out.print("가격 : ");
		int price = scan.nextInt();
		orderTest.setOrderPrice(price);
		
		System.out.print("메뉴 번호 : ");
		String menuNum = scan.next();
		orderTest.setOrderMenuNum(menuNum);
		
		
		orderTest.showOrderInfo();
		
		
	}

}

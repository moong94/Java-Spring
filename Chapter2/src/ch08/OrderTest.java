package ch08;

import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		
		Order orderTest = new Order();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ��ȣ : ");
		int number = scan.nextInt();
		orderTest.setOrderNumber(number);
		
		System.out.print("�ڵ��� ��ȣ : ");
		int phonNumber = scan.nextInt();
		orderTest.setOrderPhoneNumber(phonNumber);
		
		System.out.print("�ּ� : ");
		String temp = scan.nextLine();
		String address = scan.nextLine();
		orderTest.setOrderAddress(address);
		
		System.out.print("��¥ : ");
		String date = scan.next();
		orderTest.setOrderDate(date);
		
		System.out.print("�ð� : ");
		String time = scan.next();
		orderTest.setOrderTime(time);
		
		System.out.print("���� : ");
		int price = scan.nextInt();
		orderTest.setOrderPrice(price);
		
		System.out.print("�޴� ��ȣ : ");
		String menuNum = scan.next();
		orderTest.setOrderMenuNum(menuNum);
		
		
		orderTest.showOrderInfo();
		
		
	}

}

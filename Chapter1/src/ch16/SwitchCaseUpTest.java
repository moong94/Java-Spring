package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		int day = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("�� ���� 31�� �Դϴ�.");
				yield 31;
				}
			case 2 -> {
				System.out.println("�� ���� 28�� �Դϴ�.");
				yield 28;
			}
			case 4, 6, 9, 11 -> {
				System.out.println("�� ���� 30�� �Դϴ�.");
				yield 30;
			}
			default -> {
				System.out.println("�������� �ʴ� ���Դϴ�.");
				yield -1;
			}
		};
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}

}

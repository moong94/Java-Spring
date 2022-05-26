package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int sum = 0;
		
		input = scan.nextInt();
		
		do {
			sum += input;
			input = scan.nextInt();
		} while(input != 0);
		System.out.println(sum);
	}

}

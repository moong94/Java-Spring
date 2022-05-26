package ch13;
import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int max;
		
		max = (num1 > num2) ? num1: num2;
		System.out.println(max);

	}

}

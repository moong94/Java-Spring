package ch21;

public class BreakTest {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		while(true) {
			sum += num;
			num++;
			if (sum >= 100) {
				break;
			}
		}
		System.out.println(sum);
		
	}

}

package ch15;

public class Student {
	
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi, int cost) {
		taxi.take(cost);
		this.money -= cost;
	}
	public void showStudentInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
}

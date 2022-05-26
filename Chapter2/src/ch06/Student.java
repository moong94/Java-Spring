package ch06;

public class Student {

	
	//멤버 변수
	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	//default 생성자
	public Student() {}
	
	//생성자
	public Student(int studentNumber, String studentName, int grade) {
	
		// this.멤버변수 = 매개변수
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}

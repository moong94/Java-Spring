package ch24;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	
	ArrayList<Subject> subjectList;
	
	Student(){}
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
		
	}
	
	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			
			System.out.println(studentName + "�л��� " + subject.getSubjectName() + "������ ������ " + subject.getScore());
		}
		
		System.out.println(studentName + "�л��� ������ " + total);
		
		
		
		
	}
	
	
}

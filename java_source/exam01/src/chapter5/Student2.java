package chapter5;

import java.util.ArrayList;

public class Student2 {
	int studentID;
	int age;
	String studentName;
	ArrayList<Subject2> subjectList;
	
	public Student2(int studentID, int age, String studentName) {
		this.studentID = studentID;
		this.age = age;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject2>();
	}
	
	public void addSubject(String name, double score) {
		Subject2 subject = new Subject2(name, score);
		subjectList.add(subject);
	}
	
	public void showInfo() {
		System.out.println("���̵� : " + studentID);
		System.out.println("�̸� : " + studentName);
		System.out.println("���� : " + age);
		System.out.println("-------- ���� ����, ���� ---------");
		
		for (Subject2 subject : subjectList) {
			System.out.println("���� : " + subject.subjectName + ", ���� : " + subject.score);
		}
	}
	
}
package com.kh.hw.person.model.vo;

// Person Ŭ�����κ��� ��ӹ���
public class Student extends Person {
	// �ʵ��
	private int grade;
	private String major;
	
	// �����ں�
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		
		this.grade = grade;
		this.major = major;
	}
	
	// �޼ҵ��
	//	getter/setter
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	//	* toString() : �� �ʵ��� ���� ��ȯ
	public String toString() {
		// �ʵ� 6
		return super.toString() + ", " + grade + ", " + major;
	}
	
}

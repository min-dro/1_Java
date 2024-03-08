package com.kh.hw.person.model.vo;

// Person 클래스로부터 상속받음
public class Student extends Person {
	// 필드부
	private int grade;
	private String major;
	
	// 생성자부
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		
		this.grade = grade;
		this.major = major;
	}
	
	// 메소드부
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
	
	//	* toString() : 각 필드의 값을 반환
	public String toString() {
		// 필드 6
		return super.toString() + ", " + grade + ", " + major;
	}
	
}

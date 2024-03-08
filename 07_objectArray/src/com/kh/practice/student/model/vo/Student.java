package com.kh.practice.student.model.vo;

public class Student {
	// �ʵ��(����, ������)
	private String name;		// �̸�
	private String subject;		// ����
	private int score;			// ����
	
	// �����ں�(2��)
	public Student() {
		
	}
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// �޼ҵ��
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform() {
		// return name + " " + subject + " " + score;
		// String.format("���ڿ� ����(���þ� ����)", ���þ �ش��ϴ� ����,)
		return String.format("�̸� : %s / ���� : %s / ���� : %d", name, subject, score);
	}
}

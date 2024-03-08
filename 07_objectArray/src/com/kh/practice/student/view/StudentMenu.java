package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	// �ʵ��
	private StudentController ssm = new StudentController();
	
	// �����ں�
	public StudentMenu() {
		System.out.println("========== �л� ���� ��� =========");
		// StudentController�� printStudent()�� ��ȯ ���� ���� �л� ���� ���
		Student[] sArr = ssm.printStudent();
		//	for(�ڷ��� ������ : �迭��)
		for(Student student : sArr) {
			System.out.println(student.inform());
		}
		System.out.println("========== �л� ���� ��� =========");
		// StudentController�� avgScore()�� ���� ���� �հ�� ��� ���
		double[] scores = ssm.avgScore();
		System.out.println("�л� ���� �հ� : " + (int)scores[0]);
		System.out.println("�л� ���� ��� : " + scores[1]);
		
		System.out.println("========== �л� ��� ��� =========");
		// �л��� ������ CUT_LINE �̸��̸� ����� ���, �̻��̸� ��� ���
		for(Student student : sArr) {
			System.out.printf("%s�л��� %s�Դϴ�.\n", student.getName(),(student.getScore() < StudentController.CUT_LINE ? "���" : "����� ���"));
		}
	}
	
}

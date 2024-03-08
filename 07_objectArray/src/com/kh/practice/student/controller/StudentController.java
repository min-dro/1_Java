package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// �ʵ��
	// Ctrl + Space
	private Student[] sArr = new Student[5];
	public final static int CUT_LINE = 60;
	
	// �����ں�
	public StudentController() {
		// (1)
		sArr[0] = new Student("��浿", "�ڹ�", 100);
		sArr[1] = new Student("�ڱ浿", "���", 50);
		sArr[2] = new Student("�̱浿", "ȭ��", 85);
		sArr[3] = new Student("���浿", "����", 60);
		sArr[4] = new Student("ȫ�浿", "�ڹ�", 20);
		
		// (2)
		/*
		String[] names = {"��浿", "�ڱ浿", "�̱浿", "���浿", "ȫ�浿"}
		String[] subjects = {"�ڹ�", "���", "ȭ��", "����", "�ڹ�"};
		int[] scores = {100, 50, 85, 60, 20};
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = new Student(name[i], subject[i], score[i]);
		}
		 */
	}
	
	// �޼ҵ��
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		// double[] d...
		// d[0] = sumScore �� ���� ��
		// d[1] = ���� ���... total/��ü����..
		double score[] = new double[2];
		score[0] = sumScore();
		score[1] = sumScore()/sArr.length;

		return score;
	}
}

package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// 필드부
	// Ctrl + Space
	private Student[] sArr = new Student[5];
	public final static int CUT_LINE = 60;
	
	// 생성자부
	public StudentController() {
		// (1)
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
		// (2)
		/*
		String[] names = {"김길동", "박길동", "이길동", "정길동", "홍길동"}
		String[] subjects = {"자바", "디비", "화면", "서버", "자바"};
		int[] scores = {100, 50, 85, 60, 20};
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = new Student(name[i], subject[i], score[i]);
		}
		 */
	}
	
	// 메소드부
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
		// d[0] = sumScore 의 리턴 값
		// d[1] = 합의 평균... total/전체개수..
		double score[] = new double[2];
		score[0] = sumScore();
		score[1] = sumScore()/sArr.length;

		return score;
	}
}

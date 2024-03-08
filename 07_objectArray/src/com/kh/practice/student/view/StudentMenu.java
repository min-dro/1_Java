package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	// 필드뷰
	private StudentController ssm = new StudentController();
	
	// 생성자부
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 =========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student[] sArr = ssm.printStudent();
		//	for(자료형 변수명 : 배열형)
		for(Student student : sArr) {
			System.out.println(student.inform());
		}
		System.out.println("========== 학생 성적 출력 =========");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		double[] scores = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)scores[0]);
		System.out.println("학생 점수 평균 : " + scores[1]);
		
		System.out.println("========== 학생 결과 출력 =========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for(Student student : sArr) {
			System.out.printf("%s학생은 %s입니다.\n", student.getName(),(student.getScore() < StudentController.CUT_LINE ? "통과" : "재시험 대상"));
		}
	}
	
}

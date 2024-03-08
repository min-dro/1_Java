package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : "양수가 아니다"); 
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.println(num%2 == 0 ? "짝수다" : "홀수다");
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int human = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int canddy = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + canddy/human);
		System.out.println("남는 사탕 개수 : " + canddy%human);
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int class_ = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘쨰자리 까지) : ");
		double avg = sc.nextDouble();
		String human = (gender == 'M')  ? "남학생" : "여학생";
		System.out.println(grade+"학년 "+class_+"반 "+num+"번 "+name+" "+human+"의 성적은 "+avg+"이다.");
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age <= 13 ? "\n어린이" :  age > 13 && age <= 19 ? "\n청소년" : "\n성인");
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		int total = kor + math + eng;
		double avg = total/3;
		System.out.println(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ? "\n합계 : 180\n평균 : 60.0\n합격" : "불합격");
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주만번호를 입력하세요(- 포함) : ");
		String num = sc.nextLine();
		System.out.println(num.charAt(7)%2 == 0 ? "\n여자" : "\n남자");
	}
	public void practice9() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num = sc.nextInt();
		System.out.println(num <= num1 || num > num2 ? "\ntrue" : "\nfalse");	
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		System.out.println(num1 == num2 && num2 == num3 && num1 == num3 ? "\ntrue" : "\nfalse");
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		System.out.println("\nA사원의 연봉/연봉+a : " + A + "/" + A*1.4);
		System.out.println(A*1.4 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원의 연봉/연봉+a : " + B + "/" + B*1.0);
		System.out.println(B >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원의 연봉/연봉+a : " + C + "/" + C*1.15);
		System.out.println(C*1.15 >= 3000 ? "3000 이상" : "3000 미만");
	}
}


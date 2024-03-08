package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	/*
	 * 실습 문제 1)
	 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 "OO메뉴입니다"를 출력하고,
	 * 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
	 * 
 	  	ex.
 		1. 입력
 		2. 수정
 		3. 조회
 		4. 삭제
 		7. 종료
 		메뉴번호를 입력하세요 3
 		조회 메뉴입니다
	 */
	public void practice1() {
		// Ctrl + spacs 단축키 : 자동으로 import 생성
		Scanner sc = new Scanner(System.in);
		// 메뉴를 화면에 출력
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		// "메뉴를 입력하세요 : " 화면에 출력하고, 사용자로부터 메뉴 번호 입력 받기
		System.out.print("메뉴번호를 입력하세요 : ");
		int selMenu = sc.nextInt();
		switch(selMenu) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("해당 메뉴는 업습니다.");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("짝수다");
		} else if(num%2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int total = kor + math + eng;
		double avg = total/3;
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}	
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();		
		switch(month) {
		case 1 :
			System.out.println(month + "월은 겨울입니다");
			break;
		case 2 :
			System.out.println(month + "월은 겨울입니다");
			break;
		case 3 :
			System.out.println(month + "월은 봄입니다");
			break;
		case 4 :
			System.out.println(month + "월은 봄입니다");
			break;
		case 5 :
			System.out.println(month + "월은 봄입니다");
			break;
		case 6 :
			System.out.println(month + "월은 여름입니다");
			break;
		case 7 :
			System.out.println(month + "월은 여름입니다");
			break;
		case 8 :
			System.out.println(month + "월은 여름입니다");
			break;
		case 9 :
			System.out.println(month + "월은 가을입니다");
			break;
		case 10 :
			System.out.println(month + "월은 가을입니다");
			break;
		case 11 :
			System.out.println(month + "월은 가을입니다");
			break;
		case 12 :
			System.out.println(month + "월은 겨울입니다");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다");
		}
	}
	public void practice5() {
		// 아이디 : user01, 비밀번호: 1234qwer!!
		String id = "user01";
		String pw = "1234qwer!!";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String inputPw = sc.nextLine();
		
		// 로그린 성공시
		if (inputId.equals(id) // equals: inputId 값과 id 값이 같은지
				&& inputPw.equals(pw)) {
			// (+) 비밀번호 : 최소 6자리 이상, 대문자 + 소문자 + 특수문자
			System.out.println("로그인 성공!");
		} else if (!inputId.equals(id)) {
			// id: user01, inputId: qqqq | inputId.equals(id) => false
			//						!(inputId.equals(id)) -> !false -> true
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String Account = sc.nextLine();
		switch(Account) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 개시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("오류");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		double BMI = kg / (m * m);
		System.out.println("BMI 지수 : " + BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		} else if (BMI >= 18.5 || BMI < 23) {
			System.out.println("정상체중");
		} else if (BMI >= 23 || BMI < 25) {
			System.out.println("과체중");
		} else if (BMI >= 25 || BMI < 30) {
			System.out.println("비만");
		} else if (BMI >= 30) {
			System.out.println("고도 비만");
		} else {
			System.out.println("오류");
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String sp = sc.next();
		if(sp == "+") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1+num2));
		} else if(sp == "-") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1-num2));
		} else if(sp == "*") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1*num2));
		} else if(sp == "/") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1/num2));
		} else if(sp == "%") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1%num2));
		} else {
			System.out.print("잘못 입력하셨습니다.프로그램을 종료합니다.");
			
		}
	}
}

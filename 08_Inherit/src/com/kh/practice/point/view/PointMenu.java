package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Rectangle;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	public void mainMenu() {
		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			}
			
			// select 값이 1, 2, 9가 아닌경우 게속 반복문을 실행
		} while(true);
	}
	// 원 메뉴 출력. 잘못 입력했을 시 메인메뉴로 돌아감
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		// sysout 입력후 Ctrl + Space : System.out.println
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
			case 9:
			}
		}
	// 사각형 메뉴 출력. 잘못 입력했을 시 메인메뉴로 돌아감 
	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		
		int select = sc.nextInt();
		switch(select) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
		case 9:
		}
	}
	// x, y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
	public void calcCircum() {
		// x죄표, y좌표, 반지름의 값을 입력받아
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		// CircleController 의 calcCircum() 메소드를 호출
		//	- 입력받은 x, y, 반지름의 값을 전달하여 호출 calcCircum(x, y, r)
		String result = cc.calcCircum(x, y, r);
		
		// 그 결과 값을 출력
		//	메소드 호출 후 결과 값은 문자열 자체로 처리 가능
		//	변수에 대입할 수도 있고, printf에서 지시어로 %s를 사용할 수 있다.
//		String result = cc.calcCircum(x, y, r);
//		System.out.println(result);
		
	}
	// x, y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
	public void calcCircleArea() {
		// x좌표, y좌표, 반지름을 입력받아
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("반지름 : ");
		int r = sc.nextInt();
		
		// CircleController의 calcArea 메소드를 호출
		//	- 입력받은 값을 매개변수로 출력
	}
	// x, y 좌표와 높이, 너비를 입력받아 사각형의 정보와 둘레 출력
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("높이 : ");
		int h = sc.nextInt();
		
		System.out.println("너비 : ");
		int w = sc.nextInt();
		
		// RectangleController 의 calcPerimeter 메소드 호출 후
		//	그 결과를 출력
		String result = rc.calcPerimeter(x, y, h, w);
		System.out.println(result);
	}
	// x, y 좌표와 높이, 너비를 입력받아 사각형의 정보와 넓이 출력
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.println("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.println("높이 : ");
		int h = sc.nextInt();
		
		System.out.println("너비 : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, h, w));
	}
}

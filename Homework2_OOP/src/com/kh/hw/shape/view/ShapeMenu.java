package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	public void inputMenu() {
		do {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int type = sc.nextInt();
			if(type == 3) {
				triangleMenu();
			} else if(type == 4) {
				squareMenu();
			}
			
		} while(true);
	}
	public void triangleMenu() {
		int type = 3;
		System.out.println("1.삼각형 면적");
		System.out.println("2.삼각형 색칠");
		System.out.println("2.삼각형 정보");
		System.out.println("9.종료");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		inputSize(type, menuNum);
	}
	public void squareMenu() {
		int type = 4;
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 면적");
		System.out.println("3.사각형 색칠");
		System.out.println("4.사각형 정보");
		System.out.println("9.종료");
		System.out.print("메뉴입력 : ");
		int menuNum = sc.nextInt();
		inputSize(type, menuNum);
	}
	public void inputSize(int type, int menuNum) {
		switch(type) {
		case 3:
			switch(menuNum) {
			case 1:
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				double result = tc.calcArea(height, width);
				System.out.println("사각형 넓이 : " + result);
				break;
			case 2: 
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다");
				break;
			default:
				System.out.print("오류");
			}
			break;
		case 4:

			if(menuNum == 1 || menuNum == 2) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				if(menuNum == 1) {
					double result = scr.calcPerimeter(height, width);
					System.out.println("사각형 둘레 : " + result);
				} else if(menuNum == 2) {
					double result = scr.calcArea(height, width);
					System.out.println("사각형 넓이 : " + result);
				}
			} else if(menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다");
			} else {
				System.out.print("오류");
			}
			
		case 9:
			System.out.print("종료합니다");
			break;
		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요");
		}
		
	}
	public void printInformation(int type) {
		if(type == 3) {
			tc.print();
		} else if(type == 4) {
			scr.print();
		}
	}
}

package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender= sc.next().charAt(0);
		
//		Member m - new Member(name, age, gender);
		// LibraryController 의 insertMember() 메소드
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 전체 조회");
		System.out.println("4. 거사 ");
		System.out.println("5. 도서 전체 조회");
//		public void selectAll();
		// Librarycontroller 클래스의 
//		Book[] bList = lc.selectAll();
	}
	public void selectAll() {
		// selectAll 메소드 호출
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		// LibraryController 클래스의 rentBook 메소드로 인덱스 정보를 전달
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다.");
		}
	}
}

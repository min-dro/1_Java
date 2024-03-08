package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {
	Scanner sc = new Scanner(System.in);
	LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("���� : ");
		char gender= sc.next().charAt(0);
		
//		Member m - new Member(name, age, gender);
		// LibraryController �� insertMember() �޼ҵ�
		System.out.println("===== �޴� =====");
		System.out.println("1. ����������");
		System.out.println("2. ���� ��ü ��ȸ");
		System.out.println("3. ���� ��ü ��ȸ");
		System.out.println("4. �Ż� ");
		System.out.println("5. ���� ��ü ��ȸ");
//		public void selectAll();
		// Librarycontroller Ŭ������ 
//		Book[] bList = lc.selectAll();
	}
	public void selectAll() {
		// selectAll �޼ҵ� ȣ��
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		
		// LibraryController Ŭ������ rentBook �޼ҵ�� �ε��� ������ ����
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0:
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
			break;
		case 1:
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
			break;
		case 2:
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
	}
}

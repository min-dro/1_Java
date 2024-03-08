package com.kh.controller;

import java.util.Scanner;
import com.kh.model.vo.User;
public class PlayController {
	private User user = new User("���μ�");
	Scanner sc = new Scanner(System.in);
	// method01 : �������� �̾Ƽ�, ����ڷκ��� �Է��� ���� ��
	//			  �� ���� ���������� ũ�� "Down" ���
	//			  ������ "Up" ���
	//			  ���� ���̸� "Catch!" ��� User�� score += 10;
	//			  ��, 5���� ��ȸ�ȿ� �����ؾ� ���� ȹ��!
	public void method01() {
		System.out.println("====== Up&Down ======");
		System.out.println(" 1 ~ 50 ������ ���� ���߱� ");
		System.out.println("======================");
		
		// Math.random() * (�������� �������) + (���۹�ȣ)
		int random = (int)(Math.random() * 50 + 1);
		
		int userScore = user.getScore();
		// --------------
		for(int i=0; i < 5; i++) {
			System.out.print("��ȣ �Է� : ");
			int num = sc.nextInt();
		
		
			if(random < num) {
				System.out.println("** Down! **");
			} else if(random > num) {
				System.out.println("** Up! **");
			} else if(random == num) {
				System.out.println("** Catch! **");
				user.setScore(userScore + 10);
				
			} else {
				System.out.println("** Error **");
			}
		}
	}
	
	// method02 : ���������� ����
	//			  �������� �̾Ƽ� 1�� ��� ����,
	//						  2�� ��� ����,
	//						  3�� ��� ��. ��� ��Ģ�� ���س���. 
	
	// 			  ����ڷκ��� �Է��� �޾�, ���� ���� �� ����� ���
	//			  ����(1) < ����(2) | ����(2) > ��(3) | ����(2) < ��(3) |
	//				����ڰ� �Է��� �������� "�¸�
	public void method02() {
		System.out.println("====== ����|����|�� ======");
		System.out.println(" 1. ����, 2.���� 3.�� ");
		System.out.println("======================");
		
		// ������ �̱� (1 ~ 3)
		int random = (int)(Math.random() * 3 + 1);
		
		System.out.print("���� : ");
		int sel = sc.nextInt();
		
		/*
		 * �����
		 * �����
		 * �����
		 */
		
		int userScore = user.getScore();
		int iResult = 0;
		
		
		
		// ���������� ����� üũ
		if (sel < random ) {
			if (sel == 1 && random == 3) { // �����: ����, ��ǻ��(������): ��
				iResult = 1;
			} else {
			iResult = -1;
			}
		} else if (random < sel) {
			if (random == 1 && sel == 3) {
				// ��ǻ��: ����(1), �����: ��(3) => ����� �й�
				iResult = -1;
			} else {
				iResult = 1;
			}
		}
		// ��� ���
		if (iResult == 0) {
			System.out.println(" ** ���! ** ");
		} else if (iResult == 1) {
			System.out.println(" ** �̱�! ** ");
			user.setScore(userScore + 10);
		} else {
			System.out.println(" ** �й�! ** ");
			user.setScore(userScore - 10);
		}
		
//		System.out.println("��ǻ�� ����: " + info[random-1]);
//		System.out.println("��ǻ�� ����: " + info[sel-1]);
	}
	
	public void method03(){
		System.out.println("====== ���ھ߱� ======");
		System.out.println(" ���ڸ� ���ڸ� �Է��ϼ��� ");
		System.out.println("======================");
		int random = (int)(Math.random() * 89 + 10);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		for (int i=0; i < 5; i++) {
		
		}
	}
	
	// getUserInfo : ������� ���� ��ȸ(���)
	public void getUserInfo() {
		System.out.println(user.toString());
	}
}

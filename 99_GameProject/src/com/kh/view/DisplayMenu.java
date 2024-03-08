package com.kh.view;

import java.util.Scanner;
import com.kh.controller.PlayController;

public class DisplayMenu {
	PlayController pc = new PlayController();
	public void mainMenu() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("======Console Game======");
			System.out.println("1. Up & Down");
			System.out.println("2. ����������");
			System.out.println("3. ���� �߱�");
			System.out.println("9. ������ȸ");
			System.out.println("0. ���� ����");
			System.out.println("========================");
		
			System.out.print("���� ����: ");
			int sel = sc.nextInt();
			
			switch(sel) {
			case 1:
				pc.method01();
				break;
			case 2:
				pc.method02();
				break;
			case 3:
				pc.method03();
				break;
			case 9:
				pc.getUserInfo();
				break;
			case 0:
				System.out.println("������ �����մϴ�.");
				return;
			}
		}
	}
}

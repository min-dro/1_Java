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
			System.out.println("2. 가위바위보");
			System.out.println("3. 숫자 야구");
			System.out.println("9. 점수조회");
			System.out.println("0. 게임 종료");
			System.out.println("========================");
		
			System.out.print("게임 선택: ");
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
				System.out.println("게임을 종료합니다.");
				return;
			}
		}
	}
}

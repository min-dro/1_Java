package com.kh.model.vo;

import java.util.Scanner;

public class RockPaper extends Player{
	Player user = new Player();
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("====== ����|����|�� ======");
		System.out.println(" 1. ����, 2.����, 3.�� ");
		System.out.println("======================");
		int com = (int)(Math.random()*3+1);
		int cnt = user.getScore();
		for(int i=0;i==1;) {
			System.out.println("���� : ");
			int select = sc.nextInt();
			if(select < com) {
				if(select == 1 && com == 3) {
					System.out.println("*** win! ***");
					user.setScore(cnt + 10);
					i++;
				} else {
					System.out.println("*** lose... ***");
					user.setScore(cnt - 5);
					i++;
				} 
			} else if(select > com) {
				if(com == 1 && select == 3) {
					System.out.println("*** lose... ***");
					user.setScore(cnt - 5);
					i++;
				} else {
					System.out.println("*** win! ***");
					user.setScore(cnt + 10);
					i++;
				}
			} else if(select == com) {
				System.out.println("*** drew! ***");
			} else {
				System.out.println("error");
				break;
			}
		}
	}
}

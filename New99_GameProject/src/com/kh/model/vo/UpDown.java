package com.kh.model.vo;

import java.util.Scanner;

public class UpDown extends Player {
	Player user = new Player();
	Scanner sc = new Scanner(System.in);
	public void start() {
		int num = (int)(Math.random()*30 + 1);
		int cnt = user.getScore();
		System.out.println("===== Up & Down =====");
		System.out.println("1 ~ 30 사이의 숫자 맟추기 ");
		System.out.println("=====================");
		for(int i=0;i<3;i++) {
			System.out.print("번호입력 : ");
			int select = sc.nextInt();
			if(select < num) {
				System.out.println("*** Up! ***");
			} else if(select > num) {
				System.out.println("*** Down! ***");
			} else if(select == num) {
				System.out.println("*** Catch! ***");
				 user.setScore(cnt + 10);
				break;
			} else {
				System.out.println("error");
				break;
			}
		}
	}
}

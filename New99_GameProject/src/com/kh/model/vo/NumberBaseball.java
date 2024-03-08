package com.kh.model.vo;

import java.util.Scanner;

public class NumberBaseball extends Player {
	Scanner sc = new Scanner(System.in);
	Player user = new Player(); 
	int cnt = user.getScore();
	public void start() {
		System.out.println("====== 숫자야구 ======");
		System.out.println(" 두자리 숫자를 입력하세요 ");
		System.out.println("======================");
		int random = (int)(Math.random() * 89 + 10);
		for(int i=0;i<5;i++) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if(random == num) {
				System.out.println("***Strike!***");
				user.setScore(cnt + 20);
				break;
			} else if(random != num) {
				System.out.println("***Out!***");
			} else {
				System.out.println("error");
				break;
			}
		}
	}
}

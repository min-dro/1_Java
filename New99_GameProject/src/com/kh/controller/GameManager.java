package com.kh.controller;

import java.util.Scanner;

import com.kh.model.vo.*;

public class GameManager {
	UpDown ud = new UpDown();
	RockPaper rp = new RockPaper();
	NumberBaseball nb = new NumberBaseball();
	Result rs = new Result();
	public void main() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
		System.out.println("====== Console Game ======");
		System.out.println("1. Up & Down");
		System.out.println("2. 가위바위보");
		System.out.println("3. 숫자 야구");
		System.out.println("4. ==추가 게임 개발중==");
		System.out.println("9. 점수 조회");
		System.out.println("0. 게임 종료");
		System.out.println("======================");
		System.out.print("게임 선택:");
		num = sc.nextInt();
		switch(num) {
		case 1:
			ud.start();
			break;
		case 2:
			rp.start();
			break;
		case 3:
			nb.start();
			break;
		case 4:
			System.out.println("개발중 입니다.");
		case 9:
			rs.result();
			break;
		case 0:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("error");
		}
		}while(num == 0);
		
		
	}
}

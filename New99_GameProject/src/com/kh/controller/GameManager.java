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
		System.out.println("2. ����������");
		System.out.println("3. ���� �߱�");
		System.out.println("4. ==�߰� ���� ������==");
		System.out.println("9. ���� ��ȸ");
		System.out.println("0. ���� ����");
		System.out.println("======================");
		System.out.print("���� ����:");
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
			System.out.println("������ �Դϴ�.");
		case 9:
			rs.result();
			break;
		case 0:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default:
			System.out.println("error");
		}
		}while(num == 0);
		
		
	}
}

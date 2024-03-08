package com.kh.hospital_reception.run;

import java.util.Scanner;

import com.kh.generic.practice1.CustomArray;
import com.kh.generic.practice1.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomArray ca = new CustomArray();
		while (true) {
			System.out.println("1.추가");
			System.out.println("2.삭제");
			System.out.println("3. 번호로 이름 찾기");
			System.out.println("4. 이름으로 번호 찾기");
			System.out.println("5. 조회");
			System.out.println("0. 끝내기");
			System.out.print("입력 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				ca.add(null);
				break;
			case 2:
				System.out.print("삭제할 이름 입력 : ");
				String element = sc.next();
				ca.remove(element);
				break;
			case 3:
				System.out.print("번호 입력 : ");
				int idx = sc.nextInt();
				System.out.println(ca.get(idx));
				break;
			case 4:
				System.out.print("이름 입력 : ");
				element = sc.next();
				System.out.println(ca.find(element));
				break;
			case 5:
				ca.print();
				break;
			case 0:
				System.out.print("ByeBye");
				return;
			default:
				break;
			}
		}
	}
}

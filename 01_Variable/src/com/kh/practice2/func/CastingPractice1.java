package com.kh.practice2.func;
	
import java.util.Scanner;

public class CastingPractice1 {
	
	/*
	 * 실습문제 1) 키보드로 문자 하나를 입력 받아 그 문자의 유니 코드를 출력하세요.
	 * ex. 문자 : A
	 * 		A unicode : 65
	 */
	public void Practice() {
		// import 없이 Scanner 사용하는 방법
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("");
		System.out.println(ch + " unicode : " + (int)ch);
		System.out.printf("%c unicode : %d\n", ch, (int)ch);
				
	}
}

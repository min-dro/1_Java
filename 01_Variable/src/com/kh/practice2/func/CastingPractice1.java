package com.kh.practice2.func;
	
import java.util.Scanner;

public class CastingPractice1 {
	
	/*
	 * �ǽ����� 1) Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���� �ڵ带 ����ϼ���.
	 * ex. ���� : A
	 * 		A unicode : 65
	 */
	public void Practice() {
		// import ���� Scanner ����ϴ� ���
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("");
		System.out.println(ch + " unicode : " + (int)ch);
		System.out.printf("%c unicode : %d\n", ch, (int)ch);
				
	}
}

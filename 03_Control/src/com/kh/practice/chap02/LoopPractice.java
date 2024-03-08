package com.kh.practice.chap02;
import java.util.Scanner;
public class LoopPractice {
	/*
	 * 
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		 
		// ȭ�鿡 "1�̻��� ���ڸ� �Է��ϼ��� : "���
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt(); // ������ �����͸� �Է¹޾� ������ ����

		// ��, �Է��� ���� 1���� ũ�Ŵ� ���ƾ� �մϴ�.
		if(num >= 1) {
			// 1���� num���� ���ڸ� ���
			for(int i=0; i<num; i++) {
				System.out.print(i + " ");
			}
			/*
			 for(int i=0; i<num; i++) {
			 	System.out.print(i + " ");
			 }
			 */
		} else {	// num < 1
			// "1�̸��� ���� �ԷµǾ����ϴ�." ���
			System.out.println("1�̸��� ���� �ԷµǾ����ϴ�.");
		}
		/*
		 if(num < 1) {
		 	System out println("1�̸��� ���� ��µǾ����ϴ�.");
		 */
	}
	/*
	 * �ǽ����� 2)
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			// ---------------------------------------- 
			// ȭ�鿡 "1�̻��� ���ڸ� �Է��ϼ��� : "���
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt(); // ������ �����͸� �Է¹޾� ������ ����

			// ��, �Է��� ���� 1���� ũ�Ŵ� ���ƾ� �մϴ�.
			if(num >= 1) {
				// 1���� num���� ���ڸ� ���
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			}
			// ----------------------------------------
		} while (num < 1);
}
	}

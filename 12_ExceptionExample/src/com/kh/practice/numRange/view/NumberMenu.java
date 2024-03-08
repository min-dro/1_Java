package com.kh.practice.numRange.view;

import java.util.Scanner;
import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	// �޼ҵ�
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		// ���� 2�� �Է� �ޱ�
		System.out.print("����1 : ");		// �ܼ�â�� ����ϱ�
		int num1 = sc.nextInt();		// ����ڷκ��� �Է¹ޱ�
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.printf("%d��(��) %d�� ����ΰ� ? %b\n", num1, num2, result);
		} catch(NumRangeException e) {
			// printStackTrace() : ���� �߻� ��ġ�� ȣ��� �޼ҵ� ���� ���
			// 	* Throwable Ŭ������ ���� ��ӹ��� (Throwable: Exception Ŭ���� �����..)
			e.printStackTrace();
		}
	}
}

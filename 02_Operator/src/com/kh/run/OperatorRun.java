package com.kh.run;

import java.util.Scanner;
/*
 * ������ : ���α׷��� ����� �� ������ �����ִ� �͵�.
 * - ( �켱���� ) �� ( ���̹���(�������) ) �� �߿���!
 * - [1] ���� ���� ������ : [] .
 * 	 [2] ���� ������     : ��ȣ ������ : +, - / ���������� :++, -- / ����ȯ  : (type) / ���� ������);
 *   [3] ���������	  : + - *  /(��) %(������)
 *   ��Ʈ ����Ʈ ������: << >> (���:0, ����: 1) >>> (0)
 *   [4]
 *   [5]
 *   [6] ���� ������(��Ʈ ������) : && || & |
 */
public class OperatorRun {
	public static void main(String[] args) {

	}
	// ���� ������ : ++ --
	public static void practice1() {
		// ��������: ++(����)
		int num = 10;
		System.out.println("������ �����ϱ� �� num: " + num);	// 10
		System.out.println("1ȸ ���� �� num: " + ++num);		// 11
		System.out.println("2ȸ ���� �� num: " + ++num);		// 12
		System.out.println("3ȸ ���� �� num: " + ++num);		// 13
		System.out.println("���� num: " + num);				// 13
		
		System.out.println("===============================");
		// (����)++
		int num2 = 10;
		System.out.println("������ �����ϱ� �� num2: " + num2);	// 10
		System.out.println("1ȸ ���� �� num2: " + num2++);		// 10
		System.out.println("2ȸ ���� �� num2: " + num2++);		// 11
		System.out.println("3ȸ ���� �� num2: " + num2++);		// 12
		System.out.println("���� num2: " + num2);				// 13
	}
	
	public static void practice2() {
		int num1 = 10;
		int num2 = 10;
		int result1 = ++num1 * 3; // result1: 33, num1: 11
		int result2 = num2++ * 3; // result2: 30, num2: 11
		
		System.out.printf("num1: %d, result1: $d\n", num1, result1);  // num1: 11, result1
		System.out.printf("num2: %d, result2: $d\n", num2, result2);  // num2: 11, result2
	}
	
	public static void practice3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);					// ��°�: 10, ��� �� a: 11
		System.out.println((++a) + (b++));			// ��°�: 32, ��� �� a: 12, b: 21
						//  ((++11) + (20__))
						//  ( 12 + (20++))
						//  ( 12 + 20 )		// 20++ �ؾ���!
						//  ( 32 )
		System.out.println((a++) + (--b) + (--c));	// ��°�: 61 , ��� �� a: 13, b: 20, c: 29
	}
	public static void practice4() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; 		// (++5) + 10 = 6 + 10 = 16, c: 16, a: 6
		int d = c / a;			// 16 / 6 = 2, 				 d:2
		int e = c % a;			// 16 % 6 = 4 ,				 e:4
			
		// a: 6, b: 10, c: 16, d: 2, e: 4
		
		int f = e++;			// (4++)					 		 f: 4, e: 5
			
		int g = (--b) + (d--);	// (--10) + (2--) = 9 + (2--) = 11 , b: 9, g: 11, d: 1
		int h = 2;
			
		// a: 6, b: 9, c: 16, d: 1, e: 5, f: 4, g: 11, h: 2
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//		 (6++) + 9 / (--16 / 4) * (11-- - 1) % (++5 + 2)
		//	   = (6++) + 9 / 3 * 10 % 8			c: 15, g: 10, e: 6
		//	   = (6++) + 3 * 10 % 8
		//     = (6++) + 30 % 8
		//	   = (6++) +6
		//	   = 6 + 6 = 12						i: 12 , a: 7
		
		System.out.println("a: " + a);		// 7
		System.out.println("b: " + b);		// 9
		System.out.println("c: " + c);		// 15
		System.out.println("d: " + d);		// 1
		System.out.println("e: " + e);		// 6
		System.out.println("f: " + f);		// 4
		System.out.println("g: " + g);		// 10
		System.out.println("h: " + h);		// 2
		System.out.println("i: " + i);		// 12
	}
	
	// ����������/��(����)������
	public static void practice5() {
		// ����ڷκ� 1 ~ 10������ ������ �Է¹��� ��� true�� ����ϰ�,
		//	�׷��� ���� ��� false ���.
		Scanner sc = new Scanner(System.in);
		
		// ȭ�鿡 "1 ~ 10 ������ ������ �Է�: " ���(�ٹٲ� ����)
		System.out.print("1 ~ 10 ������ ������ �Է�: ");
		int num = sc.nextInt();
		
		// num�� ���� 1, 2, 3, 4, 5 ..., 9, 10 => true
		//	num�� �ּҰ��� 1�̰�, �ִ밪�� 10 �̸� true
		//	num�� ���� 1���� ũ�ų� ����, 10���� �۰ų� ������ true
		boolean result = (num >= 1) && (num <= 10);
		
		System.out.printf("�Է��� �� %d�� 1 ~ 10 ������ �����Դϱ�? %b", num, result);
	}
	
	public static void practice6() {
		// ����ڷκ��� ����(a ~ z, A ~ Z)�� �ϳ� �Է� �޾�
		//  �빮������ �ҹ������� ���
		//  ��� ���� �Է��� ���� [a]�� [�ҹ���]�Դϴ�.
		//  * [ASCII] a: 97, A: 65
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է�: ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		// �Է� ���� ��(ch)�� �ҹ��� ���� ���ԵǴ� �� : 97 ~ 122
		String result = (97 <= ch) && (ch <= 122) ? "�ҹ��� �Դϴ�." : "�ҹ��ڰ� �ƴմϴ�.";
		System.out.println("[1] �Է� �� " + ch + "�� "+ result);
		
		String result2 = ('a' <= ch) && (ch <= 'z') ? "�ҹ��� �Դϴ�." : "�ҹ��ڰ� �ƴմϴ�.";
		System.out.println("[2] �Է� �� " + ch + "�� "+ result);
		
		String result3 = ('a' <= 97) && ('z' >= 122) ? "�ҹ���" : "�ҹ��ڰ� �ƴմϴ�.";
	}
}

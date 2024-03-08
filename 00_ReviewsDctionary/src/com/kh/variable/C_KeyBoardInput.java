package com.kh.variable;
/*
 * Ű����� �Է��� �޴� ���: Scanner
 * [�غ����]
 * 1. import java.util.Scanner;
 * 2. Scanner ��ü ����
 * 	  Scanner [��ü��] = new Scanner(System.in);
 * 3. [��ü��].nextXXX();
 * 	  - ����(��)�� �Է¹��� �� : next(, nextLine()
 * 		* next() : ���� ������ �����͸� �Է¹���.
 * 		* nextLine() : �Է��� ���� ��� ������ ��.
 * 					   \n�� �������� �Է� ���θ� �Ǵ�.
 * 					   ����(�ӽð���)�� \n�� ������ �Է¹��� ������ �Ǵ�,
 * 	  - �������� �Է¹��� �� : nextInt(), nextByte(), nextShort(), nextLong()
 * 	  - �Ǽ����� �Է¹��� �� : nextDOuble(), nextFlost()
 * 	  - �������� �Է¹��� �� : nextBoolean()
 */
import java.util.Scanner;

public class C_KeyBoardInput {
	public static void main(String[] args) {
		// Scanner ��ü ����
		// Scanner [��ü��] = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		// ���̸� �Է¹ޱ�
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		// �̸��� �Է¹ޱ�
		System.out.println("�Ƹ� ����");
	}
}

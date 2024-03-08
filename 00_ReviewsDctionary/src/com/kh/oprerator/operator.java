package com.kh.oprerator;
/*
 * ������: ���α׷� ������ ������ �����ϴ� ��ȣ
 * - �켱����, ���ո���(������ �����ϴ� ��ȣ
 * - �켱����
 * [1] ���� ���� ������ : () . []
 * [2] ���� ������ : ��ȣ(+ -), ����(!), ����(++ --), (type) ����ȯ
 * 				  ex) 10+, -10, -num
 * [3] ��� ������ : + - *(���ϱ�) /(������ ��) %(������)
 * 				   �켱���� : * / % > + -
 * [4] �� ������ : > >= <= <
 * 						   : A�� B���� ������ ? A < B
 * 					����� : A�� B�� ������ ? A == B
 * 						   : A�� B�� �ٸ��� ? A != B
 * [5] ���� ������ : && ||
 * 				- A && B
 * 							A	  B		A && B 
 * 						   true  true    true
 * 						   true  false	 false
 * 						   false true    false
 * 						   false false   false
 * 					* SCE ? B������ ������� �ʴ� ��� => A�� false�� ��
 * 				  - A || B: �Ǵ�, ~�ų�
 * 							 A		 B		A || B
 * 							true	true	 true
 * 							true	false	 true
 * 							false 	true 	 true
 * 							false	false	 false
 * 					* SCE ? B������ ������� ���� ��� => A�� true�ϋ�
 * [6] ���׿�����
 * 			[ǥ����]	(���ǽ�) ? (���ǽ��� ���� �� ����� ��/��) : (���ǽ��� ������ ��)
 * 
 * 				ex) String result = (a > 0) ? "���" : "����� �ƴϴ�";
 * [7] ���Կ����� : = ���մ��Կ�����(+= *= -= /= %=)
 */

public class operator {

	public static void main(String[] args) {
		// ���� ������ (SCE)
		int num = 10;
		boolean bResult = (num < 10) && (num++ > 10);
		System.out.println("bResult: " + bResult + ", num: " + num);
		// bResult: false, num: 10
		
		boolean bResult2 = (num == 10) || (num++ > 10);
		System.out.println("bResult2: " + bResult2 + ", num: " + num);
		// num == 10 : true �̹Ƿ� �ڿ� num++ > 10 ������ ������� ����. (SCE)
		// bResult2: true, num: 10
		
		// ���� ������
		// (���ǽ�) ? (���ǽ��� ���� �� ����� ��/��) : (���ǽ��� ������ �� ����� ��/��)
		int n1 = 15;
		
		// n1�� ���� ¦���̸� "¦��", Ȧ���̸� "Ȧ��"�� ���
		// (¦���� ���ϴ� ���ǽ� n1 % 2 == 0
		String result = (n1 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("n1�� " + result + "�Դϴ�.");
	}
}

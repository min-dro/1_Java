package com.kh.practice;
/*
 * ������ ���� ��Ģ
 * [1] ��ҹ��� ���еǰ� , ���� ���� ����
 * [2] ���� ����� �� ���� (���� ����� �� ���� (�����: �뵵�� ������ �ִ� �̸���)
 * [3] ���ڷ� ������ �� ����
 * [4] Ư�����ڴ� '_' �� '$' �� ��� ����
 * [5] ��Ÿǥ��� : �ҹ��ڷ� �����ؼ�, ���� ���� �ܾ �� ��� �빮�ڷ� ����.
 */
public class Practice01 {
	public static void main(String[] args) {
		// [1] ��ҹ��ڸ� �����Ѵ�.
		// ������((int) �ڷ����� "num" �̸����� ���� ����
		int num = 10;
//		int num;
		int Num = 50;
		int nuM = 90;
		int NUM = 20;
		
		System.out.println("=== [1] ��ҹ��� ���� Ȯ�� ====");
		System.out.println("num: " + num + ", Num: " + Num);
		// ���� ���) num: 10, Num: 50
		System.out.println("nuM: " + nuM + ", NUM: " + NUM);
		// ���� ���) nuM: 90, NUM: 20
		
		// [2] ����� ����� �� ����
		// �ּ� ����Ű: Ctrl + /	
		
		/* ����� ��� �Ұ�
		int int;
		int boolean;
		int if;
		int while;
		/////
		// ���� �ƴ� ��� ��� ����
		int String = 10;
		String Practice01;
		*/
		
		// [3] ���ڷ� ������ �� ����
		/* ���ڷ� ������ ��� ���� ���� �Ұ�!
		int 3user;
		String 1str;
		double 9round;
		*/
		
		// [4] Ư�����ڴ� ( _ ) �� ( $ ) �� ��� ����
		int _int;
		int $int;
		/* _ �� $ �ܿ��� ��� �Ұ�.
		int #aaa;
		int @bbb
		int (ddd);
		*/
		
		// [5] ��Ÿǥ��� (camelcase) ���
		//     : �ҹ��ڷ� �����ؼ� ���� �ܾ��� ������ �빮�ڷ�!
		// ������ : customer name "ȫ�浿", "������"
		// ������ȣ : customer no/num 1, 2, 3, 4, 5, ...
		// ����id/pw : customer id/pw "hong12"/"1234"
//		String customerName;
		int customerNo;
		String customerId;
		String customerPw;
	}
}

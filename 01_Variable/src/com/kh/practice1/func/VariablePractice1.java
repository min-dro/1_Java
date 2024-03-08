package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void Practice() {
		/*
		 �̸�, ����, ����, Ű��
		 ������ �Է��ϼ���(��/��) : ��
		 ���̸� �Է��ϼ���
 		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		// "ȫ�浿", "������", "���ð�"
		String name = sc.nextLine();	// nextLine : ���ڿ��� �Է¹޴� �޼ҵ�
		System.out.print("������ �Է��ϼ���(��/��) : ");
		// '��', '��'
		// "����" -> '��', '��'
		// "��", "��" -> '��', '��'
		String strGender = sc.next(); //next : ���ڿ��� �Է¹޴� �޼ҵ�. ���� ������.
		char gender = strGender.charAt(0); // charAt(index) : ���ڿ����� index ��ġ�� ���� 
		//sc.next().charAt(0);
		// "�ȳ� �ϼ���" 
		// nextLine : "�ȳ� �ϼ���"
		// next		: "�ȳ�"
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		/*
		 	Ű 180.5cm�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
		 */
		System.out.printf("Ű %.1fcm�� %d�� %c�� %s�� �ݰ����ϴ�^^ \n",
							height, age, gender, name);
	}
}

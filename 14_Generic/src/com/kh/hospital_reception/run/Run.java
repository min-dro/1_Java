package com.kh.hospital_reception.run;

import java.util.Scanner;

import com.kh.generic.practice1.CustomArray;
import com.kh.generic.practice1.*;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomArray ca = new CustomArray();
		while (true) {
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3. ��ȣ�� �̸� ã��");
			System.out.println("4. �̸����� ��ȣ ã��");
			System.out.println("5. ��ȸ");
			System.out.println("0. ������");
			System.out.print("�Է� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				ca.add(null);
				break;
			case 2:
				System.out.print("������ �̸� �Է� : ");
				String element = sc.next();
				ca.remove(element);
				break;
			case 3:
				System.out.print("��ȣ �Է� : ");
				int idx = sc.nextInt();
				System.out.println(ca.get(idx));
				break;
			case 4:
				System.out.print("�̸� �Է� : ");
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

package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	/*
	 * �ǽ� ���� 1)
	 * �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ "OO�޴��Դϴ�"�� ����ϰ�,
	 * ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���.
	 * 
 	  	ex.
 		1. �Է�
 		2. ����
 		3. ��ȸ
 		4. ����
 		7. ����
 		�޴���ȣ�� �Է��ϼ��� 3
 		��ȸ �޴��Դϴ�
	 */
	public void practice1() {
		// Ctrl + spacs ����Ű : �ڵ����� import ����
		Scanner sc = new Scanner(System.in);
		// �޴��� ȭ�鿡 ���
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		// "�޴��� �Է��ϼ��� : " ȭ�鿡 ����ϰ�, ����ڷκ��� �޴� ��ȣ �Է� �ޱ�
		System.out.print("�޴���ȣ�� �Է��ϼ��� : ");
		int selMenu = sc.nextInt();
		switch(selMenu) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 7:
			System.out.println("���α׷��� �����մϴ�.");
			break;
		default:
			System.out.println("�ش� �޴��� �����ϴ�.");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("¦����");
		} else if(num%2 == 1) {
			System.out.println("Ȧ����");
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();

		int total = kor + math + eng;
		double avg = total/3;
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + total);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}	
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();		
		switch(month) {
		case 1 :
			System.out.println(month + "���� �ܿ��Դϴ�");
			break;
		case 2 :
			System.out.println(month + "���� �ܿ��Դϴ�");
			break;
		case 3 :
			System.out.println(month + "���� ���Դϴ�");
			break;
		case 4 :
			System.out.println(month + "���� ���Դϴ�");
			break;
		case 5 :
			System.out.println(month + "���� ���Դϴ�");
			break;
		case 6 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 7 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 8 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 9 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 10 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 11 :
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 12 :
			System.out.println(month + "���� �ܿ��Դϴ�");
			break;
		default:
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�");
		}
	}
	public void practice5() {
		// ���̵� : user01, ��й�ȣ: 1234qwer!!
		String id = "user01";
		String pw = "1234qwer!!";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String inputPw = sc.nextLine();
		
		// �α׸� ������
		if (inputId.equals(id) // equals: inputId ���� id ���� ������
				&& inputPw.equals(pw)) {
			// (+) ��й�ȣ : �ּ� 6�ڸ� �̻�, �빮�� + �ҹ��� + Ư������
			System.out.println("�α��� ����!");
		} else if (!inputId.equals(id)) {
			// id: user01, inputId: qqqq | inputId.equals(id) => false
			//						!(inputId.equals(id)) -> !false -> true
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String Account = sc.nextLine();
		switch(Account) {
		case "������":
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, ���ñ� ��ȸ");
			break;
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default:
			System.out.println("����");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double m = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double kg = sc.nextDouble();
		double BMI = kg / (m * m);
		System.out.println("BMI ���� : " + BMI);
		if(BMI < 18.5) {
			System.out.println("��ü��");
		} else if (BMI >= 18.5 || BMI < 23) {
			System.out.println("����ü��");
		} else if (BMI >= 23 || BMI < 25) {
			System.out.println("��ü��");
		} else if (BMI >= 25 || BMI < 30) {
			System.out.println("��");
		} else if (BMI >= 30) {
			System.out.println("���� ��");
		} else {
			System.out.println("����");
		}
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String sp = sc.next();
		if(sp == "+") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1+num2));
		} else if(sp == "-") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1-num2));
		} else if(sp == "*") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1*num2));
		} else if(sp == "/") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1/num2));
		} else if(sp == "%") {
			System.out.println(num1+" "+sp+" "+num2+" = "+(num1%num2));
		} else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.���α׷��� �����մϴ�.");
			
		}
	}
}

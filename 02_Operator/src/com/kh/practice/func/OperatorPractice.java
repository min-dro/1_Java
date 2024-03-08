package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "�����" : "����� �ƴϴ�"); 
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "�����" : num == 0 ? "0�̴�" : "������");
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.println(num%2 == 0 ? "¦����" : "Ȧ����");
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� : ");
		int human = sc.nextInt();
		System.out.print("���� ���� : ");
		int canddy = sc.nextInt();
		System.out.println("1�δ� ���� ���� : " + canddy/human);
		System.out.println("���� ���� ���� : " + canddy%human);
	}
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int class_ = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� �Ѥ��ڸ� ����) : ");
		double avg = sc.nextDouble();
		String human = (gender == 'M')  ? "���л�" : "���л�";
		System.out.println(grade+"�г� "+class_+"�� "+num+"�� "+name+" "+human+"�� ������ "+avg+"�̴�.");
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println(age <= 13 ? "\n���" :  age > 13 && age <= 19 ? "\nû�ҳ�" : "\n����");
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		int total = kor + math + eng;
		double avg = total/3;
		System.out.println(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ? "\n�հ� : 180\n��� : 60.0\n�հ�" : "���հ�");
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ָ���ȣ�� �Է��ϼ���(- ����) : ");
		String num = sc.nextLine();
		System.out.println(num.charAt(7)%2 == 0 ? "\n����" : "\n����");
	}
	public void practice9() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num = sc.nextInt();
		System.out.println(num <= num1 || num > num2 ? "\ntrue" : "\nfalse");	
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		System.out.println(num1 == num2 && num2 == num3 && num1 == num3 ? "\ntrue" : "\nfalse");
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int A = sc.nextInt();
		System.out.print("B����� ���� : ");
		int B = sc.nextInt();
		System.out.print("C����� ���� : ");
		int C = sc.nextInt();
		System.out.println("\nA����� ����/����+a : " + A + "/" + A*1.4);
		System.out.println(A*1.4 >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("B����� ����/����+a : " + B + "/" + B*1.0);
		System.out.println(B >= 3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("C����� ����/����+a : " + C + "/" + C*1.15);
		System.out.println(C*1.15 >= 3000 ? "3000 �̻�" : "3000 �̸�");
	}
}


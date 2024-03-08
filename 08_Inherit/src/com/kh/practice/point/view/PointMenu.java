package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;
import com.kh.practice.point.model.vo.Rectangle;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	public void mainMenu() {
		do {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ :");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("�����մϴ�");
				return;
			}
			
			// select ���� 1, 2, 9�� �ƴѰ�� �Լ� �ݺ����� ����
		} while(true);
	}
	// �� �޴� ���. �߸� �Է����� �� ���θ޴��� ���ư�
	public void circleMenu() {
		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		// sysout �Է��� Ctrl + Space : System.out.println
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
			case 9:
			}
		}
	// �簢�� �޴� ���. �߸� �Է����� �� ���θ޴��� ���ư� 
	public void rectangleMenu() {
		System.out.println("===== �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.println("�޴� ��ȣ : ");
		
		int select = sc.nextInt();
		switch(select) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
		case 9:
		}
	}
	// x, y ��ǥ�� �������� �޾� ���� ������ �� �ѷ� ���
	public void calcCircum() {
		// x��ǥ, y��ǥ, �������� ���� �Է¹޾�
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		
		System.out.println("������ : ");
		int r = sc.nextInt();
		
		// CircleController �� calcCircum() �޼ҵ带 ȣ��
		//	- �Է¹��� x, y, �������� ���� �����Ͽ� ȣ�� calcCircum(x, y, r)
		String result = cc.calcCircum(x, y, r);
		
		// �� ��� ���� ���
		//	�޼ҵ� ȣ�� �� ��� ���� ���ڿ� ��ü�� ó�� ����
		//	������ ������ ���� �ְ�, printf���� ���þ�� %s�� ����� �� �ִ�.
//		String result = cc.calcCircum(x, y, r);
//		System.out.println(result);
		
	}
	// x, y ��ǥ�� �������� �޾� ���� ������ �� ���� ���
	public void calcCircleArea() {
		// x��ǥ, y��ǥ, �������� �Է¹޾�
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		
		System.out.println("������ : ");
		int r = sc.nextInt();
		
		// CircleController�� calcArea �޼ҵ带 ȣ��
		//	- �Է¹��� ���� �Ű������� ���
	}
	// x, y ��ǥ�� ����, �ʺ� �Է¹޾� �簢���� ������ �ѷ� ���
	public void calcPerimeter() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		
		System.out.println("���� : ");
		int h = sc.nextInt();
		
		System.out.println("�ʺ� : ");
		int w = sc.nextInt();
		
		// RectangleController �� calcPerimeter �޼ҵ� ȣ�� ��
		//	�� ����� ���
		String result = rc.calcPerimeter(x, y, h, w);
		System.out.println(result);
	}
	// x, y ��ǥ�� ����, �ʺ� �Է¹޾� �簢���� ������ ���� ���
	public void calcRectArea() {
		System.out.println("x ��ǥ : ");
		int x = sc.nextInt();
		
		System.out.println("y ��ǥ : ");
		int y = sc.nextInt();
		
		System.out.println("���� : ");
		int h = sc.nextInt();
		
		System.out.println("�ʺ� : ");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, h, w));
	}
}

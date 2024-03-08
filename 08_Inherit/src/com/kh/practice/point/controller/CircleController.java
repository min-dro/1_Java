package com.kh.practice.point.controller;

// Ctrl + shift + o : import �ڵ��ϼ�
import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	// �ʵ��
	private Circle c = new Circle();
	
	// �����ں� : ���� �������� ���� => �⺻ �����ڸ� ���
	
	// �޼ҵ��
	public String calcArea(int x, int y, int radius) {
		// �Ű������� ���޹��� ���� �ʱ�ȭ
		c = new Circle(x, y, radius);
		// ������ ���� ���
		//	����: PI * ������ * ������
		double area = Math.PI * radius * radius;
		
		// �ʱ�ȭ�� ������ ���� ������ ���ڿ��� ����� ��ȯ
		//	- c.toString() �޼ҵ带 ���� �ʱ�ȭ�� ����(x, y, radius)
		//	- area�� ���� ����� �Ͽ� ������ ����
		return " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		// �Ű������� ���޹��� ���� �ʱ�ȭ
		c = new Circle(x, y, radius);
		
		// �ѷ��� ���� ���
		//	�ѷ� : PI * ������ * 2
		double circum = Math.PI * radius * 2;
		
		// �ʱ�ȭ�� ���� �ѷ��� ���� ���ڿ��� ��ȯ
//		return String.format("%s / %f", c.toString(), circum;
		return c.toString() + " / " + circum;
		
	}
}

package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	// �ʵ�� (1)
	private Rectangle r = new Rectangle();
	
	// �����ں� (0) : �⺻ �����ڸ� ���
	
	// �޼ҵ�� (2)
	public String calcArea(int x, int y, int height, int width) {
		// �Ű������� ���� ���� set�޼ҵ带 ����Ͽ� �ʱ�ȭ
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// ���� ���
		//	���� : �ʺ� * ����
		int area = width * height;
		
		// �ʱ�ȭ�� ������ ������ ����� ��ȯ
		return "���� : " + r.toString() + " / " + area;
		
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		// �Ű������� ���޹��� ���� �ʱ�ȭ
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// �ѷ� ���
		//	�ѷ� : 2 * (�ʺ� + ����)
		int perimeter = (width + height) * 2;
		return "�ѷ� : " + r.toString() + " / " + perimeter;
	}
}

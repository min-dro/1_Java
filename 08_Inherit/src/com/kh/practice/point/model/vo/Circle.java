package com.kh.practice.point.model.vo;

public class Circle extends Point {
	// �ʵ��
	private int radius;
	
	// �����ں�
	public Circle() {}
	public Circle(int x, int y, int radius) {
		// x �� y ���� ��� �ʱ�ȭ? �θ�Ŭ������ �����ڸ� �������.
		super(x, y);			//�θ�Ŭ������ ������ ȣ���Ͽ� �ʱ�ȭ
		this.radius = radius;
	}
	
	// �޼ҵ��
	public int getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// �ʵ忡 ��� �޼ҵ� ��ȯ�ϴ� �޼ҵ�
		//	�ʵ� : (3) x, y, radius
		return super.toString() + "" + radius;
	}
}

package com.kh.practice.point.model.vo;

// Point Ŭ�����κ��� ����� ���� (extends)
public class Rectangle extends Point {
	// �ʵ��
	private int width;
	private int height;
	
	// �����ں�
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		// �ʵ��� ���� ���ڿ��� ��ȯ
		//	* super.toString() : �θ� Ŭ����(Point)
		return String.format("%s %d %d", super.toString(), width, height);
	}
}

package com.kh.practice.point.model.vo;

public class Point {
	// �ʵ��
	private int x;
	private int y;
	
	// �����ں�
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �޼ҵ��
	//	getter/setter : private ����
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
//		return x + " " + y;
		return String.format("%d %d", x, y);
	}
}

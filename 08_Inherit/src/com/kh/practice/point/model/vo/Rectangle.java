package com.kh.practice.point.model.vo;

// Point 클래스로부터 상속을 받음 (extends)
public class Rectangle extends Point {
	// 필드부
	private int width;
	private int height;
	
	// 생성자부
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
		// 필드의 값을 문자열로 반환
		//	* super.toString() : 부모 클래스(Point)
		return String.format("%s %d %d", super.toString(), width, height);
	}
}

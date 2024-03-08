package com.kh.practice.point.model.vo;

public class Circle extends Point {
	// 필드부
	private int radius;
	
	// 생성자부
	public Circle() {}
	public Circle(int x, int y, int radius) {
		// x 와 y 값을 어떻게 초기화? 부모클래스의 생성자를 사용하자.
		super(x, y);			//부모클래스의 생성자 호출하여 초기화
		this.radius = radius;
	}
	
	// 메소드부
	public int getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// 필드에 담긴 메소드 반환하는 메소드
		//	필드 : (3) x, y, radius
		return super.toString() + "" + radius;
	}
}

package com.kh.inherit;

// Parent : 부모 역할 클래스
public class Parent {
	// 필드부
	private int x;			 // 접근 제안을 private으로 정의하는 이유? 클래스 외부에서 직접 접근을 막기 위해
	private int y;			 //									중요헌 정보를 맘대로 바꾸지 못하기 위해
	
	// 생성자부
	public Parent() {}		 // 기본 생성자 : 매개변수가 없고, 초기화하는 직업 없다.
							 // 
	
	public Parent(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	// 메소드부
	//	- private 맴버 변수의 경우 getter/setter 메소드로 캡슐화 작업을 해야함
	//							매개변수는 없음

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
	// 메시지를 출력하는 메소드
	public void printMsg() {
		System.out.println("안녕 나는 부모클래스야.");
	}
}

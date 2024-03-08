package com.kh.practice.point.controller;

// Ctrl + shift + o : import 자동완성
import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	// 필드부
	private Circle c = new Circle();
	
	// 생성자부 : 따로 정의하지 않음 => 기본 생성자만 사용
	
	// 메소드부
	public String calcArea(int x, int y, int radius) {
		// 매개변수로 전달받은 값을 초기화
		c = new Circle(x, y, radius);
		// 면적의 값을 계산
		//	면적: PI * 반지름 * 반지름
		double area = Math.PI * radius * radius;
		
		// 초기화한 정보와 면적 정보를 문자열로 결과를 반환
		//	- c.toString() 메소드를 통해 초기화한 정보(x, y, radius)
		//	- area는 면적 계산을 하여 저장한 변수
		return " / " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 매개변수로 전달받은 값을 초기화
		c = new Circle(x, y, radius);
		
		// 둘레의 값을 계산
		//	둘레 : PI * 반지음 * 2
		double circum = Math.PI * radius * 2;
		
		// 초기화한 값과 둘레의 값을 문자열로 반환
//		return String.format("%s / %f", c.toString(), circum;
		return c.toString() + " / " + circum;
		
	}
}

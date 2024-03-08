package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	// 필드부 (1)
	private Rectangle r = new Rectangle();
	
	// 생성자부 (0) : 기본 생성자만 사용
	
	// 메소드부 (2)
	public String calcArea(int x, int y, int height, int width) {
		// 매개변수로 받은 값을 set메소드를 사용하여 초기화
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 면적 계산
		//	면적 : 너비 * 높이
		int area = width * height;
		
		// 초기화한 정보와 면적을 결과로 반환
		return "면적 : " + r.toString() + " / " + area;
		
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		// 매개변수로 전달받은 값을 초기화
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 둘레 계산
		//	둘레 : 2 * (너비 + 높이)
		int perimeter = (width + height) * 2;
		return "둘레 : " + r.toString() + " / " + perimeter;
	}
}

package com.kh.practice.numRange.exception;

// 예외클래스 : <<exception>>
//	[1] Exception 클래스 상속 (필수)
//			-> Exception: 자바에서 제공하는 기본 클래스
//	[2] 생성자 정의 : 매개변수  1개(문자열
public class NumRangeException extends Exception {
	public NumRangeException() {}
	
	public NumRangeException(String msg) {
		super(msg);
	}
}

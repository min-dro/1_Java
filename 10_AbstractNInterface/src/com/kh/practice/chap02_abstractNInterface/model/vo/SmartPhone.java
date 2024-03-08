package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	// 필드부 (변수/필드/맴버 변수)
	private String maker;		// 제조사 정보
	
	// 생성자부
	public SmartPhone() {}
	
	// 메소드부
	public abstract String printInformation();	// 추상메소드
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
}

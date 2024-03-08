package com.kh.generic.practice1;

// Material 클래스 상속
public class Powder extends Material {
	
	// Material 추상클래스 내 추상메소드 오버라이딩
	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Power 재료 출력");
	}

	// Object 클래스 내 toString 메소드 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료 : Powder";
	}
	
}

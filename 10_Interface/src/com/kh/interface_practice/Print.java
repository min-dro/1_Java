package com.kh.interface_practice;

// 추상클래스 Print
// : 미완성 클래스(설꼐도) -> 추상 메소드를 포함하고 있음 (아닌 경우도 있을 수 있다, - abstract 키워드만 사용)
public abstract class Print implements Printable{
	
	// 메소드
	//	colorPrint() 추상메소드
	//	* 표현번 : [접근제한자] abstract 반환타입 메소드명(매개변수]);
//	public abstract void colorPrint();
	public abstract void colorPrint();
	
	protected abstract void printTest();
	
	abstract void printTest2();				// 접근제한자를 de
	
	// 일반적인 메소드도 가능
	public void printTest3() {
		
		System.out.println("프린트 테스트 중...");
	}

	// 일반적인 메소드도 
}

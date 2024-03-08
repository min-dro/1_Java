package com.kh.abstract_10;

abstract class Printer {
	// -ERROR:int=-999_999_999 (밑줄)
	private static final int ERROR = 999_999_999;
	// ERROR 필드의 getter/setter
	public int getError() {
		return ERROR;
	}
	// setter...? : 전달받은 값으로 필드의 값을 대입(변경)
	//	ERROR 필드는 상수로 setter 사용 불가
	
	// +colorPrint(rgb:int):void (기울임)
	public abstract void colorPrint(int rgb);
}

class LGPrinter extends Printer{
	@Override
	public void colorPrint(int rgb) {
		System.out.println(rgb + "으로 ");
	}
}

public class AbstractPractice {
	/*
	 * 추상 (abstract) : 미완성, 완선하지 않은 상태
	 *  - 추상 클래스 => 인스턴스 생성 할 수 없음!
	 *  	[표현식]
	 *  			[접근제한자] abstract class 클래스명 { }
	 *  
	 *  - 추상 메소드
	 *  	[표현식]
	 *  			[접근제한자] 반환타입 메소드명([매개변수]); // 추상 메소드의 끝은 세미콜론(;);
	 */
	
	public static void main(String[] args) {
//		
		Printer printer2 = new LGPrinter();
		printer2.colorPrint(666);				// 실행 시 결과는?
										// 동적 바인딩 (Dynamic Binding)
										// 다형성이 적용된 참조변수에서 메소드 실행 시 자식클래스에서 재정의된 메소드가 실행되는 특징
	}
}

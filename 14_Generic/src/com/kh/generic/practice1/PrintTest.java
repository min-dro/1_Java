package com.kh.generic.practice1;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ThreeDPrinrter 객체 생성
		ThreeDPrinter tdp = new ThreeDPrinter();	// L) ThreeDPrinter 타입의 참조변수 선언
													// R) ThreeDPrinter 인스턴스 생성 (메모리에 할당)
		
		// Powder 객체 생성
		Powder pow = new Powder();
		// ThreeDPrinter 내 setMaterial 메소드를 사용하여 Powder 객체를 저장
		tdp.setMaterial(pow);		// ==> tdp.setMaterial(new Powder());
									// setMaterial(new Powder());
									// 메소드 호출 시 전달한 데이터 타입 : Powder
									// ==> 업캐스팅 (부모클래스 타입의 참조변수는 자식클래스의 인스턴스를 가리킬 수 있음)
		
		
		// 또다른 Powder 객체에 ThreeDPrinter 에 저장한 material 데이터를 꺼내서 저장
		Powder pow2 = (Powder) tdp.getMaterial();	// getMaterial 메소드 반환타입 : Object
													// 결과를 저장하는 변수 타입 : Powder
													// ==> 다운캐스팅. 부모클래스 타입에서 자식클래스 타입으로 형변환 필요.

		
		// (+) ThreeDPrinter 제너릭 적용한 상태 => ThreeDPrinterG 클래스 정의
		//	   위와 동일하게 Powder 객체를 저장한 후 다시 꺼내어 다른 Powder 객체 저장
		
		// ThreeDPrinterG<Powder> 객체 생성
		ThreeDPrinterG<Powder> tdpG = new ThreeDPrinterG<>();	// 같은 타입으로 인스턴스 생성 시 생성자 부분에 타입은 생략 가능.
		Powder pow3 = new Powder();
		
		tdpG.setMaterial(pow3);
//		tdpG.setMaterial(new String("Powder"));	// 왜 오류가 날까? 객체 생성 시 타입 매개변수가 Powder로 생성되었기 떄문에
												//				다른 타입의 인스턴스는 전달할 수 없음.
		
		Powder pow4 = tdpG.getMaterial();		// 왜 형변환이 필요 없을까? 위와 동일. getMaterial() 메소드의 반환타입이 Powder 적용되기 떄문에
		
	}
}

package com.kh.generic.practice1;

// 제네틱 클래스
public class ThreeDPrinterG<T> {	// <T> : 타입매개변수
		// 필드
		//  어떤 클래스의 타입이든 인스턴스 생성
		private T material;		// T: 타입매개변수

		// getter/setter
		public T getMaterial() {
			return material;
		}

		public void setMaterial(T material) {
			this.material = material;
		};
		
}

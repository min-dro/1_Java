package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;
public class PhoneController {
	// 필드부(변수/필드/맴버변수)
	private String[] result = new String[2];
	
	// 생성자부: 없음 => 기본생성자(public Phonecontroller() {})가 자동으로 생성
	
	// 메소드부
	public String[] method() {
		Phone[] phArr = new Phone[2];
		
		phArr[0] = new GalaxyNote9();	// 배열의 첫번째 위치에
										// GalaxyNote9 클래스로 객체 생성
		phArr[1] = new V40();			// 배열의 두번째 위치에
										// V40 클래스로 객체 생성
		
		for(int i=0; i<phArr.length; i++) {
			int rIndex = 0;
			// instanceof : i번째에 위치에 있는 참조변수가 어떤 객체를 참조하고 있는지 확인
			//					  어떤 객체를 참조하고 있는지 확인
			if(phArr[i] instanceof GalaxyNote9) {
				result[rIndex] = ((GalaxyNote9)phArr[i]).printInformation();
				rIndex++;
				// (GalaxyNote9(phArr[i]))가 V40 클래스 객체를 참조변수를 GalaxyNote9 클래스 타입으로 형 변환(다운캐스팅)
			} else if(phArr[i] instanceof V40) {
				// i번째의 위치의 참조변수(phArr[i])
				result[rIndex] = ((V40)phArr[i]).printInformation();
			}
		}
		return result;
	}
}

package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	// 생성자
	public NumberController() {}
	
	// 매소드
	public boolean checkDouble(int num1, int num2)
		throws NumRangeException{
		
		
		// 범위에 해당하는 조건식 : 모든 조건식이 true여야 조건식 결과 true
		/*****
		if ((1 <= num1 && num1 <= 100 ) && (1 <= num2 && num2 <= 100)) {
			return num1 % num2 == 0;
		}
		
		throw new NumRangeException("1부터 100 사이의 값이 아닙니다.")
		*****/
		// 범위를 벗어난 조건식 :: 하나라도 true면 조건식 결과 true
				if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
					// 오류 장생 시켜야함!
					throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
				}
		// num1이 num2의 배수인지  : 나머지 연산자(%)
		// 아니면 배수가 아님.
		//
		
		boolean result = (num1 % num2 == 0);
		return result;
		
	}
}

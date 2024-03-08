package com.kh.example;

public class Caculator implements Calc {
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	// 뺴기 연산 기능: substract
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	// 곱하기 연산 기능: times
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	// 나누기 연산 기능: divide
	//		- 두번째 매개변수가 0이면 ERROR 반환
	@Override
	public int divide(int num1, int num2) {
		if (num2 == 0) {
			return ERROR;
		} else {
			return num1 / num2;
		}
	}
}

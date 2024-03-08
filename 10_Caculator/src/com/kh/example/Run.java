package com.kh.example;

public class Run {
	
	public static void main(String[] args) {
		
		Caculator calc = new Caculator();
		
		int num1 = 10;
		int num2 = 50;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("더하기 결과: " + calc.add(num1, num2));
		System.out.println("뻬기 결과: " + calc.substract(num1, num2));
		System.out.println("곱하기 결과: " + calc.times(num1, num2));
		System.out.println("나누기 결과: " + calc.divide(num1, num2));
		
		System.out.println("나누기 결과 (10, 0) : " + calc.divide(num1, 0));
	}
}

package com.kh.example;

public class Run {
	
	public static void main(String[] args) {
		
		Caculator calc = new Caculator();
		
		int num1 = 10;
		int num2 = 50;
		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("���ϱ� ���: " + calc.add(num1, num2));
		System.out.println("���� ���: " + calc.substract(num1, num2));
		System.out.println("���ϱ� ���: " + calc.times(num1, num2));
		System.out.println("������ ���: " + calc.divide(num1, num2));
		
		System.out.println("������ ��� (10, 0) : " + calc.divide(num1, 0));
	}
}

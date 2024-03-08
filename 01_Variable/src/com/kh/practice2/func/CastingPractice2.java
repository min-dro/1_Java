package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void Practice() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		System.out.print("���� : "); 
		double eng = sc.nextDouble();
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		System.out.println("");
		System.out.println("���� : " + (int)(kor + eng + math));
		System.out.println("��� : " + (int)((kor + eng + math) / 3));
	}
}

package com.kh.practice.numRange.view;

import java.util.Scanner;
import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	// 메소드
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		// 정수 2개 입력 받기
		System.out.print("정수1 : ");		// 콘술창에 출력하기
		int num1 = sc.nextInt();		// 사용자로부터 입력받기
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		try {
			boolean result = nc.checkDouble(num1, num2);
			System.out.printf("%d은(는) %d의 배수인가 ? %b\n", num1, num2, result);
		} catch(NumRangeException e) {
			// printStackTrace() : 예의 발생 위치와 호출된 메소드 정보 출력
			// 	* Throwable 클래스로 부터 상속받음 (Throwable: Exception 클래스 상속중..)
			e.printStackTrace();
		}
	}
}

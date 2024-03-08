package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void Practice() {
		/*
		 이름, 성별, 나이, 키를
		 성별을 입력하세요(남/여) : 남
		 나이를 입력하세요
 		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		// "홍길동", "아이유", "성시경"
		String name = sc.nextLine();	// nextLine : 문자열을 입력받는 메소드
		System.out.print("성별을 입력하세요(남/여) : ");
		// '남', '여'
		// "남자" -> '남', '자'
		// "남", "여" -> '남', '여'
		String strGender = sc.next(); //next : 문자열을 입력받는 메소드. 공백 전까지.
		char gender = strGender.charAt(0); // charAt(index) : 문자열에서 index 위치의 값을 
		//sc.next().charAt(0);
		// "안녕 하세요" 
		// nextLine : "안녕 하세요"
		// next		: "안녕"
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		/*
		 	키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		 */
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^ \n",
							height, age, gender, name);
	}
}

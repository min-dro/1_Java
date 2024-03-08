package com.kh.practice;

import java.util.StringTokenizer;		// java.util. 경로에

public class StringTokenizerTest {

	public static void main(String[] args) {
		// 문자열(String) 관련 메소드
		//	- String.format("문자열 ")
		//	- 문자열.charAt(index)
		//	- 문자열.length()
		//	- 문자열.equals(문자열A)
		
		String str = "  Hello  ";
		
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("el"));
		
		System.out.println(str.repeat(5));	// repeat(count) : count만큼 반복
		
		System.out.println(str.replace("ll", "p"));	//replave([old], [new]) : old에 해당하는 값을                         
		System.out.println(str.substring(3));
		System.out.println(str.toLowerCase());
	} 
	public void test2() {
		// key : name, phone, address, email
				//  - key에 해당하는 값과 value에 해당하는 값을 (:)로 구분
				//  - 각 정보는 (,)로 구분
				String data = "name:Hong, phone:010-1234-5678, address: gangnam, email: hong12@gmail.com";
				
				// StringTokenizer 를 사용하여 아래 내용을 출력
				//  이름은 Hong이고, 연락처는 010-1234-5678이고, 주소는 gangnam이고, 이메일은 hong12@gmail.com 입니다.
				//		  %s				  %s				  %s					%s
				
				
				int index =0 ;
				// (1) (,)로 구분하여 토큰화
				StringTokenizer st = new StringTokenizer(data, ",");
				
				while(st.hasMoreTokens()) {
					String keyValue = st.nextToken();		// , 기준으로 토큰화하여 문자열을 저장
					System.out.print(keyValue);
					
					// (2) (:)으로 구분하여 토큰화
					StringTokenizer st2 = new StringTokenizer(keyValue, ":");
					
				}
//				System.out.printf("이름은 %s이고, 연락처는 %s이고, 주소는 %s이고, 이메일은 %sd 입니다.", args);
	}
	public void test() {
		// StringTokenizer : 문자열 내에 특정 구분자로 나눠주는 클래스(토큰화)
		
				String msg = "안녕하세요|나는누구입니다|반갑습니다"; // 특정 구분자 : |
				
				String[] arr = new String[3];
				int i = 0;
				
				StringTokenizer st = new StringTokenizer(msg, "|");
				
				// 변수명.hashMoreTokens() : 구분자를 통해 토큰화할 수 있는 지 확인하는 메소드
				//							true/false : true(토큰화 가능) false(토큰화 불가)
				
				while(st.hasMoreTokens()) { // 토큰화가 가능하다면 계속 반복문을 실행한다.
					
					// 변수명.nextToken(): 구분자 기준으로 값을 분리해서 반환하는 메소드
					//					 값을 반환하고 다음 구분자 위치로 이동
					// System.out.println(st.nextToken());
					arr[i] = st.nextToken();
					System.out.println(arr[i]);
					i++;
					
		}
	}
}

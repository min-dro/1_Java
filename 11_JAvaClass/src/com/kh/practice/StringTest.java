package com.kh.practice;

public class StringTest {
	
	public static void main(String[] args) {
		// String 클래스 : 문자열 값이 변하지 않는다. (=> 값이 변경되면 메모리에 새로운 공간 할당)\
		
		String str1 = "apple";
		String str2 = "apple";
		
		// str1 == str2 : 문자열 값을 비교하는게 아니라, str1과 str2가 저장한 주소값을 비교
		System.out.println(str1 == str2);		// 경과? true
												// 문자열 값 자체를 대입하면 상수풀이라는 공간에 값이 저장되어
												// 같은 곳을 가리키게됨 (주소값이 통일)
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		System.out.println(str3 == str4);		// 결과? false
												// 문자열 객체를 생성해서 값을 대입하면 메모리에 새로운 영역을 할당하므로
												// 각각 할당된 영역을 가리키게됨 (주소값이 다름)
		
		System.out.println(str3 == "apple");	// 결과? false
												// str3가 가리키는 주소와 "apple" 값 자체가 저장된 주소룰 비교
												// str3는 새로운 메모리 공간 할당 후 "apple" 값을 저장
												// "apple" 값 자체는 상수풀에 저장이 되어 서로 다른 곳울 가리킴(주소값이 다름)
		
		// (문자열 변수나 값).equals(문자열 변수나 값) => true/false : true(동일), false(다름)
		System.out.println(str3.equals("apple"));	// 결과? true
													// .equals() 메소드를 사용하여 값
		System.out.println("========================================");
		
		String str5 = "Hello";
		String str6 = "World";
		System.out.println(str5);		// 문자열 변수 출력: Hello
										// 출력함수에 객체타입의 변수 입력 시 => 변수.toString()
		System.out.println(str5.toString());	// String 클래스에서 toString 메소드가 오버라이딩됨
		
		// System.identityHashCode(변수명) : System 클래스 내 해쉬값(주소값)을 확인하는 메소드
		int hash = System.identityHashCode(str5);	// str5 변수의 해쉬값(주소값)
		System.out.println("변경 후");
	}
	
}

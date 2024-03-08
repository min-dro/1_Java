package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	
	// 메소드부
	public static void main(String[] args) {
		 // Member 클래스 선언 및 인스턴스 선언
		Member m = new Member(); // 기본생성자: 클래스명();
		// changeName()을 이용햐 값을 변경
		m.changeName("지민석");
		// printName()을 이용해 출력
		m.printName();
		
		Member m2 = new Member();
		m2.changeName("홍길동");
		m2.printName();
	}
}

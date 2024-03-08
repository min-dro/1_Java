package com.kh.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//import java.util.Date;
import java.time.format.DateTimeFormatter;


public class DateTest {
	public static void main(String[] args) {
		// Date 클래스를 사용해서 생일 정보를 출력.
		// - Date 객체 생성
		/*
		Date date = new Date(); // 생성자...
		date = new Date(2000, 01, 05);
		System.out.println(date.getMonth() + "/" + date.getDate());
		*/
		// LocalDateTime 클래스
		//	 - 년,월,일 입력하여 생성		: LocalDateTime.of(LocalDate.of(int year, int month, int dayOfMonth),
		//												LocalTime.of(int hour, int minute))
		//	 - 현재 날짜시간 기준으로 생성: LocalDateTime.now()
		
		// [ 날짜 정보 조회 ]
		//	 - 월(month) : 변수명.getMonthValue() // 숫자로 뭘 정보를 반환
		//				   변수명.getMonth()		// 영어로 월 정보를 반환
		//	 - 일(day)	: 변수명.getDayOfMonth() // 월 기준 일 정보 반환 
		//				  변수명.getDay
		
		LocalDateTime datetime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(datetime.getMonth());
		
		System.out.println(datetime.getMonth() + "/" + datetime.getDayOfMonth());
		// 생일 출력..
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(2000 ,1, 5), LocalTime.of(0, 0));
		
		// DateTimeFormatter
		//	DateTimeFormatter.ofPattern(포맷) : 날짜 정보의 포앳(형식) 정의
		//	- YYYY-MM-DD hh:mm:ss
		//	- YYYY/MM/DD hh:mm:ss
		//	- import java.time.format.DateTimeFormatter;
		System.out.println( birth.format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss")) );
		
		
		// 올해 며칠남았는지..
		System.out.println(365 - datetime.getDayOfYear());
		
		// 오늘..  퇴근까지...
		System.out.println(18 - datetime.getHour() + "시간 남았습니다..");
		
	}
}

package com.kh.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//import java.util.Date;
import java.time.format.DateTimeFormatter;


public class DateTest {
	public static void main(String[] args) {
		// Date Ŭ������ ����ؼ� ���� ������ ���.
		// - Date ��ü ����
		/*
		Date date = new Date(); // ������...
		date = new Date(2000, 01, 05);
		System.out.println(date.getMonth() + "/" + date.getDate());
		*/
		// LocalDateTime Ŭ����
		//	 - ��,��,�� �Է��Ͽ� ����		: LocalDateTime.of(LocalDate.of(int year, int month, int dayOfMonth),
		//												LocalTime.of(int hour, int minute))
		//	 - ���� ��¥�ð� �������� ����: LocalDateTime.now()
		
		// [ ��¥ ���� ��ȸ ]
		//	 - ��(month) : ������.getMonthValue() // ���ڷ� �� ������ ��ȯ
		//				   ������.getMonth()		// ����� �� ������ ��ȯ
		//	 - ��(day)	: ������.getDayOfMonth() // �� ���� �� ���� ��ȯ 
		//				  ������.getDay
		
		LocalDateTime datetime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(datetime.getMonth());
		
		System.out.println(datetime.getMonth() + "/" + datetime.getDayOfMonth());
		// ���� ���..
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(2000 ,1, 5), LocalTime.of(0, 0));
		
		// DateTimeFormatter
		//	DateTimeFormatter.ofPattern(����) : ��¥ ������ ����(����) ����
		//	- YYYY-MM-DD hh:mm:ss
		//	- YYYY/MM/DD hh:mm:ss
		//	- import java.time.format.DateTimeFormatter;
		System.out.println( birth.format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss")) );
		
		
		// ���� ��ĥ���Ҵ���..
		System.out.println(365 - datetime.getDayOfYear());
		
		// ����..  ��ٱ���...
		System.out.println(18 - datetime.getHour() + "�ð� ���ҽ��ϴ�..");
		
	}
}

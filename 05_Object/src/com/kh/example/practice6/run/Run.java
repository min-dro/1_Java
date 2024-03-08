package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		
		Book[] bArr = new Book[3];
		/* 객체배열을 선언 및 할당 후
		 	
		 */
		/*		
		Book b1 = new Book();
		Book b2 = new Book("자바 프로그래밍 입문", "이지스 퍼블리싱", "작은종");
		String title = "객체 지향의 사실과 오해";
		String publisher = "위키북스";
		String author = "조영호";
		int price = 20_000;	// 20,000
		double discountRate = 10.0;
		Book b3 = new Book(title, publisher, author, price, discountRate);
		b1.inform();
		b2.inform();
		b3.inform();
		 */
	}
}

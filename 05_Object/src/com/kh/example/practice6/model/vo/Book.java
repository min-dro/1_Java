package com.kh.example.practice6.model.vo;

public class Book {
	// 링드부 (변수 : 5)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성자부 (3) : 오버로딩
	// 기본 생성자
	public Book() {
		
	}
	// 매개변수 3개를 받는 생성자
	public Book(String title, String publisher, String author) {
		// 전달받은 값으로 초기화
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	// 매개변수 5개를 받는 생성자
	public Book(String title, String publisher, String author, int price, double discountRate) {
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		// this([매개변수])
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.printf("%s %s %s %d %f\n", title, publisher, author, price, discountRate);
	}
}

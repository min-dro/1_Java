package com.kh.example.practice6.model.vo;

public class Book {
	// ����� (���� : 5)
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	// �����ں� (3) : �����ε�
	// �⺻ ������
	public Book() {
		
	}
	// �Ű����� 3���� �޴� ������
	public Book(String title, String publisher, String author) {
		// ���޹��� ������ �ʱ�ȭ
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	// �Ű����� 5���� �޴� ������
	public Book(String title, String publisher, String author, int price, double discountRate) {
//		this.title = title;
//		this.publisher = publisher;
//		this.author = author;
		// this([�Ű�����])
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	public void inform() {
		System.out.printf("%s %s %s %d %f\n", title, publisher, author, price, discountRate);
	}
}

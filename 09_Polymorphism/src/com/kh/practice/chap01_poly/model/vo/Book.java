package com.kh.practice.chap01_poly.model.vo;

//�θ� Ŭ����
// å ��ü
public class Book {
	// �ʵ�� (3)
	private String title;		// ������
	private String author;		// ���ڸ�
	private String publisher;	// ���ǻ�
	
	// ������ (2) : �⺻������, �Ű����� 3���� �޴� ������(title, author, publisher)
	public Book() {}
	
	public Book(String title, String author, String publisher) {
		this.title = title;				// ������
		this.author = author;			// ���ڸ�
		this.publisher = publisher;		// ���ǻ�
	}
	public String toString() {
		return String.format("=%s / %s / %s", title, author, publisher);
	}
	
}

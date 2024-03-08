package com.kh.practice.chap01_poly.model.vo;

// Book Ŭ������ ��ӹ���
public class AniBook extends Book {
	// �ɹ� ����: (3)
	private int accessAge;		// ���� ����
	
	// ������: (0) + (2) = (2)
	// - �⺻ ������, �Ű������� 4���� ������(title, author, publisher, accessAge)
	public AniBook() {}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	// �޼ҵ�: (1) - toString() �޼ҵ� �������̵�
	//				�θ�Ŭ������ �ɹ����� ������ ����Ŭ����(AniBook)�� �ɹ����� ������ ��� ���ڿ� ��ȯ
	@Override
	public String toString() {
		return String.format("%s, accessAge=%d", super.toString(),accessAge);
	}

	public int getAccessAge() {
		// TODO Auto-generated method stub
		return 0;
	}
}

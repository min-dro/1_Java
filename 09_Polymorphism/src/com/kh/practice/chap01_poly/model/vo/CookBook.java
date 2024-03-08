package com.kh.practice.chap01_poly.model.vo;

// Book Ŭ���� ��� ����
public class CookBook extends Book {
	private boolean coupon;		// �丮�п� ��������
	
	// ������ (2) : �⺻������, �Ű����� 4��(title, author, publisher, coupon) ���޹��� ������
	public CookBook() {}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	// �޼ҵ� (1) : toString() - �θ�Ŭ����(Book) �ʵ�� ���� Ŭ����(CookBook)�� �ʵ� ������ ���ڿ� ��ȯ
	@Override
	public String toString(){
		return String.format("%s, coupon%b",super.toString(), coupon);
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	public void address(){
		
	}

}

package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	private Member mem = null;	// null�� ���� �ʱ�ȭ
	private Book[] bList = new Book[5]; // ũ�� 5 �Ҵ�
	
	// �ʱ�ȭ ����. book ��ü �迭�� 5���� ��ü �����͸� �ʱ�ȭ
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("���� �� �� �����غ�", "������", "�ұ���", true);
	}
	
	// Controller �κ��� �����ڸ� �ٷ� �������� ����
	//	=> �⺻ �����ڸ� ����Ͽ� ��ü�� ����
	
	// inserMenber => setter �޼ҵ�
	public void insertMember(Member mem) {
		this.mem = mem;		// �ּҰ��� �����(���Ե�)
	}
	// myInfo => getter �޼ҵ�
	public Member myInfo() {
		return mem;		// ��������(mem)�� �ּҰ��� ����
	}
	
	// selectAll => bList ������ getter �޼ҵ�
	public Book[] selectAll() {
		return bList;	// ��������(bList)
	}
	
	// Ű���带 �Է� �޾� Ű���尡 ���Ե� ���� ����� ��ȯ
	public Book[] searchBook(String keyword) {
		return null;
	}
	
	//
	public int rentBook(int index) {
		int result = 0;
		
		// index: ��ü(Book) �迭���� ����� ��ġ ��.
		//	bList (�������)���� ��ȭå(AniBook)�ΰ��
		if(bList[index] instanceof AniBook) {
			if (mem != null) {	// ȸ�������� �ִٸ�,,
				// bList[index] =>	Book b; => (AniBook)b
				int accessAge = ((AniBook)bList[index]).getAccessAge();
				//		ȸ�� ���̿� ��ȭå�� ���ѳ��̸� ��
				if(mem.getAge() < accessAge) {
					//		ȸ�� ���� < ��ȭå�� ���ѳ��� : result = 1
					result = 1;
				}
			}
		} else if(bList[index] instanceof CookBook) {
			// bList (�������)���� �丮å�� ���
			
			//	   �ش� �丮å�� ���������� ��(true)�� ���
			//	   => CookBook Ŭ������ isCoupon() �޼ұ׸� ���� Ȯ��!
			//			���� ���(bList)���� index ��ġ�� å�� �丮å(CookBook)
			if(((CookBook)bList[index]).isCoupon()) {
				//			- ȸ���� couponCount �� 1 ����
				//			- result = 2
				if(mem != null) {
					// �޼ҵ带 ¥�� �߰��Ͽ� �ۼ�
					mem.addCount();
					
					/* �ǽ����� �������� �ۼ�
				    int memCouponCount = mem.getCouponCount();
					mem.setCouponCount(memCouponCount + 1);
					 */
					result = 2;
				}
			}
		//	bList(�������)���� �丮å(CookBook)�� ���
		//		�ش� �丮å�� ����������
		}
		return result;
	}
}

package com.kh.inherit;

// �ڽ� Ŭ����
//	: Parent Ŭ�����κ��� ���
//	* "���" : Parent Ŭ������ �ɹ�(����, �޼ҵ�)�� Child1 Ŭ�������� ���� ���� ���� ���� ��ó�� ����� ����.
public class Child1 extends Parent{			// extends Parent: Parent Ŭ�����κ��� ����� �޴´�.
	// �ʵ��(����/�ʵ�/�ɹ�����)
	private int n1;
	
	// �����ں�
	public Child1() {}
	public Child1(int x, int y, int n1) {	// x, y ������ �θ�Ŭ����(Parent)�� ���ǵ� �ɹ� ����
											//  n1�� �ڽ�Ŭ����(Child1)��
		super(x, y);						//
		this.n1 = n1;						//
	}
	
	// �޼ҵ��
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	// �������̵� : �θ�Ŭ������ �޼ҵ��� ������ �ڽ�Ŭ�������� ����
	//			- ���� ���� : �޼ҵ��, ��ȯŸ��, �Ű�����(����/����/����)
	// �޽����� ����ϴ� �޼ҵ�
	@Override			// @xxx : �̳����̼�
	public void printMsg() {
		System.out.println("�ȳ� ���� �ڽ�Ŭ������.");
	}
	
	public void printChild1() {
		
	}
}

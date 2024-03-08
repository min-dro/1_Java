package com.kh.inherit;

// Parent : �θ� ���� Ŭ����
public class Parent {
	// �ʵ��
	private int x;			 // ���� ������ private���� �����ϴ� ����? Ŭ���� �ܺο��� ���� ������ ���� ����
	private int y;			 //									�߿��� ������ ����� �ٲ��� ���ϱ� ����
	
	// �����ں�
	public Parent() {}		 // �⺻ ������ : �Ű������� ����, �ʱ�ȭ�ϴ� ���� ����.
							 // 
	
	public Parent(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	// �޼ҵ��
	//	- private �ɹ� ������ ��� getter/setter �޼ҵ�� ĸ��ȭ �۾��� �ؾ���
	//							�Ű������� ����

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	// �޽����� ����ϴ� �޼ҵ�
	public void printMsg() {
		System.out.println("�ȳ� ���� �θ�Ŭ������.");
	}
}

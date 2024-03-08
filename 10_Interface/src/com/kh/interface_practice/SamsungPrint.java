package com.kh.interface_practice;

// Print Ŭ�����κ��� ��ӹ���
public class SamsungPrint extends Print implements Printable{
	// �߻�Ŭ���� ��� �� �Ʒ� �׸��� �ϳ��� �� �ؾ���!
	//	- �ڽ� Ŭ������ �߻�Ŭ������ ����
	//	- �߻� �޼ҵ带 ������(�������̵�)
	
	@Override
	public void colorPrint() {
		System.out.println("Samsung Color Print");
	}
	
	@Override
	protected void printTest() {
		System.out.println("Samsung Print Test");
	}
	
	@Override
	void printTest2() {
		System.out.println("Samsung Print Test 2");
	}
}

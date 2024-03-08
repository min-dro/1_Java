package com.kh.inherit;

// ������ ���� �뵵(Ŭ����)
public class Run {

	// �ڹ� ���α׷��� ���۰�. => main �޼ҵ�
	public static void main(String args) {
		
		// Child1 Ŭ������ ����� �� �޾Ҵ� �� �׽�Ʈ
		Child1 chd1 = new Child1();
		chd1.printMsg();
		// chd1.x;				// �θ�Ŭ����(Parent)�� private �����δ� ���� �Ұ�!
		
		Parent p1 = new Parent();
		p1.printMsg();
		
		Parent p2 = new Child1();
		p2.printMsg();			//	- �������ε� : �������̵� �� �޼ҵ尡 �����.
								//				��ü�� �ڽ�Ŭ������ �����Ͽ� �������̵� �� �޼ҵ� �������� �����.
		
		// �������� instanceof Ŭ���� : ���������� �ش� Ŭ������ �ν��Ͻ��� �����Ǿ� �ִ°�?
		//											  ��ü�� �����ߴ°�?
		//							��� ��: true / false => ���ǽ����� ���
		if(p2 instanceof Child1) {
			
			// Ŭ���� �� ��ȯ (�ٿ�ĳ����) : �ڽ�Ŭ���� ���� �ִ� �ɹ�(����, �޼ҵ�)�� �����ϱ� ����
			//							 Ŭ���� �� ��ȯ�� ����� ��.
			//							 * ���������� Ÿ���� �θ�Ŭ����(Parent)�� �Ǿ� �־�
			//							   �ش� �ɹ��� ������ �� �� ���� ������,,
			((Child1)p2).printChild1();
		}
	}
}

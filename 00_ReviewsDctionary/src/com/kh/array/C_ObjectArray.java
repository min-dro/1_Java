package com.kh.array;

class Person {
	String name;
	int age;
	double height;
	
	public Person() {
		name = "ȫ�浿";
		age = 17;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class IU extends Person {
	public IU() {
		// �θ�Ŭ������ �����ڸ� ȣ���ؼ�, "������", 32 ���� �ʱ�ȭ
//	��ӹ��� �ʵ忡 ���� �ʱ�ȭ�� ����������.. �θ�Ŭ������ �����ڸ� Ȱ��
//		name = "������";
//		age = 32;
		super("������", 32);
	}
}

class Hong extends Person {
	// 1) �����ڰ� ���ǵǾ� ���� ������, �ڵ����� �⺻�����ڰ� ����
	//	  public Hong() {}
	// 2) �⺻�����ڰ� ����� �� �θ�Ŭ���� �⺻�����ڰ� �ڵ����� ȣ��(����)
	//	  public Hong() {
	//			super();
	//	  }
}

public class C_ObjectArray {
	
	public static void main(String[] args) {
		// Person ��ü �迭 ���� : 2���� ����� ������ �迭
		Person [] pArr = new Person[2];
		//	* ��ü �迭 ���������� �迭 ���� �ν��Ͻ��� �����Ǵ� ���� �ƴ�!
		//	  => ����, �迭 ���� �ش� ��üŸ������ �ν��Ͻ��� ��������� ��.
		pArr[0] = new IU();			// ������: �θ�Ŭ���� Ÿ���� ���������� �ڽ�Ŭ����Ÿ���� �ν��Ͻ��� ������ �� ����.
									//		  �������� ���¸� ���� �� ����
		pArr[1] = new Person();
		
		
		for(Person p : pArr) {
			System.out.printf("�̸� : %s, ���� : %d\n", p.name, p.age);
		}
	}
}

package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	
	// �޼ҵ��
	public static void main(String[] args) {
		 // Member Ŭ���� ���� �� �ν��Ͻ� ����
		Member m = new Member(); // �⺻������: Ŭ������();
		// changeName()�� �̿��� ���� ����
		m.changeName("���μ�");
		// printName()�� �̿��� ���
		m.printName();
		
		Member m2 = new Member();
		m2.changeName("ȫ�浿");
		m2.printName();
	}
}

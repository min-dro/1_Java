package com.kh.practice;

public class StringBuilderTest {
	public static void main(String[] args) {
		// StringBuilder : ���ڿ� ���� ������ �� �ָ� (���� �޸� �������� ���� ���
		//				   ������ safe ���� �ȵ�. (���� �����忡�� ���)
		
		String str = "map";
		
		// StringBuilder ��ü ���� �� String Ÿ���� ������ �ʿ�
		StringBuilder builder = new StringBuilder(str);
		
		int hash = System.identityHashCode(builder);
		System.out.println("���� �� builder : " + hash);
		
		// ������.append(��) : StringBuilder Ÿ���� ������ ���� ����
		builder.append(" point");
		builder.append(" tomato");
		builder.append(" orange");
		
		System.out.println(builder.toString());
		System.out.println("���� �� builder : " +
							System.identityHashCode(builder));	
	}
}

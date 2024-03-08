package com.kh.practice;

public class StringTest {
	
	public static void main(String[] args) {
		// String Ŭ���� : ���ڿ� ���� ������ �ʴ´�. (=> ���� ����Ǹ� �޸𸮿� ���ο� ���� �Ҵ�)\
		
		String str1 = "apple";
		String str2 = "apple";
		
		// str1 == str2 : ���ڿ� ���� ���ϴ°� �ƴ϶�, str1�� str2�� ������ �ּҰ��� ��
		System.out.println(str1 == str2);		// ���? true
												// ���ڿ� �� ��ü�� �����ϸ� ���Ǯ�̶�� ������ ���� ����Ǿ�
												// ���� ���� ����Ű�Ե� (�ּҰ��� ����)
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		System.out.println(str3 == str4);		// ���? false
												// ���ڿ� ��ü�� �����ؼ� ���� �����ϸ� �޸𸮿� ���ο� ������ �Ҵ��ϹǷ�
												// ���� �Ҵ�� ������ ����Ű�Ե� (�ּҰ��� �ٸ�)
		
		System.out.println(str3 == "apple");	// ���? false
												// str3�� ����Ű�� �ּҿ� "apple" �� ��ü�� ����� �ּҷ� ��
												// str3�� ���ο� �޸� ���� �Ҵ� �� "apple" ���� ����
												// "apple" �� ��ü�� ���Ǯ�� ������ �Ǿ� ���� �ٸ� ���� ����Ŵ(�ּҰ��� �ٸ�)
		
		// (���ڿ� ������ ��).equals(���ڿ� ������ ��) => true/false : true(����), false(�ٸ�)
		System.out.println(str3.equals("apple"));	// ���? true
													// .equals() �޼ҵ带 ����Ͽ� ��
		System.out.println("========================================");
		
		String str5 = "Hello";
		String str6 = "World";
		System.out.println(str5);		// ���ڿ� ���� ���: Hello
										// ����Լ��� ��üŸ���� ���� �Է� �� => ����.toString()
		System.out.println(str5.toString());	// String Ŭ�������� toString �޼ҵ尡 �������̵���
		
		// System.identityHashCode(������) : System Ŭ���� �� �ؽ���(�ּҰ�)�� Ȯ���ϴ� �޼ҵ�
		int hash = System.identityHashCode(str5);	// str5 ������ �ؽ���(�ּҰ�)
		System.out.println("���� ��");
	}
	
}

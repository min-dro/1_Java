package com.kh.practice;

import java.util.StringTokenizer;		// java.util. ��ο�

public class StringTokenizerTest {

	public static void main(String[] args) {
		// ���ڿ�(String) ���� �޼ҵ�
		//	- String.format("���ڿ� ")
		//	- ���ڿ�.charAt(index)
		//	- ���ڿ�.length()
		//	- ���ڿ�.equals(���ڿ�A)
		
		String str = "  Hello  ";
		
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("el"));
		
		System.out.println(str.repeat(5));	// repeat(count) : count��ŭ �ݺ�
		
		System.out.println(str.replace("ll", "p"));	//replave([old], [new]) : old�� �ش��ϴ� ����                         
		System.out.println(str.substring(3));
		System.out.println(str.toLowerCase());
	} 
	public void test2() {
		// key : name, phone, address, email
				//  - key�� �ش��ϴ� ���� value�� �ش��ϴ� ���� (:)�� ����
				//  - �� ������ (,)�� ����
				String data = "name:Hong, phone:010-1234-5678, address: gangnam, email: hong12@gmail.com";
				
				// StringTokenizer �� ����Ͽ� �Ʒ� ������ ���
				//  �̸��� Hong�̰�, ����ó�� 010-1234-5678�̰�, �ּҴ� gangnam�̰�, �̸����� hong12@gmail.com �Դϴ�.
				//		  %s				  %s				  %s					%s
				
				
				int index =0 ;
				// (1) (,)�� �����Ͽ� ��ūȭ
				StringTokenizer st = new StringTokenizer(data, ",");
				
				while(st.hasMoreTokens()) {
					String keyValue = st.nextToken();		// , �������� ��ūȭ�Ͽ� ���ڿ��� ����
					System.out.print(keyValue);
					
					// (2) (:)���� �����Ͽ� ��ūȭ
					StringTokenizer st2 = new StringTokenizer(keyValue, ":");
					
				}
//				System.out.printf("�̸��� %s�̰�, ����ó�� %s�̰�, �ּҴ� %s�̰�, �̸����� %sd �Դϴ�.", args);
	}
	public void test() {
		// StringTokenizer : ���ڿ� ���� Ư�� �����ڷ� �����ִ� Ŭ����(��ūȭ)
		
				String msg = "�ȳ��ϼ���|���´����Դϴ�|�ݰ����ϴ�"; // Ư�� ������ : |
				
				String[] arr = new String[3];
				int i = 0;
				
				StringTokenizer st = new StringTokenizer(msg, "|");
				
				// ������.hashMoreTokens() : �����ڸ� ���� ��ūȭ�� �� �ִ� �� Ȯ���ϴ� �޼ҵ�
				//							true/false : true(��ūȭ ����) false(��ūȭ �Ұ�)
				
				while(st.hasMoreTokens()) { // ��ūȭ�� �����ϴٸ� ��� �ݺ����� �����Ѵ�.
					
					// ������.nextToken(): ������ �������� ���� �и��ؼ� ��ȯ�ϴ� �޼ҵ�
					//					 ���� ��ȯ�ϰ� ���� ������ ��ġ�� �̵�
					// System.out.println(st.nextToken());
					arr[i] = st.nextToken();
					System.out.println(arr[i]);
					i++;
					
		}
	}
}

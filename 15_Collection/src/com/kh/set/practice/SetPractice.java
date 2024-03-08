package com.kh.set.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetPractice {
	/*
	 *  Set�� Ư¡
	 *  : �ߺ� ����� �ȵǰ�, ������ ���� �ݷ���
	 *  
	 *  * HashSet
	 *    - �ؽ�(Hash) : Ư�� ���ؿ� ���� �����͸� �з��ϴ� ���(�˰�����)
	 *    
	 *    - �ߺ� ������ �Ǵ� : hashCode, equals
	 *    	 (1) hashCode : ������ �Ǵ� ��(������)�� ����
	 *    	 (2) equals	: hashCode ���� ���� ��� ���� ������ �Ǵ� ���� ����
	 *    
	 *    - Set �޼ҵ�
	 *    	 * ������ �߰� : add(������)
	 *    	 * ������ ���� : remove(������)
	 *    	 * ������ ���� ��ȸ : size()
	 *    	 * ������ ��ȸ [2]
	 *    		(1) Iterator (�ݺ���) ���
	 *    			- ��ü ���� : set������.iterator()
	 *    			- ������ ��/�� �Ǵ� : iterator������.hasNext()
	 *    			- ������ ��ȸ : iterator������.next()
	 *    		(2) for-each��
	 *    			for(�ڷ��� ������ : set������) {
	 *    				// �������� ���� set �� �����ͷ� ����
	 *    			}
	 */
	
	public static void main(String[] args) {
		// Member ��ü �����͸� Set ������ ����
		Set<Member> mHashSet = new HashSet<>();
		
		// ������ �߰� => Member Ÿ���� ������
		mHashSet.add(new Member(1000, "������"));		// �ν��Ͻ� �����ϸ鼭 ����
		Member m1 = new Member(1001, "���ð�");
		mHashSet.add(m1);							// �ν��Ͻ��� ����Ű�� �������� ����
		
		// ������ ��ȸ
		for(Member member : mHashSet) {
			System.out.println(member);				// member => member.toString()�� ȣ��Ǿ� ��µ�
		}
		System.out.println("*".repeat(20));
		
		// ������ ����
		mHashSet.remove(new Member(1001, "���ð�"));
				
		mHashSet.add(new Member(1001, "���Ѻ�"));
		
		// ������ ��ȸ
		for(Member member : mHashSet) {
			System.out.println(member);				// member => member.toString()�� ȣ��Ǿ� ��µ�
		}
				
	}
	public static void hashSetTest01() {
		// �����͸� Set ������ �����Ϸ��� HashSet Ŭ���� ��� => ��ü ����(�ν��Ͻ�ȭ)
		Set<String> hashSet = new HashSet<>();
		
		// Set ������ �����͸� �߰�
		hashSet.add("ISTP");
		hashSet.add("ESFP");
		hashSet.add("ISFJ");
		hashSet.add("ISFP");
		
		hashSet.add("INTJ");
		
		hashSet.add("ESFP");	// �ߺ� ������!
		
		// Set�� ����� �����͸� ���
		System.out.println(hashSet);		// ���������� ����Լ��� ��������� [������, ������, ...] �������� ��µ�.
		
		// iterator ����Ͽ� ���
		Iterator<String> iter = hashSet.iterator();		// (1) Iterator ��ü ����
		for(;iter.hasNext();) {							// (2) ���ǽ� ��ġ : ������ ��/�� �Ǵ�
			String data = iter.next();					// (3) ������ ��ȸ
			System.out.println(data);
		}
		
		// ������ ���� : ISFP
		hashSet.remove("ISFP");
		
		
		// for-each
		for(String data:hashSet) {		// � �����͵��� �������� Ȯ�� �� �ڷ��� �ۼ�
			System.out.println(data);	// data => Set�� ����� ������ �ϳ��ϳ��� ������
		}
	}
}

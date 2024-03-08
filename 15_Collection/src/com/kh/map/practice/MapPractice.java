package com.kh.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.kh.set.practice.Member;

public class MapPractice {
	/*
	 * Map<K, V>�� Ư¡
	 * : key-value �������� �����͸� ����.
	 * 	 key�� �ش��ϴ� �����ʹ� �ߺ� ������ ���� (Set ���)
	 * 	 value�� �ش��ϴ� �����ʹ� key���� �ߺ����� ������ �ߺ��� ��� (List ���)
	 * 
	 * - �޼ҵ�
	 * 	 (1) ������ �߰� : put(Ű�� �ش��ϴ� ��, �����Ϳ� �ش��ϴ� ��)
	 * 	 (2) ������ ���� : remove(Ű�� �ش��ϴ� ��)
	 * 	 (3) ������ ��ȸ : get(Ű�� �ش��ϴ� ��)
	 * 	 (4) Ű ��� ��ȸ : keqSet()
	 * 	 (5) ������ ���� ��ȸ : size()
	 */
	public static void main(String args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1000, "ȫ�浿"));
		memberHashMap.addMember(new Member(2000, "�ƹ���"));
		memberHashMap.addMember(new Member(3000, "������"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(2000);
		
		System.out.println("*".repeat(20));
		
		memberHashMap.showAllMember();
	}
	public static void hashMapTest() {
		// HashMap �ݷ����� ����Ͽ� �����͸� ó�� => �ν��Ͻ� ����
		//  Key : ������ ������, value : ���ڿ� ������
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(3000, "SSG");	// ��õ
		hashMap.put(3001, "Ű��");	// ����
		hashMap.put(3002, "�Ե�");	// �λ�
		
		// Ű ��� ��ȸ �� Map�� ����� �����͸� ���
		Set<Integer> keyList = hashMap.keySet();
		
		for(Integer k : keyList) {	// keyList(Ű ���)���� k(Ű ��)��� ���� �ϳ��� ���
			// ������ ��ȸ
			System.out.println( k + ":" + hashMap.get(k));
		}
		
		// "Ű��" �����͸� ����
		hashMap.remove(3001);
		
		System.out.println("*".repeat(20));
	
		keyList = hashMap.keySet();
		for(Iterator<Integer> iter = keyList.iterator(); iter.hasNext();) {
			Inter = iter.next();		// iter.next() : Ű ���� �ϳ��� ��ȸ
																// hashMap.get(key) : �� �������� map���� ������ ��ghl
		}
	}
}

package com.kh.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.kh.set.practice.Member;

// HashMap ������ Member �����͸� �����ϱ� ���� Ŭ����
public class MemberHashMap {
	// �ʵ�
	// -hashMap:HashMap<Integer,Member>
	private HashMap<Integer, Member> hashMap;
	
	// ������
	// +MemberHashMap() // hashMap �ʵ带 �ʱ�ȭ(�ν��Ͻ� ����)
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	// �޼ҵ�
	// +addMember(member:Member):void		// HashMap�� ������ �߰�(k: memberId, v: Member)
	public void addMember(Member member) {
		// ���޵� Member ��ü�� ���� �� memberId ���� Ű�� ���, �����ʹ� member ��ü ���� �� ��ü�� ���
		hashMap.put(member.getMemberId(), member);
	}
	// +removeMember(memberId:int):boolean	// ���� ���� : true, ����: false(���ŵ� ���� ���� ���)
											// �ش� �����Ͱ� �ִ� �� Ȯ�� �� ������ ����. ������ ����x
	public boolean removeMember(int memberId) {
		// memberId : Map ����
		if(hashMap.containsKey(memberId)) {		// containsKey(Ű��) : Map ���� Ű���� �ش��ϴ� �����䰡 �ִ� �� ����
			hashMap.remove(memberId);
			return true;
		}
		return false;
	}
	// +showAllMember():void				// Iterator ����Ͽ� ����� �����͸� ���
	public void showAllMember() {
		// (1) Iterator ��ü ����
		Set<Integer> keyList = hashMap.keySet();
		Iterator<Integer> iter = keyList.iterator();
		
		// (2) �ݺ��� �����鼭, ������ ��/�� üũ�ϰ� ��ȸ
		while(iter.hasNext()) {
			Integer key = iter.next();		   // Ű ���� ��ȸ
			Member m = hashMap.get(key);
		}
	}
}

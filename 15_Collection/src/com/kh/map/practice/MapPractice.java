package com.kh.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.kh.set.practice.Member;

public class MapPractice {
	/*
	 * Map<K, V>의 특징
	 * : key-value 형식으로 데이터를 저장.
	 * 	 key에 해당하는 데이터는 중복 허용되지 않음 (Set 방식)
	 * 	 value에 해당하는 데이터는 key값이 중복되지 않으면 중복이 허용 (List 방식)
	 * 
	 * - 메소드
	 * 	 (1) 데이터 추가 : put(키에 해당하는 값, 데이터에 해당하는 값)
	 * 	 (2) 데이터 삭제 : remove(키에 해당하는 값)
	 * 	 (3) 데이터 조회 : get(키에 해당하는 값)
	 * 	 (4) 키 목록 조회 : keqSet()
	 * 	 (5) 데이터 길이 조회 : size()
	 */
	public static void main(String args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1000, "홍길동"));
		memberHashMap.addMember(new Member(2000, "아무개"));
		memberHashMap.addMember(new Member(3000, "아이유"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(2000);
		
		System.out.println("*".repeat(20));
		
		memberHashMap.showAllMember();
	}
	public static void hashMapTest() {
		// HashMap 콜렉션을 사용하여 데이터를 처리 => 인스턴스 생성
		//  Key : 정수형 데이터, value : 문자열 데이터
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(3000, "SSG");	// 인천
		hashMap.put(3001, "키움");	// 서울
		hashMap.put(3002, "롯데");	// 부산
		
		// 키 목록 조회 후 Map에 저장된 데이터를 출력
		Set<Integer> keyList = hashMap.keySet();
		
		for(Integer k : keyList) {	// keyList(키 목록)에서 k(키 값)라는 값을 하나씩 사용
			// 데이터 조회
			System.out.println( k + ":" + hashMap.get(k));
		}
		
		// "키움" 데이터를 제거
		hashMap.remove(3001);
		
		System.out.println("*".repeat(20));
	
		keyList = hashMap.keySet();
		for(Iterator<Integer> iter = keyList.iterator(); iter.hasNext();) {
			Inter = iter.next();		// iter.next() : 키 값을 하나씩 조회
																// hashMap.get(key) : 값 기준으로 map에서 데이터 조ghl
		}
	}
}

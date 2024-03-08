package com.kh.set.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetPractice {
	/*
	 *  Set의 특징
	 *  : 중복 허용이 안되고, 순서가 없는 콜렉션
	 *  
	 *  * HashSet
	 *    - 해시(Hash) : 특정 기준에 따라 데이터를 분류하는 방식(알고리즘)
	 *    
	 *    - 중복 데이터 판단 : hashCode, equals
	 *    	 (1) hashCode : 기준이 되는 값(데이터)을 정의
	 *    	 (2) equals	: hashCode 값이 같을 경우 동일 데이터 판단 로직 정의
	 *    
	 *    - Set 메소드
	 *    	 * 데이터 추가 : add(데이터)
	 *    	 * 데이터 삭제 : remove(데이터)
	 *    	 * 데이터 길이 조회 : size()
	 *    	 * 데이터 조회 [2]
	 *    		(1) Iterator (반복자) 사용
	 *    			- 객체 생성 : set변수명.iterator()
	 *    			- 데이터 유/무 판단 : iterator변수명.hasNext()
	 *    			- 데이터 조회 : iterator변수명.next()
	 *    		(2) for-each문
	 *    			for(자료형 변수명 : set변수명) {
	 *    				// 변수명을 통해 set 내 데이터로 접근
	 *    			}
	 */
	
	public static void main(String[] args) {
		// Member 객체 데이터를 Set 구조로 관리
		Set<Member> mHashSet = new HashSet<>();
		
		// 데이터 추가 => Member 타입의 데이터
		mHashSet.add(new Member(1000, "아이유"));		// 인스턴스 생성하면서 전달
		Member m1 = new Member(1001, "성시경");
		mHashSet.add(m1);							// 인스턴스를 가리키는 참조변수 전달
		
		// 데이터 조회
		for(Member member : mHashSet) {
			System.out.println(member);				// member => member.toString()이 호출되어 출력됨
		}
		System.out.println("*".repeat(20));
		
		// 데이터 삭제
		mHashSet.remove(new Member(1001, "성시경"));
				
		mHashSet.add(new Member(1001, "임한별"));
		
		// 데이터 조회
		for(Member member : mHashSet) {
			System.out.println(member);				// member => member.toString()이 호출되어 출력됨
		}
				
	}
	public static void hashSetTest01() {
		// 데이터를 Set 구조로 관리하려면 HashSet 클래스 사용 => 객체 생성(인스턴스화)
		Set<String> hashSet = new HashSet<>();
		
		// Set 구조에 데이터를 추가
		hashSet.add("ISTP");
		hashSet.add("ESFP");
		hashSet.add("ISFJ");
		hashSet.add("ISFP");
		
		hashSet.add("INTJ");
		
		hashSet.add("ESFP");	// 중복 데이터!
		
		// Set에 저장된 데이터를 출력
		System.out.println(hashSet);		// 참조변수만 출력함수로 출력했을떄 [데이터, 데이터, ...] 형식으로 출력됨.
		
		// iterator 사용하여 출력
		Iterator<String> iter = hashSet.iterator();		// (1) Iterator 객체 생성
		for(;iter.hasNext();) {							// (2) 조건식 위치 : 데이터 유/무 판단
			String data = iter.next();					// (3) 데이터 조회
			System.out.println(data);
		}
		
		// 데이터 삭제 : ISFP
		hashSet.remove("ISFP");
		
		
		// for-each
		for(String data:hashSet) {		// 어떤 데이터들의 모음인지 확인 후 자료형 작성
			System.out.println(data);	// data => Set에 저장된 데이터 하나하나를 꺼내옴
		}
	}
}

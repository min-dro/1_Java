package com.kh.list.practice;

import java.util.ArrayList; // import : 다른 경로에 있는 클래스 사용 시 위치를 알려준다.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * List 특징
	 * : 순서가 있고, 중복이 허용되는 콜렉션
	 * 
	 * * ArrayList
	 * 	 - 배열 구조
	 * 	 - 데이터 조회가 빠르다.
	 * 	 - 데이터 추가/삭제 시 복잡하여 오래 걸린다.
	 * 
	 * 	 - 표현법: List<E> 참조변수명 = new ArrayList<[E]>();
	 * 			 ArrayList<E> 참조변수명 = new ArrayList<[E]>();
	 * 
	 * * LinkedList
	 * 	 - 리스트 구조
	 * 	 - 데이터 추가/삭제가 빠르다.
	 * 	 - 데이터 조회가 느리다.
	 * 
	 * 	 - 표현법:  List<E> 참조변수명 = new LinkedList<[E]>();		// [E] : E 타입 생략 가능.
	 * 			  LinkedList<E> 참조변수명 = new LinkedList<[E]>();
	 * 
	 * * List 관련 메소드 => ArrayList, LinkedList 클래스에서 정의되어 있음
	 * 	 - 데이터 추가 : add(데이터) 	// E 타입의 데이터 추가
	 *   - 데이터 삭제 : remove(인덱스)	// 인덱스의 위치의 데이터 삭제
	 *   - 데이터 조회 : get(인덱스)		// 인덱스의 위치의 데이터 조회
	 *   - 저장된 데이터 길이 : size()
	 */
	public static void main(String[] args) {	//PSVM
		// 큐(Queue) : 처음 저장된 데이터가 가장 처음으로 꺼내올 수 있는 구조 (FIFO: First In first Out)
		MyQueue mQueue = new MyQueue();
		
		mQueue.enQueue("엄마는 외계인");
		mQueue.enQueue("민트 초코");
		mQueue.enQueue("아몬드 봉봉");
	}
	public static void stackTest(){
		// 스택(Stack) : 제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있는 구조 (LIFO: Last In First Out)
		// 데이터 추가 : 순서대로 추가
		// 데이터 제거 : 마지막 위치부터 제거
		
		MyStack mStack = new MyStack(); 
		
		//
		mStack.push("커피");
		mStack.push("오렌지주스");
		mStack.push("쌍화탕");
		
		System.out.println(mStack.pop());
		System.out.println(mStack.pop());
		System.out.println(mStack.pop());
		
	}
	public static void linkedListTest() {
		// [2] LinkedList<E>
		LinkedList<Integer> list = new LinkedList<>();
		
		// 사용자에게 저장할 데이터 길이를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 데이터 길이를 입력하세요 : ");
		int num = sc.nextInt();
		// 그 길이만큼 랜덤 값을 저장
		for(int i=0; i < num; i++) {
			
			//(int)(Math.random() * num + 1)	// 단향 연산자: 연산 대상이 1개, (type) => 단향연산자 (우선 순위사 꽤 높은편)
												// Math.random() => 0 <= n < 1 (0.000000xxx1 ~ 0.999999xx)
			int random = (int)(Math.random() * num + 1);
			list.add(random);			// random 변수의 데이터타입 자동 변환 -> Integer
		}
		// 저장된 데이터를 출력
		printItem(list);
	}
	
	public static void arrayListTest() {
		// [1] ArrayList<E>
		ArrayList<String> arr = new ArrayList<>();
		
		//	데이터 추가: add
		arr.add("한식(멕주창고)");
		arr.add("마라탕");
		arr.add("짜장면");
		
		//	데이터 조회: get
//		for(int i=0; i < arr.size(); i++) {		// 저장된 데이터 길이: size
//			System.out.println(arr.get(i));		//	데이터 조회: get
//		}
		printItem(arr);
		
		//	데이터 삭제: remove
		arr.remove(1);	// 두번째 위치의 데이터("마라탕") 제거
		
//		System.out.println("-".repeat(10));		// 문자열.repeat(count) : 해당 문자열을 반복하여 문자열 반환
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		printItem(arr);
		
		//	데이터 추가 (원하는 위치에) : add(int index, E element)
		arr.add(1, "돈가스");		  // 두번쨰 위치에 데이터 추가
		
//		System.out.println("-".repeat(10));
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		printItem(arr);
		
		//	데이터 수정 (수정할 위치에) : set(int index, E element)
		arr.set(1, "냉면");
		
//		System.out.println("-".repeat(10));
		printItem(arr);
	}
	
	// printItem 메소드 : 중복 제거하기 위해 정의. 리스트 내 아이템 출력
	public static <E> void printItem(List<E> list) {	// 제네릭 메소드 정의
			// 인터페이스를 구현한 클래스의 인스턴스가 매개변수로 전달 가능!
			// List<E> list = new ArratList<>();
			// List<E> list = new LinkedList<>();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i +"번쨰: " + list.get(i));
		}
		System.out.println("-".repeat(10));
	}
}

package com.kh.thread.sync;

// 동기화 처리 : 메소드 전체, 매소드 내 일정 부분(블럭)
//	-> 사용 중인 자원(데이터)을 다른 스레드가 접근하지 못하도록 하는 것
//	   데이터가 변경되는 위치에 처리
class CounterSynkBlock {
	// ~count:int=0
	int count = 0;
	
	// +increment():void => count 값을 1증가
	public void increment() {
		synchronized(this) {
			count++;
		}
	}
	
	/*******************
	 * 메소드에 동기화 처리 적용 (들 다 가능)
	 * [1]
	 	synchronizedpublic void increment() {
	 		count++;
	 	}
	 * [2]
	 	public synchronized void increment2() {
	 	 	count++;
	 	}
	 */
	
	// +decrement():void => count 값을 1 감소
	public void decrement() {
		synchronized(this) {
			count--;
		}
	}
	
	// +getCount():int => count 값을 조회
	public int getCount() {
		return count;
	}
}
public class MutualAccessSync {
	public static void main(String[] args) {
		// 람다식 사용하여 Thread 작업 생성(정의)
		Runnable task1 = () -> {
			for(int i=0; i<500; i++) {
				csb.increment();
			}
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<500; i++) {
				csb.decrement();
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		// 스레드 실행
		t1.start();
		t2.start();
		
		// 메인스레드가 아래 스레드들의 작업 종료까지 기다리도록 처리
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		System.out.println(csb.getCount());
	}
}

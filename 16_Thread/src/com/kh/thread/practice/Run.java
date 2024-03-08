package com.kh.thread.practice;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("---- 프로그램 시작 ----");
		
		ThreadClass daemon = new ThreadClass("daemon");
		daemon.setDaemon(true);		// 데몬 스레드 설정
		daemon.setContextClassLoader(null);
	}
	public static void threadTest02() {
		// Thread 객체 3개 생성
		ThreadClass t1 = new ThreadClass("Thread-01");
		ThreadClass t2 = new ThreadClass("Thread-02");
		ThreadClass t3 = new ThreadClass("Thread-03");
		
		// t3 스레드가 가장 먼저 실행하도록 처리
		//	setPriority(우선순위값) : 우선순위 기본 값(5)
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void threadTest01() {
		System.out.println("** 프로그램 시작 **");
		
		// 1. Thread 클래스를 상속했을 경우
//		ThreadClass tc = new ThreadClass();
//		tc.start();
		
		// 2. Runnable 인터페이스를 구현한 경우
		ThreadInterface ti = new ThreadInterface();
		
		Thread t2 = new Thread(ti); // Thread 객체 생성 시 정의한 클래스 전달
		t2.start();
		
		// main 스레드가 t2 스레드의 작업을 기다리게 하려면? .join()
		try {
			
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("** 프로그램 종료 **");
	}
	
}

package com.kh.thread;

public class ThreadPractice {
	/*
	 * 스레드 : 프로세스 내 작업 단위
	 * 			-> 프로세스: 실행 중인 프로그램
	 *  * 싱글 스레드 : 한 프로세스 내에 하나의 스레드 수행
	 *  * 멀티 스레드 : 한 프로세그 내에 여러 개의 스레드 수행
	 *  
	 *  * 스레드 사용법
	 *  
	 *  	[1] Thread 클래스를 상속하여 생성
	 *  		// Thread 클래스 상속
	 *  ex) public class Sender extends Thread {
	 *  			// run 메소드 오버라이딩
	 *  			@Override
	 *  			public void run() {
	 *  				// 스레드로 수행할 작업
	 *  			}
	 *  		}
	 *  
	 *  	// 다른 클래스 내 메소드에서 사용방법
	 *  	Sender sThread = new Sender();
	 *  	sThread.start();			// 스레드 실행
	 *  
	 *  	[2] Runnable 인터페이스 구현(상속)
	 *  		// Runnable 인터페이스 구현
	 *  	ex) public class Receiver implements Runnable {
	 *  			// run 메소드 오버라이딩
	 *  			@Override
	 *  			public void run() {
	 *  				// 스레드로 수행할 작업
	 *  			}
	 *  		}
	 *  
	 *  	// 다른 클래스 내 메소드에서 사용방법
	 *  	Receiver rTask = new Receiver();
	 *  	Thread rThread = new Thread(rTask);
	 *  	rThread.start();
	 */
}

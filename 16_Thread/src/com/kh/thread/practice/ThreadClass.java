package com.kh.thread.practice;


// 1. Thread 클래스 상속
public class ThreadClass extends Thread {
	private String name;
	public ThreadClass(String name) {
		this.name = name;
	}
	// run 메소드를 오버라이딩
	// 오버라이딩 자동완성 단축키: Alt + Shift + s -> V
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// this.getClass() : 현재 클래스 정보
			System.out.println(this.getClass() + ": " + i);
			try {
				// 딜레이 시키기. (Thread.sleep())
				Thread.sleep(1000);// 1초간 딜레이
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

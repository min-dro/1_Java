package com.kh.thread.practice2;
/*
 	- Increment 클래스
 		필드		: -num:int
 		생성자 : +Increment(num:int)
 		메소드 : +run():void
 		1부터 num 까지 정수를 2씩 증가시킴
 		증가 후 출력 0.05초마다 반복
 */
public class Increment implements Runnable{
	private int num;
	
	public Increment(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=1; i <= num; i+=2) {
			if (i > 1)  // 증가 후 출력
				System.out.println("Inc:::" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

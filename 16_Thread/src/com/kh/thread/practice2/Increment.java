package com.kh.thread.practice2;
/*
 	- Increment Ŭ����
 		�ʵ�		: -num:int
 		������ : +Increment(num:int)
 		�޼ҵ� : +run():void
 		1���� num ���� ������ 2�� ������Ŵ
 		���� �� ��� 0.05�ʸ��� �ݺ�
 */
public class Increment implements Runnable{
	private int num;
	
	public Increment(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i=1; i <= num; i+=2) {
			if (i > 1)  // ���� �� ���
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

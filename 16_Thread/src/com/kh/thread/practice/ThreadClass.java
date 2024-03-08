package com.kh.thread.practice;


// 1. Thread Ŭ���� ���
public class ThreadClass extends Thread {
	private String name;
	public ThreadClass(String name) {
		this.name = name;
	}
	// run �޼ҵ带 �������̵�
	// �������̵� �ڵ��ϼ� ����Ű: Alt + Shift + s -> V
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			// this.getClass() : ���� Ŭ���� ����
			System.out.println(this.getClass() + ": " + i);
			try {
				// ������ ��Ű��. (Thread.sleep())
				Thread.sleep(1000);// 1�ʰ� ������
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

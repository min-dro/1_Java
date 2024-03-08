package com.kh.thread.practice;

public class Run {
	
	public static void main(String[] args) {
		System.out.println("---- ���α׷� ���� ----");
		
		ThreadClass daemon = new ThreadClass("daemon");
		daemon.setDaemon(true);		// ���� ������ ����
		daemon.setContextClassLoader(null);
	}
	public static void threadTest02() {
		// Thread ��ü 3�� ����
		ThreadClass t1 = new ThreadClass("Thread-01");
		ThreadClass t2 = new ThreadClass("Thread-02");
		ThreadClass t3 = new ThreadClass("Thread-03");
		
		// t3 �����尡 ���� ���� �����ϵ��� ó��
		//	setPriority(�켱������) : �켱���� �⺻ ��(5)
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	public static void threadTest01() {
		System.out.println("** ���α׷� ���� **");
		
		// 1. Thread Ŭ������ ������� ���
//		ThreadClass tc = new ThreadClass();
//		tc.start();
		
		// 2. Runnable �������̽��� ������ ���
		ThreadInterface ti = new ThreadInterface();
		
		Thread t2 = new Thread(ti); // Thread ��ü ���� �� ������ Ŭ���� ����
		t2.start();
		
		// main �����尡 t2 �������� �۾��� ��ٸ��� �Ϸ���? .join()
		try {
			
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("** ���α׷� ���� **");
	}
	
}

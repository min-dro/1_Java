package com.kh.thread;

public class ThreadPractice {
	/*
	 * ������ : ���μ��� �� �۾� ����
	 * 			-> ���μ���: ���� ���� ���α׷�
	 *  * �̱� ������ : �� ���μ��� ���� �ϳ��� ������ ����
	 *  * ��Ƽ ������ : �� ���μ��� ���� ���� ���� ������ ����
	 *  
	 *  * ������ ����
	 *  
	 *  	[1] Thread Ŭ������ ����Ͽ� ����
	 *  		// Thread Ŭ���� ���
	 *  ex) public class Sender extends Thread {
	 *  			// run �޼ҵ� �������̵�
	 *  			@Override
	 *  			public void run() {
	 *  				// ������� ������ �۾�
	 *  			}
	 *  		}
	 *  
	 *  	// �ٸ� Ŭ���� �� �޼ҵ忡�� �����
	 *  	Sender sThread = new Sender();
	 *  	sThread.start();			// ������ ����
	 *  
	 *  	[2] Runnable �������̽� ����(���)
	 *  		// Runnable �������̽� ����
	 *  	ex) public class Receiver implements Runnable {
	 *  			// run �޼ҵ� �������̵�
	 *  			@Override
	 *  			public void run() {
	 *  				// ������� ������ �۾�
	 *  			}
	 *  		}
	 *  
	 *  	// �ٸ� Ŭ���� �� �޼ҵ忡�� �����
	 *  	Receiver rTask = new Receiver();
	 *  	Thread rThread = new Thread(rTask);
	 *  	rThread.start();
	 */
}

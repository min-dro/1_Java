package com.kh.thread.practice2;

public class Decrement implements Runnable {
	private int n1;
	private int n2;
	public Decrement(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run() {
		if(n1>n2) {
			for(;n1>n2;n1--) {
				System.out.println("Dec:::"+n1);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			for(;n2>n1;n2--) {
				System.out.println("Dec:::"+n2);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

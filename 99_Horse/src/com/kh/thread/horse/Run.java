package com.kh.thread.horse;

public class Run {
	public static void main(String[] args) {
		Horse h1 = new Horse("h1", new Rank());
		Horse h2 = new Horse("h2", new Rank());
		Horse h3 = new Horse("h3", new Rank());
		Horse h4 = new Horse("h4", new Rank());
		Horse h5 = new Horse("h5", new Rank());
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		Thread t3 = new Thread(h3);
		Thread t4 = new Thread(h4);
		Thread t5 = new Thread(h5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

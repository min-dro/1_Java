package com.kh.thread.practice2;

public class TestThread {
	public static void main(String[] args) {
		Increment inc = new Increment(0);
		Decrement dec = new Decrement(100, 0);
		
		Thread t1 = new Thread(inc);
		Thread t2 = new Thread(dec);
		
		inc.run();
		dec.run();
	}
}

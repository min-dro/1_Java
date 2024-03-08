package com.kh.thread.horse;

public class Horse implements Runnable {
	String name;
	int meter = 100;
	static int count = 1;
	Rank rank;
	public Horse() {}
	public Horse(String name, Rank rank) {
		this.meter = meter;
		this.name = name;
		this.rank = rank;
	}
	
	@Override
	public void run() {
		for(;meter>0;meter-=20) {
			System.out.println(name + "의 남은 미터수는 "+meter+"미터 입니다");
			try {
				Thread.sleep((int) (Math.random()*3000+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(meter==0) {
			rank.finishLine(name);
		}
	}
}

package com.kh.thread.horse;

public class Rank{
	int rank;
	Horse h = new Horse();
	public Rank() {}
	public void finishLine(String name) {
		if(Horse.count>0) {
			System.out.println(name+"말의 등수는 "+Horse.count+"등 입니다!");
			Horse.count++;
		} 
	}
}

package com.kh.thread.horse;

public class Rank{
	int rank;
	Horse h = new Horse();
	public Rank() {}
	public void finishLine(String name) {
		if(Horse.count>0) {
			System.out.println(name+"���� ����� "+Horse.count+"�� �Դϴ�!");
			Horse.count++;
		} 
	}
}

package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface NotePen {
	// 상수
	public static final boolean PEN_BUTTON = true;
	// 추상메소드
	// 블루투스펜 탑재여부 기능
	boolean bluetoothPen(); // public abstract 생략했으나,
							// 기본적으로 적용됨
}

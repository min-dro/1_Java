package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	// �ʵ�� (����/�ʵ�/�ɹ� ����)
	private String maker;		// ������ ����
	
	// �����ں�
	public SmartPhone() {}
	
	// �޼ҵ��
	public abstract String printInformation();	// �߻�޼ҵ�
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
}

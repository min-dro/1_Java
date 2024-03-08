package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	// ���
	public static final char[] NUMBERPAD = {'1', '2', '3', 
											'4', '5', '6', 
											'7', '8', '9', 
											'*', '0', '#'};
	// �߻�޼ҵ�
	//	- ��ȭ �ɱ� ���
	public abstract String makeCall();
	
	//	- ��ȭ �ޱ� ���
	public abstract String takeCall();
}

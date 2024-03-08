package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	// ���: ����
	//	- ����� ���� Phone �������̽��� ���(NUMBERPAD)�� 
	//							���� ��ó�� ���ǰ� �� ����
	
	// 	�߻�޼ҵ�
	//	- ����� ���� Phone �������̽��� makeCall, takeCall() �޼ҵ��
	//			   Camera �������̽��� picture() �޼ҵ带 ���ǰ� �� ����
	//	- ���� ��� ���
	public abstract String charge();
}

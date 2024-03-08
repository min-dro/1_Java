package com.kh.practice.numRange.exception;

// ����Ŭ���� : <<exception>>
//	[1] Exception Ŭ���� ��� (�ʼ�)
//			-> Exception: �ڹٿ��� �����ϴ� �⺻ Ŭ����
//	[2] ������ ���� : �Ű�����  1��(���ڿ�
public class NumRangeException extends Exception {
	public NumRangeException() {}
	
	public NumRangeException(String msg) {
		super(msg);
	}
}

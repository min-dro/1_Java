package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	// ������
	public NumberController() {}
	
	// �żҵ�
	public boolean checkDouble(int num1, int num2)
		throws NumRangeException{
		
		
		// ������ �ش��ϴ� ���ǽ� : ��� ���ǽ��� true���� ���ǽ� ��� true
		/*****
		if ((1 <= num1 && num1 <= 100 ) && (1 <= num2 && num2 <= 100)) {
			return num1 % num2 == 0;
		}
		
		throw new NumRangeException("1���� 100 ������ ���� �ƴմϴ�.")
		*****/
		// ������ ��� ���ǽ� :: �ϳ��� true�� ���ǽ� ��� true
				if (num1 < 1 || num1 > 100 || num2 < 1 || num2 > 100) {
					// ���� ��� ���Ѿ���!
					throw new NumRangeException("1���� 100 ������ ���� �ƴմϴ�.");
				}
		// num1�� num2�� �������  : ������ ������(%)
		// �ƴϸ� ����� �ƴ�.
		//
		
		boolean result = (num1 % num2 == 0);
		return result;
		
	}
}

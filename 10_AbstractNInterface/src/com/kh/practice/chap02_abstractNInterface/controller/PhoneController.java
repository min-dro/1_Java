package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;
public class PhoneController {
	// �ʵ��(����/�ʵ�/�ɹ�����)
	private String[] result = new String[2];
	
	// �����ں�: ���� => �⺻������(public Phonecontroller() {})�� �ڵ����� ����
	
	// �޼ҵ��
	public String[] method() {
		Phone[] phArr = new Phone[2];
		
		phArr[0] = new GalaxyNote9();	// �迭�� ù��° ��ġ��
										// GalaxyNote9 Ŭ������ ��ü ����
		phArr[1] = new V40();			// �迭�� �ι�° ��ġ��
										// V40 Ŭ������ ��ü ����
		
		for(int i=0; i<phArr.length; i++) {
			int rIndex = 0;
			// instanceof : i��°�� ��ġ�� �ִ� ���������� � ��ü�� �����ϰ� �ִ��� Ȯ��
			//					  � ��ü�� �����ϰ� �ִ��� Ȯ��
			if(phArr[i] instanceof GalaxyNote9) {
				result[rIndex] = ((GalaxyNote9)phArr[i]).printInformation();
				rIndex++;
				// (GalaxyNote9(phArr[i]))�� V40 Ŭ���� ��ü�� ���������� GalaxyNote9 Ŭ���� Ÿ������ �� ��ȯ(�ٿ�ĳ����)
			} else if(phArr[i] instanceof V40) {
				// i��°�� ��ġ�� ��������(phArr[i])
				result[rIndex] = ((V40)phArr[i]).printInformation();
			}
		}
		return result;
	}
}

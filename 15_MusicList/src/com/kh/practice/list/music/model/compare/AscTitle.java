package com.kh.practice.list.music.model.compare;

import java.util.Comparator;
// ����Ʈ ���� ���� Ŭ����
//	[1] Comparator �������̽� ���� ����
//	[2] comparator �޼ҵ带 ������
public class AscTitle implements Comparator {
	// �������̵� �ڵ� �ϼ� ����Ű : Alt + Shift + S / V
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		// Title�� ������������ ����
		//	����/�Ǽ�
		//	* �������� : o1 - o2
		//	* �������� : o2 - o1
		
		//	���ڿ��� ���
		//	* �������� : o1.getTitle().compareTo(o2.getTitle())
		//	* �������� : o2.getTitle().compareTo(o1.getTitle())
		if(o1 > o2) {
			return o2 - o1;
		} else if (o1 == String && o2 == String) {
			return o2.getTitle().compareTo(o1.getTitle());
		} else {
			return 0;
		}
	}

	
}

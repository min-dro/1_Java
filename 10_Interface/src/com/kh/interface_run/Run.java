package com.kh.interface_run;

import com.kh.interface_practice.Print;
import com.kh.interface_practice.SamsungPrint;

public class Run {
	
	public static void main(String[] args) {
		
		// �߻� Ŭ���� ���� �׽�Ʈ
		
		// (1) �߻� Ŭ������ ��ü ���� �Ұ�.
		// Print prt = new Print();		// �߻� Ŭ�����δ� �ν��Ͻ� ���� �Ұ�
		
		// (2) �߻� Ŭ������ ��� ���� SamsungPrint Ŭ���� ���� �� ��ü ����
		SamsungPrint sPrt = new SamsungPrint();
		sPrt.printTest3();				// �޼ҵ常 ȣ�Ⱑ��
		sPrt.colorPrint();
		
		// (3) �߻� Ŭ������ �������� Ÿ������ ��� ����.
		Print prt2 = new SamsungPrint();
		prt2.colorPrint();				// �������ε��� �����. (SamsungPrint Ŭ�������� �����ǵ� ������ �����)
		// prt2.printTest2();			// printTest2() : ����������(default)- ���� ��Ű�� ������ ����(���)
										//	���� Run Ŭ������ ��Ű�� ��ΰ� SamsungPrint�� �ٸ��� ������ ��� �Ұ�
		// prt2.printTest();			// printTest() : ����������(protected) - ���� ��Ű�� �� �Ǵ� ��Ӱ���
										// Run Ŭ������ ��Ű���� ��ε� �ٸ���, ��Ӱ��赵 �ƴϹǷ� ���Ұ�
	}
}

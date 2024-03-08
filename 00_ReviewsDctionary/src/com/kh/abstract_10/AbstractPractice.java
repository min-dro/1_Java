package com.kh.abstract_10;

abstract class Printer {
	// -ERROR:int=-999_999_999 (����)
	private static final int ERROR = 999_999_999;
	// ERROR �ʵ��� getter/setter
	public int getError() {
		return ERROR;
	}
	// setter...? : ���޹��� ������ �ʵ��� ���� ����(����)
	//	ERROR �ʵ�� ����� setter ��� �Ұ�
	
	// +colorPrint(rgb:int):void (�����)
	public abstract void colorPrint(int rgb);
}

class LGPrinter extends Printer{
	@Override
	public void colorPrint(int rgb) {
		System.out.println(rgb + "���� ");
	}
}

public class AbstractPractice {
	/*
	 * �߻� (abstract) : �̿ϼ�, �ϼ����� ���� ����
	 *  - �߻� Ŭ���� => �ν��Ͻ� ���� �� �� ����!
	 *  	[ǥ����]
	 *  			[����������] abstract class Ŭ������ { }
	 *  
	 *  - �߻� �޼ҵ�
	 *  	[ǥ����]
	 *  			[����������] ��ȯŸ�� �޼ҵ��([�Ű�����]); // �߻� �޼ҵ��� ���� �����ݷ�(;);
	 */
	
	public static void main(String[] args) {
//		
		Printer printer2 = new LGPrinter();
		printer2.colorPrint(666);				// ���� �� �����?
										// ���� ���ε� (Dynamic Binding)
										// �������� ����� ������������ �޼ҵ� ���� �� �ڽ�Ŭ�������� �����ǵ� �޼ҵ尡 ����Ǵ� Ư¡
	}
}

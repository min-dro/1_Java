package com.kh.generic.practice1;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ThreeDPrinrter ��ü ����
		ThreeDPrinter tdp = new ThreeDPrinter();	// L) ThreeDPrinter Ÿ���� �������� ����
													// R) ThreeDPrinter �ν��Ͻ� ���� (�޸𸮿� �Ҵ�)
		
		// Powder ��ü ����
		Powder pow = new Powder();
		// ThreeDPrinter �� setMaterial �޼ҵ带 ����Ͽ� Powder ��ü�� ����
		tdp.setMaterial(pow);		// ==> tdp.setMaterial(new Powder());
									// setMaterial(new Powder());
									// �޼ҵ� ȣ�� �� ������ ������ Ÿ�� : Powder
									// ==> ��ĳ���� (�θ�Ŭ���� Ÿ���� ���������� �ڽ�Ŭ������ �ν��Ͻ��� ����ų �� ����)
		
		
		// �Ǵٸ� Powder ��ü�� ThreeDPrinter �� ������ material �����͸� ������ ����
		Powder pow2 = (Powder) tdp.getMaterial();	// getMaterial �޼ҵ� ��ȯŸ�� : Object
													// ����� �����ϴ� ���� Ÿ�� : Powder
													// ==> �ٿ�ĳ����. �θ�Ŭ���� Ÿ�Կ��� �ڽ�Ŭ���� Ÿ������ ����ȯ �ʿ�.

		
		// (+) ThreeDPrinter ���ʸ� ������ ���� => ThreeDPrinterG Ŭ���� ����
		//	   ���� �����ϰ� Powder ��ü�� ������ �� �ٽ� ������ �ٸ� Powder ��ü ����
		
		// ThreeDPrinterG<Powder> ��ü ����
		ThreeDPrinterG<Powder> tdpG = new ThreeDPrinterG<>();	// ���� Ÿ������ �ν��Ͻ� ���� �� ������ �κп� Ÿ���� ���� ����.
		Powder pow3 = new Powder();
		
		tdpG.setMaterial(pow3);
//		tdpG.setMaterial(new String("Powder"));	// �� ������ ����? ��ü ���� �� Ÿ�� �Ű������� Powder�� �����Ǿ��� ������
												//				�ٸ� Ÿ���� �ν��Ͻ��� ������ �� ����.
		
		Powder pow4 = tdpG.getMaterial();		// �� ����ȯ�� �ʿ� ������? ���� ����. getMaterial() �޼ҵ��� ��ȯŸ���� Powder ����Ǳ� ������
		
	}
}

package com.kh.generic.practice1;

// ����ƽ Ŭ����
public class ThreeDPrinterG<T> {	// <T> : Ÿ�ԸŰ�����
		// �ʵ�
		//  � Ŭ������ Ÿ���̵� �ν��Ͻ� ����
		private T material;		// T: Ÿ�ԸŰ�����

		// getter/setter
		public T getMaterial() {
			return material;
		}

		public void setMaterial(T material) {
			this.material = material;
		};
		
}

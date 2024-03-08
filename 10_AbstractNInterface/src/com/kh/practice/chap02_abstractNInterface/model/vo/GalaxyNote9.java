package com.kh.practice.chap02_abstractNInterface.model.vo;

// SmartPhone Ŭ�������� ����� �ް�, NotePen �������̽��� �����ϴ� GalaxyNote9 Ŭ����
public class GalaxyNote9 extends SmartPhone implements NotePen {
	
	// �ʵ�� : ����
	// - ������� Phone �������̽��� NUMBERPAD ���
	//			NotePen �������̽��� PEN_BUTTON ���
	//			SmartPhone Ŭ������ maker ������ ���(����)
	
	// �����ں�
	public GalaxyNote9() {
		// �θ𿡰� ��ӹ��� maker �ʵ带 "�Ｚ"���� �ʱ�ȭ
		this.setMaker("�Ｚ");
	}
	
	// �޼ҵ��
	//	- ��ӹ��� �߻� �޼ҵ带 ��� �����ؾ� ��.
	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	
	@Override
	public String takeCall() {
		return "���� ��ư�� ����";
	}
	
	@Override
	public String picture() {
		return "1200�� ��� ī�޶�";
	}
	
	@Override
	public String charge() {
		return "���� ����, ���� ���� ����";
	}
	
	@Override
	public String touch() {
		return "������, ������ ����";
	}
	
	@Override
	public boolean bluetoothPen() {
		return this.PEN_BUTTON; // NotePen �������̽��� ���ǵ� ���(�ʱⰪ:true)
	}
	
	@Override
	public String printInformation() {
		String info = "������ ��Ʈ9�� "+ this.getMaker() +"���� ��������� ������ ������ ����\n"
				+ makeCall() + "\n"
				+ takeCall() + "\n"
				+ touch() + "\n"
				+ charge() + "\n"
				+ touch() + "\n"
				+ "�������� �� ž�� ���� : " + bluetoothPen();
		return "";
	}
}

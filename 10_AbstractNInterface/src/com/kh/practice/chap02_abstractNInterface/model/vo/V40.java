package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen {
	public V40() {
		this.setMaker("LG");	// �θ𿡰� ��ӹ��� maker �ʵ带 "LG"�� �ʱ�ȭ
	}
	
	
	
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
		return "1200, 1600�� Ʈ���� ī�޶�";
	}
	
	@Override
	public String charge() {
		return "���� ����, ���� ���� ����";
	}
	
	@Override
	public String touch() {
		return "������";
	}
	
	@Override
	public boolean bluetoothPen() {
		return !this.PEN_BUTTON;	// �ʱⰪ(true)�� ���� => false
	}
	
	@Override
	public String printInformation() {
		String info = "V40�� " + this.getMaker() + "���� ��������� ������ ������ ����,\n"
					+ makeCall() + "\n"
					+ takeCall() + "\n"
					+ picture() + "\n"
					+ charge() + "\n"
					+ touch() + "\n"
					+ "�������� �� ž�� ���� : " + bluetoothPen();
		return info;
	}
}

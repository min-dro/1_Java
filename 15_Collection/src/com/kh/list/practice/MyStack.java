package com.kh.list.practice;

import java.util.ArrayList;

public class MyStack {
	// �ʵ�
	// -arrayStack:ArrayList<String>=new ArrayList<>();
	private ArrayList<String> arrayStack = new ArrayList<>();
	// �޼ҵ�
	// +push(String data):void // ��Ʈ�� data�� �߰�
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// +pop():String			// ��Ʈ�� ������ data�� �����ϰ� �� ���� ��ȯ
								// ����Ʈ�� ��������� "����Ʈ�� ������ϴ�."�� ��ȯ
	// ������ ��ġ : ����Ʈ�� ����...
	public String pop() {
		
		for(int i=0;i<arrayStack.size();i++) {
			if(arrayStack.isEmpty()) {
				return "����Ʈ�� ������ϴ�.";
			} else {
				System.out.println(arrayStack.get(arrayStack.size()-1));
			}
		}
		return arrayStack.remove(arrayStack.size()-1);
	}
}

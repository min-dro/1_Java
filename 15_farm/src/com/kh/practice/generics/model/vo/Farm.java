package com.kh.practice.generics.model.vo;

public class Farm {
	// �ʵ��
	private String kind;
	
	// �����ں�
	public Farm() {}
	
	public Farm(String kind) {
		this.kind = kind;
	}
	
	// �޼ҵ��
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return kind;
	}
	
	@Override
	public int hashCode() {
		return kind.hashCode();		// �ʵ�(kind)�� �ؽð�
	}
	
	// Alt + Shift + s / v
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Farm)
			return this.kind.equals(((Farm)obj).kind);
		return false;
	}
}

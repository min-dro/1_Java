package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{
	private String name;
	public Vegetable() {}
	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();		// �ʵ�(kind)�� �ؽð�
	}
	
	// Alt + Shift + s / v
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Farm)
			return this.name.equals(((Vegetable)obj).name);
		return false;
	}
}

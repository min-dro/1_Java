package com.kh.practice.generics.model.vo;

public class Fruit extends Farm{
	private String name;
	public Fruit() {}
	public Fruit(String kind, String name) {
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
		return name.hashCode();		// 필드(kind)의 해시값
	}
	
	// Alt + Shift + s / v
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Farm)
			return this.name.equals(((Fruit)obj).name);
		return false;
	}
}

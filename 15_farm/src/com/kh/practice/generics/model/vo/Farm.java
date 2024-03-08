package com.kh.practice.generics.model.vo;

public class Farm {
	// 필드부
	private String kind;
	
	// 생성자부
	public Farm() {}
	
	public Farm(String kind) {
		this.kind = kind;
	}
	
	// 메소드부
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
		return kind.hashCode();		// 필드(kind)의 해시값
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

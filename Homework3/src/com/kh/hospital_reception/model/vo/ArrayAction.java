package com.kh.hospital_reception.model.vo;

public interface ArrayAction {
	public abstract void add(String element);
	public abstract void remove(String element);
	public abstract String get(int idx);
	public abstract int find(String element);
	public abstract void print();
}

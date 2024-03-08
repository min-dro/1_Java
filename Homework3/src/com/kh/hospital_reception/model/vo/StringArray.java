package com.kh.hospital_reception.model.vo;

import java.util.Scanner;

public class StringArray implements ArrayAction{
	Scanner sc = new Scanner(System.in);
	protected String[] arr = new String[10];
	@Override
	public void add(String element) {
		System.out.print("(회원등록)회원 명 : ");
		element = sc.nextLine();
		for(int idx=0;idx<arr.length;idx++) {
			if (arr[idx] == null) {
				arr[idx] = element;
				break;
			}
		}
	}

	@Override
	public void remove(String element) {
		for(int idx=arr.length;idx<0;idx--) {
			if (arr[idx] == element) {
				arr[idx] = null;
				break;
			}
		}
	}

	@Override
	public String get(int idx) {
		
		for(idx=0;idx<arr.length;idx++) {
			if (arr[idx] != null) {
				break;
			}
		}
		return arr[idx];
		
	}

	@Override
	public int find(String element) {
		int idx=0;
		if(arr[1] == element) {
			for(;idx<arr.length;idx++) {
				if(arr[idx] == null) {
					break;
				}
			}
			return idx-1;
		}else {
			return -1;
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}

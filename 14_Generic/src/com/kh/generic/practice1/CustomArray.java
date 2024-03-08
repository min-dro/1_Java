package com.kh.generic.practice1;

import java.util.Scanner;

public class CustomArray<T> {
	Scanner sc = new Scanner(System.in);
	protected Object[] arr = new Object[10];

	// get 메소드에 타입 매개변수 적용

	// StringArray 클래스를 확장하여 여러 클래스 타입을 적용할 수 있도록 (제네릭)

	public void add(T element) {
		System.out.print("(회원등록)회원 명 : ");
		element = (T) sc.nextLine();
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx] == null) {
				arr[idx] = element;
				break;
			}
		}
	}

	public void remove(T element) {
		for (int idx = 0; idx < arr.length; idx++) {
			if (arr[idx].equals(element)) {
				arr[idx] = null;
				break;
			}
		}
	}

	public T get(int idx) {
		return (T) arr[idx];
	}

	public int find(T element) {
		int idx = 0;
		for (; idx < arr.length; idx++) {
			if (arr[idx].equals(element)) {
				return idx;
			} 
		}
		return -1;
		
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

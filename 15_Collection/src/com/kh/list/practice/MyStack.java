package com.kh.list.practice;

import java.util.ArrayList;

public class MyStack {
	// 필드
	// -arrayStack:ArrayList<String>=new ArrayList<>();
	private ArrayList<String> arrayStack = new ArrayList<>();
	// 메소드
	// +push(String data):void // 라스트에 data를 추가
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// +pop():String			// 라스트의 마지막 data를 제거하고 그 값을 반환
								// 리스트가 비어있으면 "리스트가 비었습니다."를 반환
	// 마지막 위치 : 리스트의 길이...
	public String pop() {
		
		for(int i=0;i<arrayStack.size();i++) {
			if(arrayStack.isEmpty()) {
				return "리스트가 비었습니다.";
			} else {
				System.out.println(arrayStack.get(arrayStack.size()-1));
			}
		}
		return arrayStack.remove(arrayStack.size()-1);
	}
}

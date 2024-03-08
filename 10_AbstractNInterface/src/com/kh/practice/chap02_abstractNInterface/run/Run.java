package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;
public class Run {
	
	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		
		// foreach��
		for(String item: result) {
			System.out.println(item);
			System.out.println();
		}
	}
}

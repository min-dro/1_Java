package com.kh.practice.chap02;
import java.util.Scanner;
public class LoopPractice {
	/*
	 * 
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		 
		// 화면에 "1이상의 숫자를 입력하세요 : "출력
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt(); // 정수형 데이터를 입력받아 변수에 대입

		// 단, 입력한 수는 1보다 크거니 같아야 합니다.
		if(num >= 1) {
			// 1부터 num까지 숫자를 출력
			for(int i=0; i<num; i++) {
				System.out.print(i + " ");
			}
			/*
			 for(int i=0; i<num; i++) {
			 	System.out.print(i + " ");
			 }
			 */
		} else {	// num < 1
			// "1미만의 값아 입력되었습니다." 출력
			System.out.println("1미만의 값이 입력되었습니다.");
		}
		/*
		 if(num < 1) {
		 	System out println("1미만의 값이 출력되었습니다.");
		 */
	}
	/*
	 * 실습문제 2)
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			// ---------------------------------------- 
			// 화면에 "1이상의 숫자를 입력하세요 : "출력
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt(); // 정수형 데이터를 입력받아 변수에 대입

			// 단, 입력한 수는 1보다 크거니 같아야 합니다.
			if(num >= 1) {
				// 1부터 num까지 숫자를 출력
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
			// ----------------------------------------
		} while (num < 1);
}
	}

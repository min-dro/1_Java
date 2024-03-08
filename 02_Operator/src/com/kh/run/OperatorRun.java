package com.kh.run;

import java.util.Scanner;
/*
 * 연산자 : 프로그램이 실행될 때 연산을 도와주는 것들.
 * - ( 우선순위 ) 와 ( 결핍방향(연산방향) ) 가 중요함!
 * - [1] 직접 접근 연산자 : [] .
 * 	 [2] 단항 연산자     : 부호 연산자 : +, - / 증감연산자 :++, -- / 형뱐환  : (type) / 부정 연산자);
 *   [3] 산술연간자	  : + - *  /(몫) %(나머지)
 *   비트 쉬프트 연산자: << >> (양수:0, 음수: 1) >>> (0)
 *   [4]
 *   [5]
 *   [6] 논리 연산자(비트 연산자) : && || & |
 */
public class OperatorRun {
	public static void main(String[] args) {

	}
	// 증감 연산자 : ++ --
	public static void practice1() {
		// 전위연산: ++(변수)
		int num = 10;
		System.out.println("연산을 수행하기 전 num: " + num);	// 10
		System.out.println("1회 수행 후 num: " + ++num);		// 11
		System.out.println("2회 수행 후 num: " + ++num);		// 12
		System.out.println("3회 수행 후 num: " + ++num);		// 13
		System.out.println("최종 num: " + num);				// 13
		
		System.out.println("===============================");
		// (변수)++
		int num2 = 10;
		System.out.println("연산을 수행하기 전 num2: " + num2);	// 10
		System.out.println("1회 수행 후 num2: " + num2++);		// 10
		System.out.println("2회 수행 후 num2: " + num2++);		// 11
		System.out.println("3회 수행 후 num2: " + num2++);		// 12
		System.out.println("최종 num2: " + num2);				// 13
	}
	
	public static void practice2() {
		int num1 = 10;
		int num2 = 10;
		int result1 = ++num1 * 3; // result1: 33, num1: 11
		int result2 = num2++ * 3; // result2: 30, num2: 11
		
		System.out.printf("num1: %d, result1: $d\n", num1, result1);  // num1: 11, result1
		System.out.printf("num2: %d, result2: $d\n", num2, result2);  // num2: 11, result2
	}
	
	public static void practice3() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);					// 출력값: 10, 출력 후 a: 11
		System.out.println((++a) + (b++));			// 출력값: 32, 출력 후 a: 12, b: 21
						//  ((++11) + (20__))
						//  ( 12 + (20++))
						//  ( 12 + 20 )		// 20++ 해야함!
						//  ( 32 )
		System.out.println((a++) + (--b) + (--c));	// 출력값: 61 , 출력 후 a: 13, b: 20, c: 29
	}
	public static void practice4() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; 		// (++5) + 10 = 6 + 10 = 16, c: 16, a: 6
		int d = c / a;			// 16 / 6 = 2, 				 d:2
		int e = c % a;			// 16 % 6 = 4 ,				 e:4
			
		// a: 6, b: 10, c: 16, d: 2, e: 4
		
		int f = e++;			// (4++)					 		 f: 4, e: 5
			
		int g = (--b) + (d--);	// (--10) + (2--) = 9 + (2--) = 11 , b: 9, g: 11, d: 1
		int h = 2;
			
		// a: 6, b: 9, c: 16, d: 1, e: 5, f: 4, g: 11, h: 2
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//		 (6++) + 9 / (--16 / 4) * (11-- - 1) % (++5 + 2)
		//	   = (6++) + 9 / 3 * 10 % 8			c: 15, g: 10, e: 6
		//	   = (6++) + 3 * 10 % 8
		//     = (6++) + 30 % 8
		//	   = (6++) +6
		//	   = 6 + 6 = 12						i: 12 , a: 7
		
		System.out.println("a: " + a);		// 7
		System.out.println("b: " + b);		// 9
		System.out.println("c: " + c);		// 15
		System.out.println("d: " + d);		// 1
		System.out.println("e: " + e);		// 6
		System.out.println("f: " + f);		// 4
		System.out.println("g: " + g);		// 10
		System.out.println("h: " + h);		// 2
		System.out.println("i: " + i);		// 12
	}
	
	// 논리연산자/비교(관계)연산자
	public static void practice5() {
		// 사용자로부 1 ~ 10사이의 정수를 입력받은 경우 true를 출력하고,
		//	그렇지 않은 경우 false 출력.
		Scanner sc = new Scanner(System.in);
		
		// 화면에 "1 ~ 10 사이의 정수를 입력: " 출력(줄바꿈 없이)
		System.out.print("1 ~ 10 사이의 정수를 입력: ");
		int num = sc.nextInt();
		
		// num의 값이 1, 2, 3, 4, 5 ..., 9, 10 => true
		//	num의 최소값이 1이고, 최대값이 10 이면 true
		//	num의 값이 1보다 크거나 같고, 10보다 작거나 같으면 true
		boolean result = (num >= 1) && (num <= 10);
		
		System.out.printf("입력한 값 %d는 1 ~ 10 사이의 정수입니까? %b", num, result);
	}
	
	public static void practice6() {
		// 사용자로부터 문자(a ~ z, A ~ Z)를 하나 입력 받아
		//  대문자인지 소문자인지 출력
		//  출력 예시 입력한 문자 [a]는 [소문자]입니다.
		//  * [ASCII] a: 97, A: 65
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력: ");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		// 입력 받은 값(ch)이 소문자 범위 포함되는 지 : 97 ~ 122
		String result = (97 <= ch) && (ch <= 122) ? "소문자 입니다." : "소문자가 아닙니다.";
		System.out.println("[1] 입력 값 " + ch + "는 "+ result);
		
		String result2 = ('a' <= ch) && (ch <= 'z') ? "소문자 입니다." : "소문자가 아닙니다.";
		System.out.println("[2] 입력 값 " + ch + "는 "+ result);
		
		String result3 = ('a' <= 97) && ('z' >= 122) ? "소문자" : "소문자가 아닙니다.";
	}
}

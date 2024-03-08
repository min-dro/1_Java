package com.kh.oprerator;
/*
 * 연산자: 프로그램 내에서 연산을 수행하는 기호
 * - 우선순위, 결합망뱡(연산을 수행하는 기호
 * - 우선순위
 * [1] 직접 접근 연산자 : () . []
 * [2] 단항 연산자 : 부호(+ -), 부정(!), 증감(++ --), (type) 형변환
 * 				  ex) 10+, -10, -num
 * [3] 산술 연산자 : + - *(곱하기) /(나누기 몫) %(나머지)
 * 				   우선순위 : * / % > + -
 * [4] 비교 연산자 : > >= <= <
 * 						   : A가 B보다 작은가 ? A < B
 * 					동등비교 : A와 B가 같은가 ? A == B
 * 						   : A와 B가 다른가 ? A != B
 * [5] 논리 연산자 : && ||
 * 				- A && B
 * 							A	  B		A && B 
 * 						   true  true    true
 * 						   true  false	 false
 * 						   false true    false
 * 						   false false   false
 * 					* SCE ? B연산이 수행되지 않는 경우 => A가 false일 떄
 * 				  - A || B: 또는, ~거나
 * 							 A		 B		A || B
 * 							true	true	 true
 * 							true	false	 true
 * 							false 	true 	 true
 * 							false	false	 false
 * 					* SCE ? B연산이 수행되지 않은 경우 => A가 true일떄
 * [6] 삼항연산자
 * 			[표현법]	(조건식) ? (조건식이 참일 때 사용할 값/식) : (조건식이 거짓일 때)
 * 
 * 				ex) String result = (a > 0) ? "양수" : "양수가 아니다";
 * [7] 대입연산자 : = 복합대입연산자(+= *= -= /= %=)
 */

public class operator {

	public static void main(String[] args) {
		// 논리 연산자 (SCE)
		int num = 10;
		boolean bResult = (num < 10) && (num++ > 10);
		System.out.println("bResult: " + bResult + ", num: " + num);
		// bResult: false, num: 10
		
		boolean bResult2 = (num == 10) || (num++ > 10);
		System.out.println("bResult2: " + bResult2 + ", num: " + num);
		// num == 10 : true 이므로 뒤에 num++ > 10 연산이 수행되지 않음. (SCE)
		// bResult2: true, num: 10
		
		// 삼향 연산자
		// (조건식) ? (조건식이 참일 때 사용할 값/식) : (조건식이 거짓일 때 사용할 값/식)
		int n1 = 15;
		
		// n1의 값이 짝수이면 "짝수", 홀수이면 "홀수"를 출력
		// (짝수를 구하는 조건식 n1 % 2 == 0
		String result = (n1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println("n1은 " + result + "입니다.");
	}
}

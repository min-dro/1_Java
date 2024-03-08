package com.kh.practice1.func;

import java.util.Scanner;
public class VariablePractice0 {
	/*
	 * 예제 1)
	 * 변수를 사용하여 아래 코드를 이해하기 쉽도록 변셩하자.
	 * - 연도에 해당하는 값을 정수형(int) 타입의 year이름의 변수로 선언 및
	 * - 나이에 해당하는 값을 정수형(int) 타입의 age이름의 변수로 선언 및 ㄷ
	 */
	public void example01() {
		// 변수를 사용허지 않은 경우
		System.out.println("현재 2023년이고, 나는 올해 36살입니다.");
		
		// 변수 선언 및 대입
		int year;		// year 정수형 변수 선언
		year =2023;		// year 변수에 2023 값을 대입
		int age = 36;	// age 정수형 변수 선언 후 36 값을 대입
		
		// 변수를 사용하여 화면에 출력
		//	1) System.out.print([출력할 값(문자열, 숫자, )]);
		System.out.print("[2] 현재 "+ year +"년이고, 나는 올해 " + age + "살입니다");
		//	2) System.out.println([출력할 값(문자열, 숫자, )]);
		System.out.println("[3]현재 "+ year +"년이고, 나는 올해 " + age + "살입니다");
		//	2) System.out.printf("출력할 값(지시어1, 지시어2, ...)", 변수1, 변수2, ...);
		System.out.printf("[4] 현재 %d년이고, 나는 올해 %d살입니다", year, age);
		
		// 위에 선언한 변수의 값을 올해와 본인의 나이로 변경하여 출력
		year = 2024;
		age = 21;
		System.out.printf("[5] 현재 %d년이고, 나는 올해 %d살입니다", year, age);
		/*
		 * 예제 2) 변수명 명명 규칙
		 * 	잘못 정의된 변수 이름을 확인하여 주석의 괄호 안에 명명 규칙 중 어떤 부분에 해당괴는 지
		 * 	기입한 후 오류가 발생하지 않도록 변경해보자.
		 * 	(1) 대소문자가 구분된다.
		 * 	(2) 예약어를 사용할 수 없다.
		 * 	(3) 숫자로 시작할 수 없다.
		 *  (4) 특수문자는 '_'와 '$'만을 허용한다.
		 * 	(5) 낙타표기법 사용한다.
		 */
	}
	public void example02() {
		 // [1] 변수명 규칙 ( 3 ) 해당
		 int num1 = 10;
		System.out.println("num1의 값은" + num1 + "입니다.");
			
		// [2] 변수명 규칙 ( 2 ) 해당
		boolean $break = true;
		System.out.printf("4break의 값은 %b 입니다.", $break);
			
		// [3] 변수명 규칙 ( 1 ) 해당
		int age;
		int Age = 15;
		age = 20;
		System.out.printf("나이에 해당하는 변수 값 확인 > %d, %d\n", age, Age);
		// 위의 출력 결과 ? [나이에 해당하는 변수 값 확인 > 20, 15]
			
		// [4] 변수명 규칙 ( 4 ) 해당
		int d_day = 5;
		System.out.println("크리스마스까지 " + d_day + "일 남았습니다.");
	}
		/*
		 * 예제 3)
		 * 	키와 몸무게 값을 저장하기 위해 각각 키는 double형의 height이라는 이름으로,
		 *  몸무게는 int형의 weight이라는 이름으로 변수를 선언.
		 *  
		 *  내가 원하는 키와 몸무게의 값을 변수에 대입.
		 *  
		 *  아래와 같이 출력해보자.
		 *  출력 예시) "내가 원하는 키는 168.2cm이고, 몸무게는 48kg입니다."
		 */
	public void example03() {
		// 변수 선언
		double height;
		int weight = 48;
		
		height = 168.2;
			
		System.out.printf("내가 원하는 키는 %.1fcm이고, 몸무게는 %dkg입니다", height, weight);
	}

		/*
		 * 예제 4) 상수
		 * 	놀이동산에 있는 놀이기구의 탑승 제한.
		 * 	제한 몸무게에 대한 값을 상수로 선언.
		 * 	출력 예시) "몸무게가 80kg 이상인 경우 탑승을 못합니다."
		 */
	public void example04() {
		// 상수 선언
		final int LIMIT_WEIGHT = 80;
		// LIMIT_WEIGHT = 99; // 상수는 값을 변경할 수 없다.
		//출력
		System.out.printf("몸무게가 %dkg 이상인 경우 탑승을 못합니다.", LIMIT_WEIGHT);
	}
	/*
	 * 예제 5) 형변환
	 * 	연산을 할 때 자료형의 종류가 다른 경우 형변환이 발생하는데,
	 * 	아래 규칙에 따라 형변환이 발생한다.
	 * 	1) 자료형의 값의 범위가 (작은)방향에서 (큰)방향으로 형변환 발생.
	 * 	2) 정수형과 실수형의 연산 시 (정수)자료형에서 (실수)자료형으로 형변환 발생.
	 */
	public void example05() {
		int num1 = 10;
		double dNum1 = 5.5;
		
		System.out.println(num1 + dNum1);		// 결과 ? 15.5
		System.out.println(num1 + (int)dNum1); // 결과 ? 15
		
		char ch = 'A';
		System.out.println(ch);				// 결과 ? A
		System.out.println((int)ch);		// 결과 ? 65
		
		// 자동 형변환
		System.out.println(ch + 3);			// 결과 ? 68
		//	ch + 3 > (int)ch + 3 > 65 + 3 > 68
		
		// 강제 형변환
		System.out.println((char)(ch + 3));	// 결과 ? D
		//	(ch + 3) > (char)68 > D?
	}
	/*
	 * 예제 6) 입력메소드 : Scanner
	 * 	[예제 3]에 키와 몸무게에 값을 대입했던 것읋 사용자로부터 입력받도록 변경하여
	 *  결과를 출력해보자.
	 *  [Scanner 사용하기 위해 준비 과정]
	 *  1) import java.util.Scanner;
	 *  2) Scanner 생성
	 */
	public void example06() {
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 키에 대한 값을 입력받도록
		System.out.print("원하는 키를 입력하시오: ");
		// 사용자로부터 입력받은 값을 height 변수에 대입
		double height = sc.nextDouble();

		// 몸무게에 대한 값을 출력하고
		System.out.print("원하는 몸무게를 입력하시오: " );
		// 사용자로부터 몸무게의 값을 입력받아 정수형 weight변수에 대입
		int weight = sc.nextInt();
		
		// 출력 예시 "내가 원하는 키는 168.2cm이고, 몸무게는 48kg입니다."
		System.out.println("내가 원하는 키는 " + height + "cm이고, 몸무게는 " + weight + "kg입니다.");
	}
}



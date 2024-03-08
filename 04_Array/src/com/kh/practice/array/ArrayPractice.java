package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	/*
	 * [배열 선언]
	 * 			 자료형[] 변수명 = new 자료형[데이터 길이];
	 */
	public void practice1() {
		// 길이가 10인 정수형(1~10까지 값을 저장) 배열을 선언
		int[] nums = new int[10];
		
		/*
		 * 반복문을 사용하지 않을 경우
		 */
		nums[0] = 1; // nums 배열의 첫번째 위치에 1을 대입
		nums[1] = 2; // nums 배열의 두번째 위치에 2를 대입
		nums[2] = 3; // nums 베열의 세번쨰 위치에 3을 대입
		// ......
		nums[9] = 10;// nums 배열의 마지막 위치(10번쨰) 10을 대입)
		
		// 반복문을 사용해서 첫번재브터 마지막까지 1부터 차례대로 대입
		//	배열 길이 : [참조변수명].length
		for(int a = 0; a < nums.length; a++) {
			nums[a] = a + 1;		// 배열에 값을 대입
		}
		
		for(int a = 0; a < nums.length; a++) {
			System.out.printf("%d ", nums[a]);
		}
	}
	
	public void practice2() {
		// 길이가 10인 정수형 배열 선언
		int[] nums = new int[10];
		// nums.length : 10;
		nums[0] = 10;	// nums.length - index = 10 - 0 = 0
		nums[1] = 9;	// nums.length - index = 10 - 0 = 0
		nums[2] = 8;	// nums.length - index = 10 - 0 = 0
		// ....
		nums[9] = 1;
		
		for(int a = 0; a < nums.length; a++) {
			nums[a] = nums.length - a;
			System.out.printf("%d ", nums[a]);
		}
	}
			
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의정수 : "); 
		int num = sc.nextInt();
		if (num > 0) {
			int[] nums = new int[num];
			for(int i = 0; i < num; i++) {
				nums[i] = i + 1;
				System.out.printf("%d ",nums[i]);
			}
		} else {
			System.out.printf("양수를 입력해주세요");
		}
	}
	 public void practice4() {
		 String[] strs = new String[5];
		 strs[0] = "사과";
		 strs[1] = "귤";
		 strs[2] = "포도";
		 strs[3] = "복숭아";
		 strs[4] = "참외";
		 System.out.println(strs[1]);
	 }
	 
	 /*
	  * 실습문제5)
	  */
	 public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 : "); 
			String inputStr = sc.nextLine();
			
			System.out.print("문자 : "); 
			char inputCh = sc.next().charAt(0);
			
			// 입력받은 문자열을 배열에 문자 하나하나 넣음
			//  문자열 길이 : [문자열 변수 또는 값].length()
			//	배열 길이 : [배열 변수 또는 값].length
			char[] arrCh = new char[inputStr.length()];
			// 입력받은 문자열을 배열에 문자 하나하나 넣음 => 문자형 배열
			for(int i = 0; i<inputStr.length();i++) {
				arrCh[i]= inputStr.charAt(i);
			}
			
			// 배열 데이터 출력 ([값1, 값2 값3, ...] 형식) : Arrays.toString([참조변수명])
			System.out.println(Arrays.toString(arrCh));

			// 입력받는 문자가 문자열에 몇 개가 있는지 카운트
			System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", inputStr, inputCh);
			int cnt = 0;
			for(int i=0; i < arrCh.length; i++) {
				if(arrCh[i] == inputCh) {
					cnt++;
					// 인덱스 위치를 알 수 있음
					System.out.print(i + " ");
				}
			}
			System.out.println();		// 줄바꿈
			System.out.println(inputCh+" 개수 : " + cnt );
	 }
	 
	 public void practice6() {
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 6 사이 숫자 입력 : "); 
			int num = sc.nextInt();
			
			String[] day = new String[7];
			day[0] = "월";
			day[1] = "화";
			day[2] = "수";
			day[3] = "목";
			day[4] = "금";
			day[5] = "토";
			day[6] = "일";
			if (num >= 0 && num <= 6) {
				System.out.println(day[num]);
			} else {
				System.out.print("잘못 입력하셨습니다."); 
			}
			
	 }
	 public void practice7() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 : "); 
			int num = sc.nextInt();
			int[] add = new int[num];
			int total = 0;
			for(int i=0;i<add.length; i++) {
				System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
				int a = sc.nextInt();
				add[i] = a;
				total = total + add[i];
			}
			for(int i=0;i<add.length;i++) {
				System.out.print(add[i]+" "); 
			}
			System.out.println(); 
			System.out.print("총 합 : " + total ); 
	 }

	 /*
	  * 실습문제12)
	  */
	 public void practice12() {
		 // 10개의 값을 저장할 수 있는 정수형 재열 선언 및 할당(생성)
		 int[] numbers = new int[10];
		 
//		 System.out.println(numbers);	// 참조변수명 출력 시 주소값 확인
		 
		 // 1 ~ 10 사이의 난수(랜덤 값)를 발생시켜 배열에 초기화
		 // Math.random() => 0.0 ~ 0.9999 (0 <= n < 1)

		 int random = (int)(Math.random() * 10 + 1);
		 for(int i=0; i < numbers.length; i++) {
			 numbers[i] = random;
		 }
		 
		 // 배열 데이터 중 최대값과 최소값을 출력
		 System.out.println(Arrays.toString(numbers));
		 
		 int max = 0;
		 int min = 0;
		 // 최대값, 최소값을 구하기
		 for(int i=0; i < numbers.length; i++) {
			 // 최대값
			 if (max < numbers[i]) {
				 max = numbers[i];
			 }
			 // 최소값
			 if (min > numbers[i]) {
				 min = numbers[i];
			 }
		 }
		 System.out.println("최대값 : " + max);
		 System.out.println("최소값 : " + min);
		 
		 System.out.println("======================================");
		 
		 // (2) 배열을 오름차순으로 정렬하여 찾기
		 //	 배열 오름차순
		 Arrays.sort(numbers);
		 System.out.println(numbers[numbers.length-1]);
	 }
	 /*
	  * 실습문제14) 로또 번호 자동 생성기 프로그램
	  */
	 public void practice14() {
		 // 당첨 번호: 3 20 28 38 40 43 + 4
		 //  당첨 번호에 
		 int[] winner = new int[] {3, 20, 28 ,38, 40, 43, 4};
		 // 보너스 점수 구현
		 // 로도 번호 : 1 ~ 45
		 //  로또 번호 6자리를 저장할 배열 선언 및 생성
		 int[] lotto = new int[6];
		 
		 // 반복문 돌리면서 랜덤 값을 배열에 초기화
		 //   바깥쪽 for문: 배열에 데이터를 대입
		  for (int i=0; i < lotto.length; i++) {
			  // 0 <= n < 1
			  lotto[i] = (int)(Math.random() * 45 + 1);
			  
			  // 안쪽 for문: 중복값을 확인하기 위해 첫번째위치부터 다시 읽어옴
			  for(int j=0; j < i; j++) {
				  if (lotto[i] == lotto[j]) {
					  // i번째 데이터와 j번째 데이터가 통일하다 (중복데이터가 있다.)
					  i--;
					  break;
				  }
			  }
		  }
		  
		  // 배열 데이터를 오름차순 정렬
		  Arrays.sort(lotto);
		  
		  // 로또 번호 출력
		  int bonus = 0;
		  for(int i=0; i < lotto.length; i++) {
			  System.out.print(lotto[i] + " ");
		  }
		  
		  // 당첨 여부를 체크
		  int cnt=0;
		  boolean bBonus = false;
		  //	바깥쪽 for문: 랜덤값을 저장한 배열의 데이터를 조회 (i: lotto의 인덱스)
		  for(int i=0; i<lotto.length; i++) {
			  
			  // 안쪽 for문: 당첨 번호를 저장한 배열의 데이터를 조회 (j: winner의 인덱스)
			  for(int j=0; j<winner.length; j++) {
				  
				  if(lotto[i] == winner[j]) {
					  cnt++;
					  if (j == winner.length-1) {
						  // lotto 배열의 i번째 데이터와 winner 배열의 j번째 데이터가 동일하고
						  //	j의 값이 winner 배열의 마지막 위치인 경우 수행
						  bBonus = true;
					  }
				  }
			  }
		  }

		  
		  
		  // 당첨 여부를 결과로 출력
		  // 	1등) 6개 번호 일치 : "1등 당첨입니다.", "당첨되지 않았습니다."
		  // 	2등) 5개번호 일치 + 보너스 번호 일치
		  //	3등) 5개 번호 일치
		  //	4등) 4개 번호 일치
		  //	5등) 3개 번호 일치
		  System.out.println("당첨 번호 : " + Arrays.toString(winner));
		  switch(cnt) {
		  case 6:
			  // 2등 ? 1등 ?
			  if(bBonus) { // bBonus(boolean) : true/false
				  System.out.println("2등 당첨입니다.");
			  } else {
				  System.out.println("1등 당첨입니다.");
			  }
			  break;
		  case 5:
			  System.out.println("3등 당첨입니다.");
			  break;
		  case 4:
			  System.out.println("4등 당첨입니다.");
			  break;
		  case 3:
			  System.out.println("5등 당첨입니다.");
			  break;
		  default:
			  System.out.println("당첨되지 않았습니다.");
		  }
	 }

}

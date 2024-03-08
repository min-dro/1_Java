package com.kh.controller;

import java.util.Scanner;
import com.kh.model.vo.User;
public class PlayController {
	private User user = new User("지민석");
	Scanner sc = new Scanner(System.in);
	// method01 : 랜덤값을 뽑아서, 사용자로부터 입력을 받은 뒤
	//			  그 값아 랜덤값보다 크면 "Down" 출력
	//			  작으면 "Up" 출력
	//			  같은 값이면 "Catch!" 출력 User의 score += 10;
	//			  단, 5번의 기회안에 성공해야 점수 획득!
	public void method01() {
		System.out.println("====== Up&Down ======");
		System.out.println(" 1 ~ 50 사이의 숫자 맞추기 ");
		System.out.println("======================");
		
		// Math.random() * (랜덤값의 범위계수) + (시작번호)
		int random = (int)(Math.random() * 50 + 1);
		
		int userScore = user.getScore();
		// --------------
		for(int i=0; i < 5; i++) {
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
		
		
			if(random < num) {
				System.out.println("** Down! **");
			} else if(random > num) {
				System.out.println("** Up! **");
			} else if(random == num) {
				System.out.println("** Catch! **");
				user.setScore(userScore + 10);
				
			} else {
				System.out.println("** Error **");
			}
		}
	}
	
	// method02 : 가위바위보 게임
	//			  랜덤값을 뽑아서 1인 경우 가위,
	//						  2인 경우 바위,
	//						  3인 경우 보. 라고 규칙을 정해놓자. 
	
	// 			  사용자로부터 입력을 받아, 가위 바위 보 결과를 출력
	//			  가위(1) < 바위(2) | 가위(2) > 보(3) | 바위(2) < 보(3) |
	//				사용자가 입력한 기준으로 "승리
	public void method02() {
		System.out.println("====== 가위|바위|보 ======");
		System.out.println(" 1. 가위, 2.바위 3.보 ");
		System.out.println("======================");
		
		// 랜덤값 뽑기 (1 ~ 3)
		int random = (int)(Math.random() * 3 + 1);
		
		System.out.print("선택 : ");
		int sel = sc.nextInt();
		
		/*
		 * 사용자
		 * 사용자
		 * 사용자
		 */
		
		int userScore = user.getScore();
		int iResult = 0;
		
		
		
		// 가위바위보 결과를 체크
		if (sel < random ) {
			if (sel == 1 && random == 3) { // 사용자: 가위, 컴퓨터(랜덤값): 보
				iResult = 1;
			} else {
			iResult = -1;
			}
		} else if (random < sel) {
			if (random == 1 && sel == 3) {
				// 컴퓨터: 가위(1), 사용자: 보(3) => 사용자 패배
				iResult = -1;
			} else {
				iResult = 1;
			}
		}
		// 결과 출력
		if (iResult == 0) {
			System.out.println(" ** 비김! ** ");
		} else if (iResult == 1) {
			System.out.println(" ** 이김! ** ");
			user.setScore(userScore + 10);
		} else {
			System.out.println(" ** 패배! ** ");
			user.setScore(userScore - 10);
		}
		
//		System.out.println("컴퓨터 선택: " + info[random-1]);
//		System.out.println("컴퓨터 선택: " + info[sel-1]);
	}
	
	public void method03(){
		System.out.println("====== 숫자야구 ======");
		System.out.println(" 두자리 숫자를 입력하세요 ");
		System.out.println("======================");
		int random = (int)(Math.random() * 89 + 10);
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		for (int i=0; i < 5; i++) {
		
		}
	}
	
	// getUserInfo : 사용자의 점수 조회(출력)
	public void getUserInfo() {
		System.out.println(user.toString());
	}
}

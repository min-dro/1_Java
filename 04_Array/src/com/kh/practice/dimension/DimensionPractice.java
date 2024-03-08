package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	/*
	 * 실습문제1)
	 */
	public void practice1() {
		// 3행 3열짜리 문자열 배열을 선언 및 할당(생성)
		// 자료형[][] 참조변수형 = new 자료형[행크기][열크기];
		int r = 3;
		int c = 3;
		String[][] arr = new String[r][c];

		// 0행 0열부터 2행 2열까지 "(0, 0)"과 같은 형식으로 저장 후 출력
		for (int i = 0; i < r; i++) { // 바깥쪽 for문 행 인덱스 처리
			// i: 0 1 2
			for (int j = 0; j < c; j++) { // 안쪽 for문: 열 인덱스 처리
				// ㅓ: 0 1 2
				// arr[0][0] / arr[0][1] / arr[0][2]
				// arr[1][0] / arr[1][1] / arr[1][2]
				// arr[2][0] / arr[2][1] / arr[2][2]
				arr[i][j] = "(" + i + ", " + j + ")";

				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
	}

	public void practice2() {
		// 4행 4열짜리 정수형 배열 선언 및 할당
		int[][] arr = new int[4][4];
		int n = 1;
		// 1 ~ 16까지 값을 차례대로 저장
		for (int i = 0; i < 4; i++) { // 바깥쪽 for문 : 행의 인덱스
			for (int j = 0; j < 4; j++) { // 안쪽 for문 : 열의 인덱스
				arr[i][j] = n++;
				// i:0 arr[0][0]: 1 arr[0][1]: 2 arr[0][2]: 3 arr[0][3]: 4
				// i:1 arr[1][0]: 5 arr[1][1]: 6 arr[1][2]: 7 arr[1][3]: 8
				// ....
//				System.out.print(arr[i][j] + " ");
				System.out.printf("%3d ", arr[i][j]); // %3d : 공간 3칸을 마련하여 오른쪽 정렬하여
			}
			System.out.println();
		}
		System.out.println("---------------------------");
	}

	public void practice3() {
		int r = 4;
		int c = 4;
		int num = 16;
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {
				arr[i][j] = num--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int r = 4;
		int c = 4;
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i < 3 && j < 3) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
				} else if (i == 3) {
					arr[3][j] = arr[0][j] + arr[1][j] + arr[2][j] + arr[3][j];
				} else if (j == 3) {
					arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
				}
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		Scanner scanner = new Scanner(System.in);
		int row = 0;
		int col = 0;
		while (true) {
			System.out.print("행 크기 : ");
			row = scanner.nextInt();

			System.out.print("열 크기 : ");
			col = scanner.nextInt();

			// 1 ~ 10 사이의 숫자가 입력되지 않았을 경우 메시지 출력 후 다시 입력하도록
			// [1] ((row < 1 || row > 10) && (col < 1 || col > 10)) // row, col의 범위가 1
			// [2] (!(row
			if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {

				// 입력받은 행의 크기와 열의 크기로 2차원 배열 선언 및 할당
				char[][] charr = new char[row][col];

				// 배열 안에 영어 대문자를 랜덤으로 도입
				// A: 65
				// 0 <= n < 1
				// Math.random() * (필요한 개수) + (시작번호)
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						charr[i][j] = (char) (Math.random() * 26 + 65);
						System.out.print(charr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner scanner = new Scanner(System.in);
		// 사용자에게 행의 크기를 입력받고
		System.out.print("행의 크기 : ");
		int row = scanner.nextInt();

		// 문자형 가변 배열(2차열)을 선언 및 할당
		char[][] arr = new char[row][];

		// 그 값만름 반복해서 열의 크기도 입력 받아

		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int col = scanner.nextInt();
			// i:0 arr[0] = new char[col];
			// i:1 arr[1] = new char[col];
			// ...
			arr[i] = new char[col];
		}
		char ch = 'a';
		// (0,0) ~ (row-1, col..) 까지 'a' ~ .. 대입
		// * 인덱스가 2개 필요 : 행에 대한 인덱스, 열에 대한 인덱스
		for (int i = 0; i < arr.length; i++) { // 2차원 배열(arr)의 길이만큼 == 행의 크기
			for (int j = 0; j < arr[i].length; j++) { // 각 배열의 길이만큼 == 행 별 일의 크기
				// arr[i]
				arr[i][j] = ch++; // ch = ch + 1;
									// = [char]ch + [int]1
									// = (char)[int](ch+1) // 자동형변환
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {

		String[] grade = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int cnt = 0;
		System.out.println("== 1분단 ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = grade[cnt];
				System.out.print(str1[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = grade[cnt];
				System.out.print(str2[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
	}

	public void practice9() {
		Scanner scanner = new Scanner(System.in);
		String[] grade = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int cnt = 0;
		System.out.println("== 1분단 ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = grade[cnt];
				System.out.print(str1[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = grade[cnt];
				System.out.print(str2[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = scanner.nextLine();
		if (name.equals(str1[0][0])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 첫 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str1[0][1])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 첫 번째 줄 오른쪽에 있습니다.");
		} else if (name.equals(str1[1][0])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 두 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str1[1][1])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 두 번째 줄 오른쪽에 있습니다.");
		} else if (name.equals(str1[2][0])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 세 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str1[2][1])) {
			System.out.println("검색하신 " + name + " 학생은 1분단 세 번째 줄 오른쪽에 있습니다.");
		} else if (name.equals(str2[0][0])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 첫 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str2[0][1])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 첫 번째 줄 오른쪽에 있습니다.");
		} else if (name.equals(str2[1][0])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 두 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str2[1][1])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 두 번째 줄 오른쪽에 있습니다.");
		} else if (name.equals(str2[2][0])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 세 번째 줄 왼쪽에 있습니다.");
		} else if (name.equals(str2[2][1])) {
			System.out.println("검색하신 " + name + " 학생은 2분단 세 번째 줄 오른쪽에 있습니다.");
		} else {
			System.out.println("해당 학생은 없습니다.");
		}
	}

	public void practice10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("행 인덱스 입력 : ");
		int r = scanner.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int c = scanner.nextInt();
		char[][] ch = new char[6][6];
		char x = '0';
		char y = '0';
		r += 1;
		c += 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 && j == 0) {
					System.out.print("");
				} else if (i == 0 || j == 0) {
					if (j == 0) {
						ch[i][j] = (char) x++;
					} else {
						ch[i][j] = (char) y++;
					}
				} else if (i == r && j == c) {
					ch[i][j] = 'X';
				} else {
					System.out.print("");
				}
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice11() {
		int r = 0;
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("행 인덱스 입력 : ");
			r = scanner.nextInt();
			if (r == 99) {
				System.out.print("프로그램 종료");
				break;
			} else {
				System.out.print("열 인덱스 입력 : ");
				c = scanner.nextInt();
				char[][] ch = new char[6][6];
				char x = '0';
				char y = '0';
				r += 1;
				c += 1;
				for (int i = 0; i < 6; i++) {
					for (int j = 0; j < 6; j++) {
						if (i == 0 && j == 0) {
							System.out.print("");
						} else if (i == 0 || j == 0) {
							if (j == 0) {
								ch[i][j] = (char) x++;
							} else {
								ch[i][j] = (char) y++;
							}
						} else if (i == r && j == c) {
							ch[i][j] = 'X';
						} else {
							System.out.print("");
						}
						System.out.print(ch[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}

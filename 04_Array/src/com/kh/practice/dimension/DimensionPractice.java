package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	/*
	 * �ǽ�����1)
	 */
	public void practice1() {
		// 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ�(����)
		// �ڷ���[][] ���������� = new �ڷ���[��ũ��][��ũ��];
		int r = 3;
		int c = 3;
		String[][] arr = new String[r][c];

		// 0�� 0������ 2�� 2������ "(0, 0)"�� ���� �������� ���� �� ���
		for (int i = 0; i < r; i++) { // �ٱ��� for�� �� �ε��� ó��
			// i: 0 1 2
			for (int j = 0; j < c; j++) { // ���� for��: �� �ε��� ó��
				// ��: 0 1 2
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
		// 4�� 4��¥�� ������ �迭 ���� �� �Ҵ�
		int[][] arr = new int[4][4];
		int n = 1;
		// 1 ~ 16���� ���� ���ʴ�� ����
		for (int i = 0; i < 4; i++) { // �ٱ��� for�� : ���� �ε���
			for (int j = 0; j < 4; j++) { // ���� for�� : ���� �ε���
				arr[i][j] = n++;
				// i:0 arr[0][0]: 1 arr[0][1]: 2 arr[0][2]: 3 arr[0][3]: 4
				// i:1 arr[1][0]: 5 arr[1][1]: 6 arr[1][2]: 7 arr[1][3]: 8
				// ....
//				System.out.print(arr[i][j] + " ");
				System.out.printf("%3d ", arr[i][j]); // %3d : ���� 3ĭ�� �����Ͽ� ������ �����Ͽ�
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
			System.out.print("�� ũ�� : ");
			row = scanner.nextInt();

			System.out.print("�� ũ�� : ");
			col = scanner.nextInt();

			// 1 ~ 10 ������ ���ڰ� �Էµ��� �ʾ��� ��� �޽��� ��� �� �ٽ� �Է��ϵ���
			// [1] ((row < 1 || row > 10) && (col < 1 || col > 10)) // row, col�� ������ 1
			// [2] (!(row
			if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {

				// �Է¹��� ���� ũ��� ���� ũ��� 2���� �迭 ���� �� �Ҵ�
				char[][] charr = new char[row][col];

				// �迭 �ȿ� ���� �빮�ڸ� �������� ����
				// A: 65
				// 0 <= n < 1
				// Math.random() * (�ʿ��� ����) + (���۹�ȣ)
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						charr[i][j] = (char) (Math.random() * 26 + 65);
						System.out.print(charr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
			}
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" },
				{ "��", "��", "��", "��", "��" }, { "��", "��", "��", "��", "��" }, { "��", "��", "! ", "��", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
		Scanner scanner = new Scanner(System.in);
		// ����ڿ��� ���� ũ�⸦ �Է¹ް�
		System.out.print("���� ũ�� : ");
		int row = scanner.nextInt();

		// ������ ���� �迭(2����)�� ���� �� �Ҵ�
		char[][] arr = new char[row][];

		// �� ������ �ݺ��ؼ� ���� ũ�⵵ �Է� �޾�

		for (int i = 0; i < row; i++) {
			System.out.print(i + "���� �� ũ�� : ");
			int col = scanner.nextInt();
			// i:0 arr[0] = new char[col];
			// i:1 arr[1] = new char[col];
			// ...
			arr[i] = new char[col];
		}
		char ch = 'a';
		// (0,0) ~ (row-1, col..) ���� 'a' ~ .. ����
		// * �ε����� 2�� �ʿ� : �࿡ ���� �ε���, ���� ���� �ε���
		for (int i = 0; i < arr.length; i++) { // 2���� �迭(arr)�� ���̸�ŭ == ���� ũ��
			for (int j = 0; j < arr[i].length; j++) { // �� �迭�� ���̸�ŭ == �� �� ���� ũ��
				// arr[i]
				arr[i][j] = ch++; // ch = ch + 1;
									// = [char]ch + [int]1
									// = (char)[int](ch+1) // �ڵ�����ȯ
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {

		String[] grade = new String[] { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ",
				"ȫ����" };
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int cnt = 0;
		System.out.println("== 1�д� ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = grade[cnt];
				System.out.print(str1[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("== 2�д� ==");
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
		String[] grade = new String[] { "���ǰ�", "������", "�����", "�����", "���̹�", "�ں���", "�ۼ���", "������", "������", "��õ��", "��ǳǥ",
				"ȫ����" };
		String[][] str1 = new String[3][2];
		String[][] str2 = new String[3][2];
		int cnt = 0;
		System.out.println("== 1�д� ==");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = grade[cnt];
				System.out.print(str1[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("== 2�д� ==");
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				str2[i][j] = grade[cnt];
				System.out.print(str2[i][j] + " ");
				cnt++;
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();
		if (name.equals(str1[0][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� ù ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str1[0][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� ù ��° �� �����ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str1[1][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� �� ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str1[1][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� �� ��° �� �����ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str1[2][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� �� ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str1[2][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 1�д� �� ��° �� �����ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[0][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� ù ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[0][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� ù ��° �� �����ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[1][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� �� ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[1][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� �� ��° �� �����ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[2][0])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� �� ��° �� ���ʿ� �ֽ��ϴ�.");
		} else if (name.equals(str2[2][1])) {
			System.out.println("�˻��Ͻ� " + name + " �л��� 2�д� �� ��° �� �����ʿ� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� �л��� �����ϴ�.");
		}
	}

	public void practice10() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �ε��� �Է� : ");
		int r = scanner.nextInt();
		System.out.print("�� �ε��� �Է� : ");
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
			System.out.print("�� �ε��� �Է� : ");
			r = scanner.nextInt();
			if (r == 99) {
				System.out.print("���α׷� ����");
				break;
			} else {
				System.out.print("�� �ε��� �Է� : ");
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

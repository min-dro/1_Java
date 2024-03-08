package com.kh.practice.chap02;

public class ControlPractice2 {
	public static void main(String[] args) {
		//gugudan();
		gugudan1();
	}
	
	public static void gugudan() {
		// �ٱ��� for�� : X��
		// ���� for�� : �������� ��
		// for(�ʱ��;���ǽ�;������) {}
		for(int dan=2; dan < 10; dan++) {
			// dan: 2, 3, 4, ..., 9
			for(int n=1; n < 10; n++) {
				// n: 1, 2, 3, ..., 9
				System.out.printf("%d x %d = %d\n", dan, n, dan*n);
			}
		}
	}
	public static void gugudan1() {
		for(int n=1; n < 10; n++) {
			for(int dan=2; dan < 10; dan++) {
				System.out.printf("%d x %d = %2d ", dan, n, dan*n);
			}
			System.out.println();
		}
	}
}

package com.kh.practice.chap01_poly.run;

import java.util.Scanner;

import com.kh.practice.chap01_poly.model.vo.*;
import com.kh.practice.chap01_poly.view.LibraryMenu;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		LibraryMenu lm = new LibraryMenu();
		lm.mainMenu();
		
	}
	public void practice2() {
		// ���� ���� ���α׷�
				// 	��ȭå(AniBook), �丮å(CookBook)
				
				//	�뿩 ���
				Book[] bArr = new Book[10];
				AniBook[] abArr = new AniBook[3];
				CookBook[] cbArr = new CookBook[3];
				
				System.out.println("===== �뿩�� å�� �����Ͻÿ� =====");
				System.out.println("1. ��ȭå");
				System.out.println("2. �丮å");
				System.out.println("3. �Ҽ�å");
				System.out.println("���� > ");
				int select = sc.nextInt();
				
				// �뿩�ϴ� ��� ��ü ����
				for(int i=0; i<bArr.length; i++) {
					if(bArr[i] == null) {
						if(select == 1) {
							bArr[i] = new AniBook();
//							if (bArr[i] instanceof)
						} else if (select == 2){
							
							
						}
					}
				}

//			}
//				Book b1 = new AniBook();
				// Book : �� 3���� �ʵ�(title, author, publisher)
				// AniBook : �� 4���� �ʵ� (title, author, publisher, accessAge)
//				System.out.println(b1.toString());		// ���? (4)���� �ʵ� ����
												// �ʵ� ������ 3���� Ȯ�� �� ���̶� ����������,
												// �� 4���ʵ� ������ Ȯ�εǾ���.
												// => ���۹��ε��� ���� ��Ӱ����� �������� ����� Ŭ������
												//	  �޼ҵ尡 �������̵� �Ǿ�, �������̵��� �ڵ尡 ����Ǿ����Ƿ�
												// 	  �� 4�� �ʵ� ������ Ȯ�ε�.
				
				// b1.getAccessAge();	// ���� �߻� ����? �������� Ÿ���� �θ�Ŭ������ Book���� ������ �Ǿ� �־�
										//				�ڽ�Ŭ����(AniBook)�� ���� �߰��� �޼ҵ�� ������ �Ұ�.
				
				// getAccessAge() �޼ҵ带 ȣ���Ϸ���? �ٿ�ĳ����..
				//	instanceof: �ٿ�ĳ���� �� ���������� �ش� �ν��Ͻ��� ������ �ּҸ� ������ �ִ� �� Ȯ���ϴ� ������
//				if (b1 instanceof AniBook) {
					
				}
//	}
	public void practice1(){
		// ���� ���� ���α׷�
				// 	��ȭå(AniBook), �丮å(CookBook)
				
				//	�뿩 ���
		AniBook[] abArr = new AniBook[3];
		CookBook[] cbArr = new CookBook[3];
		
		System.out.println("===== �뿩�� å�� �����Ͻÿ� =====");
		System.out.println("1. ��ȭå");
		System.out.println("2. �丮å");
		System.out.println("���� > ");
		int select = sc.nextInt();
		if(select == 1) {
			for(int i=0; i<abArr.length; i++) {
				
			}
		}
		Book b1 = new AniBook();
		// Book : �� 3���� �ʵ�(title, author, publisher)
		// AniBook : �� 4���� �ʵ� (title, author, publisher, accessAge)
		System.out.println(b1.toString());		// ���? (4)���� �ʵ� ����
										// �ʵ� ������ 3���� Ȯ�� �� ���̶� ����������,
										// �� 4���ʵ� ������ Ȯ�εǾ���.
										// => ���۹��ε��� ���� ��Ӱ����� �������� ����� Ŭ������
										//	  �޼ҵ尡 �������̵� �Ǿ�, �������̵��� �ڵ尡 ����Ǿ����Ƿ�
										// 	  �� 4�� �ʵ� ������ Ȯ�ε�.
		
		// b1.getAccessAge();	// ���� �߻� ����? �������� Ÿ���� �θ�Ŭ������ Book���� ������ �Ǿ� �־�
								//				�ڽ�Ŭ����(AniBook)�� ���� �߰��� �޼ҵ�� ������ �Ұ�.
		
		// getAccessAge() �޼ҵ带 ȣ���Ϸ���? �ٿ�ĳ����..
		//	instanceof: �ٿ�ĳ���� �� ���������� �ش� �ν��Ͻ��� ������ �ּҸ� ������ �ִ� �� Ȯ���ϴ� ������
	}
}

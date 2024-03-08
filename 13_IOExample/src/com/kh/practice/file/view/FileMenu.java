package com.kh.practice.file.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// �ʵ�
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	// �޼ҵ�
	public void mainMenu() {
			while(true) {	// ���ѹݺ�.. (��, ����ڰ� 9 �Է� �� �޼ҵ� ����)
			System.out.println("***** My Note *****");
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9, ������");
			System.out.print("�޴� ��ȣ : ");
			
			int select = sc.nextInt();
			sc.nextLine();			// �ٷ� ���� �Է��� nextLine()�� ����ϸ�, ���ۿ� (\n)�� �����ֱ� ���� ȣ����
			
			switch(select) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;		// switch�� ����
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;		// �޼ҵ� ����
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder("");
		String fileName = null;
		char choose = (Character) null;
		while(true) {                                                   
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String contents = sc.nextLine(); 
			sb.append(contents);
			if (contents.equals("ex��it")){		// equals() : ���ڿ� �� ��
				
				while(true) {
					System.out.print("������ ���� ���� �Է����ּ���(ex. myfile.txt) : ");
					fileName = sc.nextLine();
					
					if (fc.checkName(fileName) ){
						System.out.print("�̹� �����ϴ� �����Դϴ�, ����ðڽ��ϱ�?");
						choose = sc.next().charAt(0);
						if(choose == 'y' || choose == 'Y'){
							fc.fileSave(fileName, sb);	// �޼ҵ�� ���ϸ��� StringBuilder �ѱ�
							break;				
						}
						/********
						 // ���ڸ� �񱳿����� ���
						 char yn = sc.next().charAt(0);
						 if( yn == 'y' || yn == 'Y'){}
						 ********/
					}
				}
				
			} else {
				fc.fileSave(fileName, sb);
				break;
			}
		}
	}
	public void fileOpen() {
		System.out.println("�� ���� �� : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			String result = fc.fileOpen(fileName).toString();
			
			System.out.println(result);
		} else {
			
		}
		
	}
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName))
		{
			StringBuilder sb = new StringBuilder("");
			while(true) {                                                   
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String contents = sc.nextLine(); 
				sb.append(contents);
				
				if (contents.equals("ex��it")){		// equals() : ���ڿ� �� ��
					
					fc.fileEdit(fileName, sb);
					break;			// ���� ���� �� �޼ҵ� ����
				}
			}
		}
	}
}

package com.kh.practice.file.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	// 메소드
	public void mainMenu() {
			while(true) {	// 무한반복.. (단, 사용자가 9 입력 시 메소드 종료)
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9, 끝내기");
			System.out.print("메뉴 번호 : ");
			
			int select = sc.nextInt();
			sc.nextLine();			// 바로 다음 입력이 nextLine()울 사용하며, 버퍼에 (\n)을 지워주기 위해 호출함
			
			switch(select) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;		// switch문 종료
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;		// 메소드 종료
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder("");
		String fileName = null;
		char choose = (Character) null;
		while(true) {                                                   
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String contents = sc.nextLine(); 
			sb.append(contents);
			if (contents.equals("ex끝it")){		// equals() : 문자열 값 비교
				
				while(true) {
					System.out.print("저장할 파일 명을 입력해주세요(ex. myfile.txt) : ");
					fileName = sc.nextLine();
					
					if (fc.checkName(fileName) ){
						System.out.print("이미 존재하는 파일입니다, 덮어쓰시겠습니까?");
						choose = sc.next().charAt(0);
						if(choose == 'y' || choose == 'Y'){
							fc.fileSave(fileName, sb);	// 메소드로 파일명과 StringBuilder 넘김
							break;				
						}
						/********
						 // 문자를 비교연산자 사용
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
		System.out.println("열 파일 명 : ");
		String fileName = sc.nextLine();
		
		if (fc.checkName(fileName)) {
			String result = fc.fileOpen(fileName).toString();
			
			System.out.println(result);
		} else {
			
		}
		
	}
	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName))
		{
			StringBuilder sb = new StringBuilder("");
			while(true) {                                                   
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				String contents = sc.nextLine(); 
				sb.append(contents);
				
				if (contents.equals("ex끝it")){		// equals() : 문자열 값 비교
					
					fc.fileEdit(fileName, sb);
					break;			// 파일 저장 후 메소드 종료
				}
			}
		}
	}
}

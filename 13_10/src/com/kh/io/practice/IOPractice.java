package com.kh.io.practice;

import java.io.*;

public class IOPractice {
	public static void main(String[] args) {
	
	}
	public static void fileReaderTest() {
		// (4) 파일 입력 : FileReader (문자 단위)
		FileReader fr = null;		// FileReader 참조변수를 null로 초기화
		
		try {
			
			fr = new FileReader("test2.txt");
			
			int result;
			char[] buffer = new char[1024]; // 2의 10승..> 1024
			
			while((result = fr.read(buffer)) != -1) {	// .read(buffer) : 메소드 호출 결과 닶 : 읽어 온 데이터 길이
														//	  * buffer : 파일에서 읽은 데이터가 저장됨
				String fileData =  new String(buffer, 0, result);
								// new String(char[], offset, count) : offset(시작위치), count(데이터길이)
				System.out.println(fileData);			// 읽어 온 데이터를 콘솔창에 출력
			}
			
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) fr.close();
			} catch(IOException e) {
				System.out.println("finally 부분에서 Exception 발생");
			}
		}
	}
	public static void fileWriteTest() {
		// (3) 파일 출력 : FileWriter (문자 단위)
		FileWriter fw = null;		// FileWriter 참조변수를 null로 초기화
		try {
			
			fw = new FileWriter("test2.txt");
			fw.write("안녕하세요.\n");			// FileWriter 클래스는 문자 단위로 출력이 가능해서
			fw.write("나는 임수진입니다.");		//	문자열을 쓸 수 있음.
											//	이스케이프 문자(\n, \t) 적용됨
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
			} catch(IOException e) {}
		}
	}
	
	public static void fileInputStreamTest() {
		// (2) 파일 입력 : FileInputStream (바이트 단위)
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("test.txt");		// 상대경로 : 파일명만 작성한 경우 프로젝트 상위경로에 생성/읽음
			
			int i;
			while((i = fis.read()) != -1) {	// i 라는 변수에 파일에서 읽어온 값을 저장하고, 그 값이 -1이 아닌지 미교
				System.out.println(i);		// 파일에서 읽어온 값 (i)을 출력
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
			} catch(IOException e) {}
		}
	}
	public static void fileOutputStreamTest() {
		// (1) 파일 출력 : FileOutStream (바이트 단위)
		FileOutputStream fos = null; // FileOutputStream 참조변수 선언 후 null로 초기화
		try { // 파일 관련 클래스 사용 시 IQException 예외처리가 "필수"이므로 try~catch문 사용

			fos = new FileOutputStream("test.txt"); // FileOutputStream

			fos.write(10); // write() : 파일에 데이터를 쓸 떄 사용하는 메소드
			fos.write(50);
			fos.close(); // close() : 스트림 사용 후 닫아주는 메소드

		} catch (FileNotFoundException e) { 	// FileOutputStream 객체 생성 시 발생가능란 예외
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // write(), close(), .. 메소드 사요 시 발생가능한 예외
			e.printStackTrace();
		} finally {
			// 프로그램 중간에 예외 발생 시 스트림이 닫히지 않는 경우 닫아주기 위해 작성
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {}
		}
	}
}
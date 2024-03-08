package com.kh.io.practice.log;

public class LogTest {
	public static void main(String[] args) {
		FileDAO log = new FileDAO();
		// 파일 생성
//		log.acess("log.txt" , 1);
		
		// 예외 처리
		int[] arr = new int[3];
		
		for(int i=0; i<4; i++) {
			arr[i] = i;
		}
//	} catch(ArrayIndexOutOfBoundsException e) {
//		System.out.print("");log.write();("[Exception]" + e.getMessage() + "\n"));	// getMessage() 예외 관련 메시지
		
		
//	}finally {
		System.out.println("try ~catch 종료");
//		log.close(1);		// (*) close를 하지 않으면 파일 관련 처리가 완료되지 않음.
	}
}

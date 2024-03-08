package com.kh.io.practice.log;

import java.io.*;

// DAO : Data Access Object
public class FileDAO {
	// 필드 (변수)
	// -reader:FileReader=null
	// -writer:FileWriter=null
	// -f:File=null
	// -READ_SIZE:int=1024
	private FileReader reader = null;
	private FileWriter writer = null;
	private File f =null;
	private int READ_SIZE=1024;
	
	// 기능 (메소드)
	// 파일 접근 (acess(filepath:String) : void throws IOException)
	//	type: 0 (입력) 1 (출력)
	public void acess(String filepath, int type) throws IOException{
		// 스트림 클래스를 생성
		if(type == 0 && reader == null) {
			reader = new FileReader(filepath);
		}
		
		if(type == 1 && writer == null) {
			writer = new FileWriter(filepath);
		}
	}
	
	// 파일 닫기 (close() : void)
	public void close(int type) throws IOException {
		try {
			// 입력 스트림 닫기
			if(type == 0 && reader != null) reader.close();
		
			// 출력 스트림 닫기
			if(type == 1 && writer != null) writer.close();
		} catch (IOException e) {
			
		}
	}
	
	// 파일 읽기 (read():StringBulider)
	public String read() {
		// 반환 타입은 String, 내부적으로 StringBuilder를 사용
		StringBuilder sb = new StringBuilder();
		if (reader != null) {
			char[] buffer = new char[READ_SIZE];
			int length;
			try {
				while((length = reader.read(buffer)) != -1) {
//					sd.append(buffer);	// char[] 타입의 데이터로 문자열 변경(합치기)
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		// 예외 발생 시 오류 내용 출력
			}
		}
		
		return sb.toString();
	}
	// 파일 쓰기 (write(data:String) : boolean)
	public boolean write(String data) {
		System.out.println(data);
		if (writer != null) {
			boolean b = true;
			try {
				writer.write(data);
			} catch(IOException e) {
				e.printStackTrace();
				b = false;
			}
			
			return true;
		} else {
			// 스트림이 닫혀있는 경우
			return false;
		}
	}
	
	// 파일 존재 유무 확인 (isExistFile(filpath:String):boolean
	public boolean isExisrFile(String filepath) {
		// 파일의 정보(파일명/마지막수정시간/위치) 확인할 떄 사용 클래스: File
		f = new File(filepath);
		return f.exists();		// exists() : 파일이 존재하는 지 확인하는 메소드
	}
	
	// 경로의 파일 개수 조회 (getfilesCount(filepath:String) : int)
	public int getFilesCount(String filepath) {
		f = new File(filepath);
//		FilenameFilter ff = new FilenameFilter();
		return f.list().length;
	}
}

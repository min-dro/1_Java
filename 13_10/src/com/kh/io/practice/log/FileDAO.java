package com.kh.io.practice.log;

import java.io.*;

// DAO : Data Access Object
public class FileDAO {
	// �ʵ� (����)
	// -reader:FileReader=null
	// -writer:FileWriter=null
	// -f:File=null
	// -READ_SIZE:int=1024
	private FileReader reader = null;
	private FileWriter writer = null;
	private File f =null;
	private int READ_SIZE=1024;
	
	// ��� (�޼ҵ�)
	// ���� ���� (acess(filepath:String) : void throws IOException)
	//	type: 0 (�Է�) 1 (���)
	public void acess(String filepath, int type) throws IOException{
		// ��Ʈ�� Ŭ������ ����
		if(type == 0 && reader == null) {
			reader = new FileReader(filepath);
		}
		
		if(type == 1 && writer == null) {
			writer = new FileWriter(filepath);
		}
	}
	
	// ���� �ݱ� (close() : void)
	public void close(int type) throws IOException {
		try {
			// �Է� ��Ʈ�� �ݱ�
			if(type == 0 && reader != null) reader.close();
		
			// ��� ��Ʈ�� �ݱ�
			if(type == 1 && writer != null) writer.close();
		} catch (IOException e) {
			
		}
	}
	
	// ���� �б� (read():StringBulider)
	public String read() {
		// ��ȯ Ÿ���� String, ���������� StringBuilder�� ���
		StringBuilder sb = new StringBuilder();
		if (reader != null) {
			char[] buffer = new char[READ_SIZE];
			int length;
			try {
				while((length = reader.read(buffer)) != -1) {
//					sd.append(buffer);	// char[] Ÿ���� �����ͷ� ���ڿ� ����(��ġ��)
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		// ���� �߻� �� ���� ���� ���
			}
		}
		
		return sb.toString();
	}
	// ���� ���� (write(data:String) : boolean)
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
			// ��Ʈ���� �����ִ� ���
			return false;
		}
	}
	
	// ���� ���� ���� Ȯ�� (isExistFile(filpath:String):boolean
	public boolean isExisrFile(String filepath) {
		// ������ ����(���ϸ�/�����������ð�/��ġ) Ȯ���� �� ��� Ŭ����: File
		f = new File(filepath);
		return f.exists();		// exists() : ������ �����ϴ� �� Ȯ���ϴ� �޼ҵ�
	}
	
	// ����� ���� ���� ��ȸ (getfilesCount(filepath:String) : int)
	public int getFilesCount(String filepath) {
		f = new File(filepath);
//		FilenameFilter ff = new FilenameFilter();
		return f.list().length;
	}
}

package com.kh.io.practice;

import java.io.*;

public class IOPractice {
	public static void main(String[] args) {
	
	}
	public static void fileReaderTest() {
		// (4) ���� �Է� : FileReader (���� ����)
		FileReader fr = null;		// FileReader ���������� null�� �ʱ�ȭ
		
		try {
			
			fr = new FileReader("test2.txt");
			
			int result;
			char[] buffer = new char[1024]; // 2�� 10��..> 1024
			
			while((result = fr.read(buffer)) != -1) {	// .read(buffer) : �޼ҵ� ȣ�� ��� �� : �о� �� ������ ����
														//	  * buffer : ���Ͽ��� ���� �����Ͱ� �����
				String fileData =  new String(buffer, 0, result);
								// new String(char[], offset, count) : offset(������ġ), count(�����ͱ���)
				System.out.println(fileData);			// �о� �� �����͸� �ܼ�â�� ���
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
				System.out.println("finally �κп��� Exception �߻�");
			}
		}
	}
	public static void fileWriteTest() {
		// (3) ���� ��� : FileWriter (���� ����)
		FileWriter fw = null;		// FileWriter ���������� null�� �ʱ�ȭ
		try {
			
			fw = new FileWriter("test2.txt");
			fw.write("�ȳ��ϼ���.\n");			// FileWriter Ŭ������ ���� ������ ����� �����ؼ�
			fw.write("���� �Ӽ����Դϴ�.");		//	���ڿ��� �� �� ����.
											//	�̽������� ����(\n, \t) �����
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
		// (2) ���� �Է� : FileInputStream (����Ʈ ����)
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("test.txt");		// ����� : ���ϸ��� �ۼ��� ��� ������Ʈ ������ο� ����/����
			
			int i;
			while((i = fis.read()) != -1) {	// i ��� ������ ���Ͽ��� �о�� ���� �����ϰ�, �� ���� -1�� �ƴ��� �̱�
				System.out.println(i);		// ���Ͽ��� �о�� �� (i)�� ���
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
		// (1) ���� ��� : FileOutStream (����Ʈ ����)
		FileOutputStream fos = null; // FileOutputStream �������� ���� �� null�� �ʱ�ȭ
		try { // ���� ���� Ŭ���� ��� �� IQException ����ó���� "�ʼ�"�̹Ƿ� try~catch�� ���

			fos = new FileOutputStream("test.txt"); // FileOutputStream

			fos.write(10); // write() : ���Ͽ� �����͸� �� �� ����ϴ� �޼ҵ�
			fos.write(50);
			fos.close(); // close() : ��Ʈ�� ��� �� �ݾ��ִ� �޼ҵ�

		} catch (FileNotFoundException e) { 	// FileOutputStream ��ü ���� �� �߻����ɶ� ����
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // write(), close(), .. �޼ҵ� ��� �� �߻������� ����
			e.printStackTrace();
		} finally {
			// ���α׷� �߰��� ���� �߻� �� ��Ʈ���� ������ �ʴ� ��� �ݾ��ֱ� ���� �ۼ�
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {}
		}
	}
}